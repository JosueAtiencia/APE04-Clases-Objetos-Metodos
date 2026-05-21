public class Estudiante {

    // Atributos privados
    private String cedula;
    private String nombre;
    private String apellido;

    private double nota1;
    private double nota2;
    private double nota3;

    private double promedio;

    // Constructor
    public Estudiante(String cedula, String nombre, String apellido,
                       double nota1, double nota2, double nota3) {

        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;

        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;

        calcularPromedio();
    }

    // Métodos get
    public double getPromedio() {
        return promedio;
    }

    // Método calcular promedio
    public void calcularPromedio() {

        promedio = (nota1 + nota2 + nota3) / 3;
    }

    // Método determinar estado
    public String determinarEstado() {

        if (promedio >= 7) {
            return "APROBADO";
        } else {
            return "REPROBADO";
        }
    }

    // Mostrar información
    public void mostrarInformacion() {

        System.out.println("\n===== ESTUDIANTE =====");

        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);

        System.out.println("Promedio: " + promedio);
        System.out.println("Estado: " + determinarEstado());
    }
}