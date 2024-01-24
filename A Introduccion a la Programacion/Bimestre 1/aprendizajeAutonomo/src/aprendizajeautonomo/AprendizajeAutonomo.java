/*
PROBLEMA
Crear un programa en donde se ingrese los gastos diarios en cierta cantidad de dias ingresadas por el usuario
 */
package aprendizajeautonomo;

import java.util.Scanner;

public class AprendizajeAutonomo {

    public static void main(String[] args) {
        // Declaración de variables
        double totalGastos = 0, dineroInicial, gastoDiario, dineroRestante;
        int cantidadDias;
        Scanner tecla = new Scanner(System.in);
        System.out.println("REGISTRO DE GASTOS");
        System.out.println("===================");
        // Pedir Datos
        System.out.print("Ingrese el dinero inicial que tiene: $");
        dineroInicial = tecla.nextDouble();
        System.out.print("Ingrese la cantidad de dias para registrar gastos: ");
        cantidadDias = tecla.nextInt();
        System.out.println("-------------------------------------------------");
        System.out.println("INGRESE LOS GASTOS DIARIOS");
        System.out.println("--------------------------");
        // Ciclo para ingresar gastos según la cantidad de dias indicada
        for (int dia = 1; dia <= cantidadDias; dia++) {
            System.out.print("Gasto del dia " + dia + ": $");
            gastoDiario = tecla.nextDouble();
            totalGastos += gastoDiario;
        }
        // Calcular el dinero restante
        dineroRestante = dineroInicial - totalGastos;
        if (dineroRestante >= 0) {
            System.out.println("-------------------------------------------------");
            System.out.println("El dinero restante después de " + cantidadDias + " dias es de: $" + dineroRestante);
        } else {
            System.out.println("-------------------------------------------------");
            System.out.println("HA EXCEDIDO SU LIMITE DE GASTOS");
            System.out.println("Por favor, revise sus gastos. El dinero inicial no es suficiente.");
        }
    }
}
