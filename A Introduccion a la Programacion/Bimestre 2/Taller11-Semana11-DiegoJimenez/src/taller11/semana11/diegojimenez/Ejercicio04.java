/*
Problema 04
Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular el valor del predio
de un bien inmueble. Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, cédula del cliente).
En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio 
y el número de kilowatios del mes. Y se genera en pantalla el siguiente reporte: 
Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10
En el procedimiento del predio se debe pedir el valor de inmueble 
y el para obtener el valor del predio se saca el 2% del valor del inmueble. 
Y se genera el siguiente reporte:
Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que pagar de predio $ 600.
En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz; 
2 se llama al procedimiento calcularPredio. 
Los datos que se necesita en cada procedimiento se los debe ingresar por teclado.
*/
package taller11.semana11.diegojimenez;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombCli, cedula;
        double valorKW, numKV, valorInmueb;

        System.out.print("Ingrese el nombre del usuario: ");
        nombCli = scanner.nextLine();
        System.out.print("Ingrese la cedula del cliente: ");
        cedula = scanner.nextLine();

        System.out.println("Ingrese la opcion que desea saber:");
        System.out.println("1. Planilla de luz");
        System.out.println("2. Predio de un bien inmueble");
        int opc = scanner.nextInt();
        System.out.println("-----------------------------------");

        switch (opc) {
            case 1 -> {
                System.out.print("Ingresar el valor del Kilovatio: ");
                valorKW = scanner.nextDouble();
                System.out.print("Ingrese el numero de Kilovatios gastados al mes: ");
                numKV = scanner.nextDouble();
                System.out.println("Reporte");
                System.out.println("Cliente " + nombCli + " con cedula " + cedula +
                        " debe pagar el valor de $" + planillaLuz(valorKW, numKV));
            }
            case 2 -> {
                System.out.print("Ingresar el valor del Inmueble: ");
                valorInmueb = scanner.nextDouble();
                System.out.println("Reporte");
                System.out.println("Cliente " + nombCli + " con cedula " + cedula +
                        " tiene un inmueble valorado en $" + valorInmueb + " y tiene que pagar de predio $" + calcPredio(valorInmueb));
            }
            default -> System.out.println("Opción no válida. Ingrese nuevamente.");
        }
    }

    static double planillaLuz(double valorKW, double numKV) {
        double valorPlanilla;
        valorPlanilla = valorKW * numKV;
        return valorPlanilla;
    }

    static double calcPredio(double valorInmueb) {
        double predio;
        predio = valorInmueb * 0.02;
        return predio;
    }
}
/*
Ingrese el nombre del usuario: Ana Contreras
Ingrese la cedula del cliente: 110011223
Ingrese la opcion que desea saber:
1. Planilla de luz
2. Predio de un bien inmueble
2
-----------------------------------
Ingresar el valor del Inmueble: 30000
Reporte
Cliente Ana Contreras con cedula 110011223 tiene un inmueble valorado en $30000.0 y tiene que pagar de predio $600.0
BUILD SUCCESSFUL (total time: 17 seconds)
*/