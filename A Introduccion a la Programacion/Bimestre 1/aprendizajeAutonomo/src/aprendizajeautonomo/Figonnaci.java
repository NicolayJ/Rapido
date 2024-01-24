package aprendizajeautonomo;
public class Figonnaci {
    public static void main(String[] args) {
        int primero = 0;
        int segundo = 1;

        System.out.println("Secuencia de Fibonacci hasta el numero 100:");

        while (primero <= 100) {
            System.out.print(primero + " ");

            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
    }
}