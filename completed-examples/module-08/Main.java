import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println(" SISTEMA DE REGISTRO ESTUDIANTES ");
        System.out.println("=================================");

        Estudiante[] estudiantes = new Estudiante[3];

        int contador = 0;
        int opcion;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Mostrar aprobados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    if (contador < estudiantes.length) {

                        System.out.print("Ingrese nombre: ");
                        String nombre = sc.nextLine();

                        System.out.print("Ingrese edad: ");
                        int edad = sc.nextInt();

                        System.out.print("Ingrese nota 1: ");
                        double nota1 = sc.nextDouble();

                        System.out.print("Ingrese nota 2: ");
                        double nota2 = sc.nextDouble();

                        sc.nextLine();

                        estudiantes[contador] =
                                new Estudiante(nombre, edad, nota1, nota2);

                        contador++;

                        System.out.println("Estudiante registrado.");

                    } else {
                        System.out.println("No hay mas espacio.");
                    }

                    break;

                case 2:
                    System.out.println("\n===== LISTA DE ESTUDIANTES =====");

                    for (int i = 0; i < contador; i++) {
                        estudiantes[i].mostrarDatos();
                    }

                    break;

                case 3:
                    System.out.println("\n===== APROBADOS =====");

                    for (int i = 0; i < contador; i++) {

                        if (estudiantes[i].estaAprobado()) {
                            estudiantes[i].mostrarDatos();
                        }
                    }

                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 4);

        sc.close();
    }
}
