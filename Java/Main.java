import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Estudiante[] estudiantes = new Estudiante[5];

        String cedula;
        String nombre;
        String apellido;

        double nota1;
        double nota2;
        double nota3;

        int aprobados = 0;
        int reprobados = 0;

        // Registro estudiantes
        for (int i = 0; i < 5; i++) {

            System.out.println("\n===== ESTUDIANTE "
                    + (i + 1) + " =====");

            System.out.print("Ingrese cedula: ");
            cedula = sc.nextLine();

            System.out.print("Ingrese nombre: ");
            nombre = sc.nextLine();

            System.out.print("Ingrese apellido: ");
            apellido = sc.nextLine();

            // Nota 1
            do {

                System.out.print("Ingrese nota 1: ");
                nota1 = sc.nextDouble();

                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota invalida.");
                }

            } while (nota1 < 0 || nota1 > 10);

            // Nota 2
            do {

                System.out.print("Ingrese nota 2: ");
                nota2 = sc.nextDouble();

                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota invalida.");
                }

            } while (nota2 < 0 || nota2 > 10);

            // Nota 3
            do {

                System.out.print("Ingrese nota 3: ");
                nota3 = sc.nextDouble();

                if (nota3 < 0 || nota3 > 10) {
                    System.out.println("Nota invalida.");
                }

            } while (nota3 < 0 || nota3 > 10);

            sc.nextLine();

            // Crear objeto
            estudiantes[i] = new Estudiante(
                    cedula,
                    nombre,
                    apellido,
                    nota1,
                    nota2,
                    nota3
            );

            // Contadores
            if (estudiantes[i].getPromedio() >= 7) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        // Mostrar estudiantes
        System.out.println("\n===== LISTADO =====");

        for (int i = 0; i < 5; i++) {

            estudiantes[i].mostrarInformacion();
        }

        // Resultados
        System.out.println("\n===== RESULTADOS =====");

        System.out.println("Aprobados: "
                + aprobados);

        System.out.println("Reprobados: "
                + reprobados);

        sc.close();
    }
}