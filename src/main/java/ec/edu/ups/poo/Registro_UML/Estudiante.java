package ec.edu.ups.poo.Registro_UML;
import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String cedula;
    private String nombre;
    private String apellido;
    private List<Calificacion> calificaciones;

    public Estudiante(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificaciones = new ArrayList<>();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void agregarCalificacion(Calificacion c) {
        calificaciones.add(c);
    }

    public List<Calificacion> getCalificaciones() { return calificaciones; }

    @Override
    public String toString() {
        return "Estudiante: " + nombre + " " + apellido + " Cedula: " + cedula +
                "\nCalificaciones: " + calificaciones;
    }
}
