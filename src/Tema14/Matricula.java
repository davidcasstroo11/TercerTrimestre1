package Tema14;

public class Matricula {
    public int id;
    public Alumno alumno;
    public Asignatura asignatura;
    public Matricula(Alumno a, Asignatura asig){
        this.alumno = a;
        this.asignatura = asig;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}
