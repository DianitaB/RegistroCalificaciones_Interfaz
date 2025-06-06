package ec.edu.ups.poo.Registro_UML;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    public static Curso leerDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del curso: ");
        String nombre = sc.nextLine();
        System.out.print("(Paralelo/Grupo): ");
        String paralelo = sc.nextLine();
        Curso curso = new Curso(nombre, paralelo);

        System.out.print("¿Cuántos estudiantes ingresará?: ");
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            System.out.println("Estudiante #" + (i + 1));
            Estudiante e = Estudiante.leerDatos();
            curso.estudiantes.add(e);
        }
        return curso;
    }
    @Override
    public String toString() {
        return "Curso: " + nombre + " - " + paralelo +
                "\nEstudiantes: " + estudiantes;
    }
}
