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
 
    public double calcularPromedio() {
        return (nota1 + nota2) / 2;
    }

   
    public void mostrarDatos() {
        System.out.println("\n===== ESTUDIANTE =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Promedio: " + calcularPromedio());
    }
}
