package ec.edu.ups.poo.Registro_UML;

import java.util.Scanner;

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
    public static Calificacion leerDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la nota: ");
        double nota = sc.nextDouble();
        sc.nextLine();
        Asignatura asignatura = Asignatura.leerDatos();
        return new Calificacion(nota, asignatura);
    }
    @Override
    public String toString() {
        return "Calificación: " + nota + " - " + asignatura;
    }
}
