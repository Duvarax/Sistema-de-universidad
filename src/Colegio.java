/*
    Main Colegio
 */
import Data.Conexion;
import Data.AlumnoData;
import Data.CursadaData;
import Data.MateriaData;
import Modelos.Alumno;
import Modelos.Inscripcion;
import Modelos.Materia;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Colegio {

    public static void main(String[] args) {
        
        Conexion conexion = new Conexion();
        
        MateriaData md = new MateriaData(conexion);        
        AlumnoData ad = new AlumnoData(conexion);
        CursadaData cd = new CursadaData(conexion);
        
        Alumno alumno;
        Materia materia;
        
        //------------------------------ALUMNOS-----------------------------------
        
        //agregamos alumnos
        
        LocalDate fecha=LocalDate.parse("1997-01-29");
//        
//        alumno= new Alumno("Abdala","Samir",fecha,22222222,true);
//        ad.agregarAlumno(alumno);
//        
//        alumno= new Alumno("Cejas","Luciano",fecha,33333333,true);
//        ad.agregarAlumno(alumno);
//        
//        alumno= new Alumno("Duvara","Claudio",fecha,44444444,true);
//        ad.agregarAlumno(alumno);      
//             
//        alumno= new Alumno("Tello","Andrea Natalia",fecha,29265938,true);
//        ad.agregarAlumno(alumno);
        
        //modificar alumno
     
//          alumno = new Alumno(5,"Cejas","Luciano Maximiliano",fecha,39993664,true);
//          if(ad.modificarAlumno(alumno)){
//              System.out.println("Alumno modificado con exito...");
//          }else{
//              System.out.println("No se pudo modificar");
//          }
        
        //ELIMINAR ALUMNO
        
//        if (ad.borrarAlumno(alumno.getIdAlumno())) {
//            System.out.println("Alumno eliminado con exito...");
//        } else {
//            System.out.println("No se pudo elimnar el alumno");
//        }


        //ACTIVAR ALUMNO

//        ad.activarAlumno(alumno.getIdAlumno());

        
        //OBTENER ALUMNOS

//        List<Alumno> alumnos = ad.obtenerAlumnos();
//        System.out.println(alumnos);
//        
        
        //OBTENER ALUMNO XID
        
//        System.out.println(ad.obtenerAlumnoXId(alumno.getIdAlumno()));
        
        //OBTENER ALUMNO XNOMBRE
        
//        System.out.println(ad.obtenerAlumnoXDNI(alumno.getDni()));


//--------------------------------MATERIAS--------------------------------------


        //agregamos materias
        
//        materia= new Materia("Fundamentos de programacion", 1, true);
//        md.agregarMateria(materia);
//        
//        materia= new Materia("Java", 1, true);
//        md.agregarMateria(materia);
//        
//        materia= new Materia("Web 1", 1, true);
//        md.agregarMateria(materia);
//        
//        materia= new Materia("Laboratorio 1", 1, true);
//        md.agregarMateria(materia);
//        
//        materia= new Materia("Matematicas", 1, true);
//        md.agregarMateria(materia);
//        
//        materia= new Materia("Estructura de datos", 1, true);
//        md.agregarMateria(materia);

        
        //MODIFICAR MATERIA
        
//        materia= new Materia(3,"Fundamentos de programacion ", 3, true);
//        
//        if(md.modificarMateria(materia)){
//            System.out.println("Materia modificada con exito.....");
//        }else{
//            System.out.println("No se pudo modificar la materia...");
//        }
       // materia= new Materia(3,"Fundamentos de programacion ", 3, true);
        
        //md.modificarMateria(materia);


        //ELIMINAR MATERIA
        
//        md.borrarMateria(materia.getIdMateria());

        
        //ACTIVAR MATERIA

//        md.activarMateria(materia.getIdMateria());
        
        
        //OBTENER MATERIAS

        //System.out.println(md.obtenerMaterias());
               
        //OBTENER MATERIAS POR NOMBRE
        
        //System.out.println(md.obtenerMateriaXNombre(materia.getNombre()));
        
        //OBTENER MATERIA POR ID
        
        //System.out.println(md.obtenerMateriaXId(materia.getIdMateria()));
        
        
        //----------------------------CURSADA-----------------------------------
        
        //inscribir alumno
               
//        alumno = ad.obtenerAlumnoXId(16);
//        materia = md.obtenerMateriaXId(31);
//        Inscripcion inscribir = new Inscripcion(alumno, materia, 9);
//        
//        if(cd.guardarCursada(inscribir)){
//            System.out.println("La inscripcion se realizo con exito...");
//        }else{
//            System.out.println("No se pudo realizar la inscripcion...");
//        }
/*
        alumno = ad.obtenerAlumnoXId(16);
        materia = md.obtenerMateriaXId(31);
        Inscripcion inscribir = new Inscripcion(alumno, materia, 9);
        */
//        cd.guardarCursada(inscribir));

        
        //MODIFICAR NOTA
         
//        cd.modificarNota(alumno,materia,10));


        //OBTENER CURSADAS
        
        //System.out.println(cd.obtenerCursadas());
        
        //BORRAR CURSADA
        
//        cd.borrarCursada(alumno, materia));



        //MOSTRAR CURSADAS DE ALUMNO X
        
//        for (Inscripcion arg : cd.cursadasXAlumno(alumno)) {
//            System.out.println(arg);
//        }
        
        //MOSTRAR CURSADA DE MATERIA X
        
//        for (Inscripcion arg : cd.cursadaXMateria(materia)) {
//            System.out.println(arg);
//        }
        
        //MOSTRAR MATERIAS NO INSCRIPTAS DEL ALUMNO X
        
//        for (Materia arg : cd.obtenerMateriasNoCursadas(alumno)) {
//            System.out.println(arg);
//        }

    }
}
