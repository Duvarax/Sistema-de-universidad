/*
    CursadaData
 */
package Data;

import Modelos.Alumno;
import Modelos.Inscripcion;
import Modelos.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CursadaData {

    private Connection con = null;
    private AlumnoData ad;
    private MateriaData md;

    public CursadaData(Conexion conexion) {
        con = conexion.getConexion();
        this.ad = new AlumnoData(conexion);
        this.md = new MateriaData(conexion);
    }

    public boolean guardarCursada(Inscripcion inscripcion) {
        boolean exito = false;
        try {
            String consulta = "SELECT * FROM cursada WHERE cursada.idAlumno = ? AND cursada.idMateria = ?";
            PreparedStatement x = con.prepareStatement(consulta);
            x.setInt(1, inscripcion.getAlumno().getIdAlumno());
            x.setInt(2, inscripcion.getMateria().getIdMateria());
            ResultSet s = x.executeQuery();
            if (!s.next()) {
                try {
                    String sql = "INSERT INTO cursada(idAlumno,idMateria,nota) VALUES (?, ?, ?);";
                    PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                    ps.setInt(1, inscripcion.getAlumno().getIdAlumno());
                    ps.setInt(2, inscripcion.getMateria().getIdMateria());
                    ps.setDouble(3, inscripcion.getNota());
                    ps.executeUpdate();

                    ResultSet rs = ps.getGeneratedKeys();
                    if (rs.next()) {
                        inscripcion.setId(rs.getInt("id"));
                        exito = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "No se puedo guardar la inscripcion:");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error de sintaxis:" + ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Alumno ya inscripto");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return exito;
    }

    public List<Inscripcion> obtenerCursadas() {
        ArrayList<Inscripcion> listaCursada = new ArrayList();
        try {
            String sql = "SELECT * FROM cursada";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Inscripcion inscripcion;
            while (rs.next()) {
                inscripcion = new Inscripcion();
                inscripcion.setId(rs.getInt("id"));

                Alumno a = ad.obtenerAlumnoXId(rs.getInt("idAlumno"));
                inscripcion.setAlumno(a);

                Materia m = md.obtenerMateriaXId(rs.getInt("idMateria"));
                inscripcion.setMateria(m);

                inscripcion.setNota(rs.getDouble("nota"));

                listaCursada.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener las inscripciones:" + ex);
        }
        return listaCursada;
    }

    public boolean modificarNota(Alumno alumno, Materia materia, double nota) {
        boolean exito = false;
        try {
            String sql = "UPDATE cursada SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, nota);
            ps.setInt(2, alumno.getIdAlumno());
            ps.setInt(3, materia.getIdMateria());

            int rs = ps.executeUpdate();
            if (rs != 0) {
                exito = true;
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar la nota");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return exito;
    }

    //borrar cursada
    public boolean borrarCursada(Alumno alumno, Materia materia) {
        boolean borrado = false;
        try {
            String sql = "DELETE FROM cursada WHERE cursada.idAlumno = ? AND cursada.idMateria= ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getIdAlumno());
            ps.setInt(2, materia.getIdMateria());

            int rs = ps.executeUpdate();
            if (rs != 0) {
                borrado = true;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion en BORRAR CURSADA " + ex);
        }
        return borrado;
    }

    //Dado un alumno nos devuelva las materias en las que está cursando
    public List<Inscripcion> cursadasXAlumno(Alumno alumno) {
        ArrayList<Inscripcion> listaAlumno = new ArrayList();
        try {
            String sql = "SELECT * FROM cursada where idAlumno=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getIdAlumno());
            ResultSet rs = ps.executeQuery();
            Inscripcion inscripcion;
            while (rs.next()) {
                inscripcion = new Inscripcion();

                Materia m = md.obtenerMateriaXId(rs.getInt("idMateria"));
                inscripcion.setMateria(m);
                inscripcion.setAlumno(alumno);
                inscripcion.setId(rs.getInt("id"));
                inscripcion.setNota(rs.getDouble("nota"));

                listaAlumno.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener las inscripciones:" + ex);
        }
        return listaAlumno;
    }

  
  
    //Dada una materia nos devuelva los alumnos inscriptos en ella.
    public List<Inscripcion> cursadaXMateria(Materia materia) {
        ArrayList<Inscripcion> listaMaterias = new ArrayList();
        try {
            String sql = "SELECT * FROM cursada where idMateria=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, materia.getIdMateria());
            ResultSet rs = ps.executeQuery();
            Inscripcion inscripcion;
            while (rs.next()) {
                inscripcion = new Inscripcion();

                Alumno a = ad.obtenerAlumnoXId(rs.getInt("idAlumno"));
                inscripcion.setAlumno(a);
                inscripcion.setMateria(materia);
                inscripcion.setNota(rs.getDouble("nota"));
                inscripcion.setId(rs.getInt("id"));

                listaMaterias.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener las inscripciones:" + ex);
        }
        return listaMaterias;
    }
    
      //Dado un alumno nos devuelva las materias en las que NO está inscripto

    public List<Materia> obtenerMateriasNoCursadas(Alumno alumno) {
        List<Materia> materias = new ArrayList<Materia>();
        try {
            String sql = "Select * from materia where idMateria not in (select idMateria from cursada where idAlumno = ?) AND materia.activo = 1;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getIdAlumno());
            ResultSet resultSet = ps.executeQuery();
            Materia materia;
            while (resultSet.next()) {
                materia = new Materia();
                materia.setIdMateria(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materia.setAnio(resultSet.getInt("anio"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las materias: " + ex.getMessage());
        }
        return materias;
    }
}
