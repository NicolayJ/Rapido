
package proyecto_prueba;
import java.util.Scanner;
public class RangoDeNotas {
    public static void main(String[] args) {
        int nota;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la nota: ");
        nota = teclado.nextInt();
        if (nota >= 90)
            System.out.println("A");
        else
            if (nota >= 80)
                System.out.println("B");
            else
                if (nota >= 70)
                    System.out.println("C");
                else 
                    System.out.println("D");
    }
}