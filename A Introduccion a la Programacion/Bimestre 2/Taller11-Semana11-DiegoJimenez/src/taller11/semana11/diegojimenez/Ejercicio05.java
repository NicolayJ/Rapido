/*
Problema 05
Generar las funciones/métodos que devuelvan las suma, resta y multiplicación de un arreglo bidimensional cuadrado; 
mismo que se lo recibe como parámetro.
*/
package taller11.semana11.diegojimenez;
import java.util.Random;

public class Ejercicio05 {
    public static void main(String[] args) {
        int valorFil = 3;
        int valorColum = 3;
        int[][] matrizA = new int[valorFil][valorColum];

        llenarMatriz(matrizA, valorFil, valorColum);
        System.out.println("Matriz Generada:");
        presentarMatriz(matrizA, valorFil, valorColum);

        System.out.println("La suma de los elementos de la matriz es: " + sumaMatriz(matrizA, valorFil, valorColum));
        System.out.println("La resta de los elementos de la matriz es: " + restarMatriz(matrizA, valorFil, valorColum));
        System.out.println("La multiplicacion de los elementos de la matriz es: " + multiplicacionMatriz(matrizA, valorFil, valorColum));
    }

    static void llenarMatriz(int[][] matriz, int valorFil, int valorColum) {
        Random random = new Random();
        for (int i = 0; i < valorFil; i++) {
            for (int j = 0; j < valorColum; j++) {
                matriz[i][j] = random.nextInt(9) + 1;
            }
        }
    }

    static void presentarMatriz(int[][] matriz, int valorFil, int valorColum) {
        for (int i = 0; i < valorFil; i++) {
            for (int j = 0; j < valorColum; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }
    }

    static int sumaMatriz(int[][] matriz, int valorFil, int valorColum) {
        int suma = 0;
        for (int i = 0; i < valorFil; i++) {
            for (int j = 0; j < valorColum; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    static int restarMatriz(int[][] matriz, int valorFil, int valorColum) {
        int resta = 0;
        for (int i = 0; i < valorFil; i++) {
            for (int j = 0; j < valorColum; j++) {
                if (i == 0 && j == 0) {
                    resta = matriz[i][j];
                } else {
                    resta -= matriz[i][j];
                }
            }
        }
        return resta;
    }

    static int multiplicacionMatriz(int[][] matriz, int valorFil, int valorColum) {
        int multiplicacion = 1;
        for (int i = 0; i < valorFil; i++) {
            for (int j = 0; j < valorColum; j++) {
                multiplicacion *= matriz[i][j];
            }
        }
        return multiplicacion;
    }
}
/*
Matriz Generada:
6 | 3 | 7 | 
2 | 4 | 7 | 
9 | 7 | 3 | 
La suma de los elementos de la matriz es: 48
La resta de los elementos de la matriz es: -36
La multiplicacion de los elementos de la matriz es: 1333584
BUILD SUCCESSFUL (total time: 0 seconds)
*/
