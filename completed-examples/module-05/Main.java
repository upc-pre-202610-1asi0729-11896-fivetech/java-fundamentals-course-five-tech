
public class Main {

    public static void saludar(String nombre) {
        System.out.println("Hola " + nombre);
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        saludar("Juan");
        saludar("María");
        saludar("Carlos");
        int resultado = sumar(5, 3);
        System.out.println("5 + 3 = " + resultado);
    }
}
