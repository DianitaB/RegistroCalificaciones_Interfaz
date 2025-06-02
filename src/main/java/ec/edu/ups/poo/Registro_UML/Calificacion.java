package ec.edu.ups.poo.Registro_UML;

public class Calificacion {
    private double nota;
    private Asignatura asignatura;

    public Calificacion(double nota, Asignatura asignatura) {
        this.nota = nota;
        this.asignatura = asignatura;
    }
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Calificación: " + nota + " - " + asignatura;
    }
}
