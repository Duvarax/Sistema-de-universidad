package Data;

import Modelos.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MateriaData {

    private Connection con = null;

    public MateriaData(Conexion conexion) {

        con = conexion.getConexion();

    }

    public boolean agregarMateria(Materia materia) {

        boolean insert = true;
        String sql = "INSERT INTO materia (nombre, anio, activo)  VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isActivo());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
            } else {

                insert = false;
            }

            ps.close();
        } catch (SQLException ex) {
            insert = false;
            if (ex instanceof java.sql.SQLIntegrityConstraintViolationException) {
                JOptionPane.showMessageDialog(null, "La materia ya existe ");
            } else {

                JOptionPane.showMessageDialog(null, "Error de sintaxis " + ex);

            }

        }
        return insert;
    }

    public List<Materia> obtenerMaterias() {
        ArrayList<Materia> materias = new ArrayList<Materia>();

        try {
            String sql = "SELECT * FROM materia WHERE activo = 1;";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet resultSet = ps.executeQuery();
            Materia materia;
            while (resultSet.next()) {
                materia = new Materia();
                materia.setIdMateria(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materia.setAnio(resultSet.getInt("anio"));
                materia.setActivo(resultSet.getBoolean("activo"));

                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener materias");
        }

        return materias;
    }

    public Materia obtenerMateriaXId(int id) {

        Materia materia = null;

        try {
            String sql = "SELECT * FROM materia WHERE idMateria = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                materia = new Materia();
                materia.setIdMateria(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materia.setAnio(resultSet.getInt("anio"));
                materia.setActivo(resultSet.getBoolean("activo"));

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener materias");
        }

        return materia;
    }

    public Materia obtenerMateriaXNombre(String nombre) {

        Materia materia = null;

        try {
            String sql = "SELECT * FROM materia WHERE nombre LIKE ? AND activo = 1;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                materia = new Materia();
                materia.setIdMateria(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materia.setAnio(resultSet.getInt("anio"));
                materia.setActivo(resultSet.getBoolean("activo"));

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener materia");
        }

        return materia;
    }

    
    public boolean borrarMateria(int id) {

        
        boolean borrado = false;
        String sql = "DELETE FROM `materia` WHERE `idMateria` = ?";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            if (ps.executeUpdate() != 0) {

                borrado = true;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sintaxis ");
        }

        return borrado;
    }

    public boolean modificarMateria(Materia materia) {

        String sql = "UPDATE materia SET nombre = ?, anio = ?, activo = ? WHERE idMateria = ?";
        boolean modificado = false;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isActivo());
            ps.setInt(4, materia.getIdMateria());

            if (ps.executeUpdate() != 0) {

                modificado = true;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sintaxis ");
        }
        return modificado;
    }

    public boolean activarMateria(int idMateria) {
        String sql = "UPDATE materia SET  activo = 1 WHERE idMateria = ?";
        boolean activado = false;
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idMateria);

            if (ps.executeUpdate() != 0) {

                activado = true;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde activar materia ");
        }
        return activado;

    }

    
}
