public class Estudiante {

    private String nombre;
    private int edad;
    private double nota1;
    private double nota2;

    public Estudiante(
            String nombre,
            int edad,
            double nota1,
            double nota2
    ) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularPromedio() {
        return (nota1 + nota2) / 2;
    }

    public boolean estaAprobado() {
        return calcularPromedio() >= 11;
    }

    public void mostrarDatos() {

        System.out.println("\n===== ESTUDIANTE =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Promedio: " + calcularPromedio());

        if (estaAprobado()) {
            System.out.println("Estado: Aprobado");
        } else {
            System.out.println("Estado: Desaprobado");
        }
    }
}
