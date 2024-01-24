package semana10arreglos;
import java.util.Scanner;

public class Semana10Arreglos {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        // Declaracion de variables
        int limEst = 3;
        double suma = 0, promedio;
        double notasEst[] = new double[limEst];

        for (int i = 0; i < notasEst.length; i++) { 
            System.out.print("Nota [" + (i + 1) + "]: ");
            notasEst[i] = tecla.nextDouble();
            suma += notasEst[i];
        }
        
        promedio = suma / notasEst.length;
        double notaMayor = notasEst[0];
        double notaMenor = notasEst[0];

        for (int i = 1; i < notasEst.length; i++) {
            if (notasEst[i] > notaMayor)
                notaMayor = notasEst[i];
            if (notasEst[i] < notaMenor)
                notaMenor = notasEst[i];
        }

        System.out.println("NOTAS INGRESADAS");
        for (int i = 0; i < notasEst.length; i++) {
            System.out.println("Nota [" + (i + 1) + "]: " + notasEst[i]);
        }
        System.out.println("El promedio del curso es: " + promedio);
        System.out.println("La nota mayor es: " + notaMayor);
        System.out.println("La nota menor es: " + notaMenor);
    }
}
