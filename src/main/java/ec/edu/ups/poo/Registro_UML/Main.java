package ec.edu.ups.poo.Registro_UML;

public class Main {
    public static void main(String[] args) {
        Curso curso = Curso.leerDatos();
        System.out.println("\nResumen del Curso:");
        System.out.println(curso);
    }
}
