
package Modelos;

public class Inscripcion{
    private int id;
    private Alumno alumno;
    private Materia materia;
    private double nota;

    public Inscripcion(int id, Alumno idAlumno, Materia idMateria, double nota) {
        this.id = id;
        this.alumno = idAlumno;
        this.materia = idMateria;
        this.nota = nota;
    }

    public Inscripcion(Alumno idAlumno, Materia idMateria, double nota) {
        this.alumno = idAlumno;
        this.materia = idMateria;
        this.nota = nota;
    }

    public Inscripcion() {
    }

    public int getId() {
        return id;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    
    public void setId(int id) {
        this.id = id;
    }


    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Cursada " + "id= " + id + "\n" + alumno + "\n" + materia + ", nota= " + nota;
    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 23 * hash + this.id;
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
//        final Cursada other = (Cursada) obj;
//        if (this.id != other.id) {
//            return false;
//        }
//        return true;
//    }
//    
//    
}
