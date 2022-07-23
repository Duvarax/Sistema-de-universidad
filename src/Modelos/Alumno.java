
package Modelos;

import java.time.LocalDate;

public class Alumno {
    private int idAlumno;
    private String apellido;
    private String nombre;
    private LocalDate fechNac;
    private long dni;
    private boolean activo;
   
    //Constructor +ID
    public Alumno(int idAlumno, String apellido, String nombre, LocalDate fechNac, long dni, boolean activo) {
        this.idAlumno = idAlumno;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechNac = fechNac;
        this.dni = dni;
        this.activo = activo;
    }
    //Constructor -ID
    public Alumno(String apellido, String nombre, LocalDate fechNac, long dni, boolean activo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechNac = fechNac;
        this.dni = dni;
        this.activo = activo;
    }
    //Constructor vacio
    public Alumno() {
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechNac() {
        return fechNac;
    }

    public void setFechNac(LocalDate fechNac) {
        this.fechNac = fechNac;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return idAlumno + " - " + nombre + " " + apellido;
    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 67 * hash + this.idAlumno;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Alumno other = (Alumno) obj;
//        if (this.idAlumno != other.idAlumno) {
//            return false;
//        }
//        return true;
//    }
    
    
    
    
}
