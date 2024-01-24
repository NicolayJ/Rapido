/*
Problema 02
Generar una solución que implemente 3 procedimientos. 
Que permitan calcular el área de un cuadrado, área de un triángulo y área de un rectángulo. 
Cada procedimiento/función debe recibir los datos necesarios y generar el valor correspondiente. 
Se debe invocar a los procedimientos desde un método principal; 
Si el usuario ingresa 
1 se llama al procedimiento obtenerAreaCuadrado; 
2 se llama al procedimiento obtenerAreaTriangulo; 
3 se llama al procedimiento obtenerAreaCuadrado.
El área del cuadrado es igual a lado x lado x lado x lado
El área del triángulo es igual a (base x altura)/2
El área del rectángulo es igual a base x altura
*/
package taller11.semana11.diegojimenez;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcNum;
        double lado, baseTri, alturaTri, baseRec, alturaRec;

        System.out.println("Escoga la opcion a calcular:");
        System.out.println("1. Area de un Cuadrado");
        System.out.println("2. Area de un Triangulo");
        System.out.println("3. Area de un Rectangulo");
        opcNum = scanner.nextInt();
        System.out.println("-------------------------------");

        switch (opcNum) {
            case 1 -> {
                System.out.println("Ingrese el lado del cuadrado:");
                lado = scanner.nextDouble();
                System.out.println("El area del cuadrado es: " + areaCuadrado(lado));
            }
            case 2 -> {
                System.out.println("Ingrese la base del triangulo:");
                baseTri = scanner.nextDouble();
                System.out.println("Ingrese la altura del triangulo:");
                alturaTri = scanner.nextDouble();
                System.out.println("El area del triangulo es: " + areaTriangulo(baseTri, alturaTri));
            }
            case 3 -> {
                System.out.println("Ingrese la base del rectangulo:");
                baseRec = scanner.nextDouble();
                System.out.println("Ingrese la altura del rectangulo:");
                alturaRec = scanner.nextDouble();
                System.out.println("El area del rectangulo es: " + areaRectangulo(baseRec, alturaRec));
            }
            default -> System.out.println("El rango de opciones es de 1 al 3. Ingrese nuevamente.");
        }
    }

    static double areaCuadrado(double lado) {
        double areaTotal;
        areaTotal = lado * lado;
        return areaTotal;
    }
    static double areaTriangulo(double baseTri, double alturaTri) {
        double areaTotal;
        areaTotal = (baseTri * alturaTri) / 2;
        return areaTotal;
    }
    static double areaRectangulo(double baseRec, double alturaRec) {
        double areaTotal;
        areaTotal = baseRec * alturaRec;
        return areaTotal;
    }
}
/*
Escoga la opcion a calcular:
1. Area de un Cuadrado
2. Area de un Triangulo
3. Area de un Rectangulo
2
-------------------------------
Ingrese la base del triangulo:
4
Ingrese la altura del triangulo:
12
El area del triangulo es: 24.0
BUILD SUCCESSFUL (total time: 12 seconds)
*/