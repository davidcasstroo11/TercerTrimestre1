package Tema14;

public class Alumno {
    int id;
    String nombre;
    Matricula [] matriculas;
    Alumno(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }

    public Matricula[] getMatriculas() {
        return matriculas;
    }

    public String getNombre() {
        return nombre;
    }
}
