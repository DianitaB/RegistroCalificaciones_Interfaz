package ec.edu.ups.poo.Registro_UML;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private String paralelo;
    private List<Estudiante> estudiantes;

    public Curso(String nombre, String paralelo) {
        this.nombre = nombre;
        this.paralelo = paralelo;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public List<Estudiante> getEstudiantes() { return estudiantes; }

    @Override
    public String toString() {
        return "Curso: " + nombre + " - " + paralelo +
                "\nEstudiantes: " + estudiantes;
    }
}
