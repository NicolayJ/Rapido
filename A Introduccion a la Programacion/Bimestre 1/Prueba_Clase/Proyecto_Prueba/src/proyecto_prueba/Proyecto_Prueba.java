package proyecto_prueba;
import java.util.Scanner;
public class Proyecto_Prueba {
    public static void main(String[] args) {
        int numA, numB, numC, max;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        numA = teclado.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        numB = teclado.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        numC = teclado.nextInt();
        if (numA > numB)
            max = numA;
        else
            max = numB;
        if (max > numC)
            System.out.println("El mayor es: " + max);
        else 
            System.out.println("El mayor es: " + numC);
    }
}