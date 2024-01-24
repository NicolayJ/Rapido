/*
Problema 03
Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio cualitativo de los parámetros. 
Si el promedio es: 
De 0 a 5 el promedio cualitativo es Regular 
De 5.1 a 8 el promedio es Bueno 
De 8.1 a 9 el promedio es Muy Bueno 
De 9.1 a 10 el promedio es Sobresaliente. 
A la función se la debe llamar desde un método principal. 
Los parámetros necesarios para llamar a la función, deben ser ingresados solicitados al usuario.
*/
package taller11.semana11.diegojimenez;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double param1, param2, param3, param4;
        System.out.print("Ingrese la nota del parametro 1: ");
        param1 = scanner.nextDouble();
        System.out.print("Ingrese la nota del parametro 2: ");
        param2 = scanner.nextDouble();
        System.out.print("Ingrese la nota del parametro 3: ");
        param3 = scanner.nextDouble();
        System.out.print("Ingrese la nota del parametro 4: ");
        param4 = scanner.nextDouble();
        System.out.println("El promedio cualitativo es: " + califiCuali(param1, param2, param3, param4));
    }

    static String califiCuali(double param1, double param2, double param3, double param4) {
        double prom = (param1 + param2 + param3 + param4) / 4;
        String cualit;

        if (prom <= 5) {
            cualit = "Regular";
        } else if (prom <= 8) {
            cualit = "Bueno";
        } else if (prom <= 9) {
            cualit = "Muy bueno";
        } else {
            cualit = "Sobresaliente";
        }
        return cualit;
    }
}
/*
Ingrese la nota del parametro 1: 10
Ingrese la nota del parametro 2: 8
Ingrese la nota del parametro 3: 5
Ingrese la nota del parametro 4: 9
El promedio cualitativo es: Bueno
BUILD SUCCESSFUL (total time: 8 seconds)
*/