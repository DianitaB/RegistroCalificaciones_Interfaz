package ec.edu.ups.poo.Registro_UML;

import java.util.Scanner;

public class Asignatura {
    private String nombre;
    private String nivel;

    public Asignatura(String nombre, String nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public static Asignatura leerDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nombre de la asignatura: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese nivel (Básico/Bachillerato/Universidad): ");
        String nivel = sc.nextLine();
        return new Asignatura(nombre, nivel);
    }
    @Override
    public String toString() {
        return "Asignatura: " + nombre + " (" + nivel + ")";
    }
}
