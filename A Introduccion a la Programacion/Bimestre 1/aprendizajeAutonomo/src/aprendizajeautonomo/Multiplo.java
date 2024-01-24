package aprendizajeautonomo;
import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número para verificar si es múltiplo de N: ");
        int numero = scanner.nextInt();

        int n = 5; // Aquí puedes cambiar el número por el que quieres verificar si es múltiplo

        if (numero % n == 0) {
            System.out.println(numero + " es múltiplo de " + n);
        } else {
            System.out.println(numero + " no es múltiplo de " + n);
        }

        scanner.close();
    }
}
