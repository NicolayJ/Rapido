/*
Problema 01
Generar los procedimientos y/o funciones que impriman los valor pares, impares y el promedio de un arreglo bidimensional. 
El (los) procedimiento(s) o método(s) deben ser invocados desde el método principal 
(quien es el único responsable de gestionar las entradas/salidas); 
además el método debe recibir como parámetro un arreglo bidimensional.
*/
package taller11.semana11.diegojimenez;
import java.util.Random;

public class Ejercicio01 {
    public static void main(String[] args) {
        int valorfil = 3, valorcolum = 3;
        int[][] matrizA = new int[valorfil][valorcolum];
        int[][] matrizB = new int[valorfil][valorcolum];
        int[][] matrizC = new int[valorfil][valorcolum];

        llenarMatriz(matrizA, valorfil, valorcolum);
        System.out.println("Matriz Generada:");
        presentarMatriz(matrizA, valorfil, valorcolum);
        System.out.println("--------------------------------------");
        System.out.println("Los pares de la matriz son:");
        llenarPares(matrizA, matrizB, valorfil, valorcolum);
        presentarMatriz(matrizB, valorfil, valorcolum);
        System.out.println("Los impares de la matriz son:");
        llenarImpares(matrizA, matrizC, valorfil, valorcolum);
        presentarMatriz(matrizC, valorfil, valorcolum);
        System.out.println("El promedio de los valores de la matriz es: " + presentarPromedio(matrizA, valorfil, valorcolum));
    }

    static void llenarMatriz(int[][] matrizA, int valorfil, int valorcolum) {
        Random random = new Random();
        for (int i = 0; i < valorfil; i++) {
            for (int j = 0; j < valorcolum; j++) {
                matrizA[i][j] = random.nextInt(100) + 1;
            }
        }
    }

    static void presentarMatriz(int[][] matrizA, int valorfil, int valorcolum) {
        for (int i = 0; i < valorfil; i++) {
            for (int j = 0; j < valorcolum; j++) {
                System.out.print(matrizA[i][j] + "  |  ");
            }
            System.out.println();
        }
    }

    static void llenarPares(int[][] matrizA, int[][] matrizB, int valorfil, int valorcolum) {
        for (int i = 0; i < valorfil; i++) {
            for (int j = 0; j < valorcolum; j++) {
                if (matrizA[i][j] % 2 == 0) {
                    matrizB[i][j] = matrizA[i][j];
                } else {
                    matrizB[i][j] = 0;
                }
            }
        }
    }

    static void llenarImpares(int[][] matrizA, int[][] matrizC, int valorfil, int valorcolum) {
        for (int i = 0; i < valorfil; i++) {
            for (int j = 0; j < valorcolum; j++) {
                if (matrizA[i][j] % 2 != 0) {
                    matrizC[i][j] = matrizA[i][j];
                } else {
                    matrizC[i][j] = 0;
                }
            }
        }
    }

    static double presentarPromedio(int[][] matrizA, int valorfil, int valorcolum) {
        int sum = 0;
        double promedio;
        for (int i = 0; i < valorfil; i++) {
            for (int j = 0; j < valorcolum; j++) {
                sum += matrizA[i][j];
            }
        }
        promedio = sum / (valorfil * valorcolum);
        return promedio;
    }
}
/*
Matriz Generada:
39  |  82  |  73  |  
43  |  50  |  17  |  
66  |  11  |  91  |  
--------------------------------------
Los pares de la matriz son:
0  |  82  |  0  |  
0  |  50  |  0  |  
66  |  0  |  0  |  
Los impares de la matriz son:
39  |  0  |  73  |  
43  |  0  |  17  |  
0  |  11  |  91  |  
El promedio de los valores de la matriz es: 52.0
BUILD SUCCESSFUL (total time: 0 seconds)
*/