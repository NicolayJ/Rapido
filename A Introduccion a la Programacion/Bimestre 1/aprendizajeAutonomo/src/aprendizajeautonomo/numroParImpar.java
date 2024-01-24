package aprendizajeautonomo;
import java.util.Scanner;
public class numroParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero:");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " es un numero par.");
        } else {
            System.out.println(numero + " es un numero impar.");
        }
    }
}
