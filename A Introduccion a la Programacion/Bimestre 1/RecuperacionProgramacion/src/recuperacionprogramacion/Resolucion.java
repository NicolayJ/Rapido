package recuperacionprogramacion;

import java.util.Scanner;

public class Resolucion {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int corte = 15, cupo = 3000, dia = 0;
        double porcentaje, gastoTotal = 0, gasto = 0;
        while ((dia <= corte) && (gasto < cupo)) {
            System.out.println("---------------");
            System.out.print("Dia: ");
            dia = teclado.nextInt();
            if (dia > corte) {
                break;
            }
            System.out.print("Gasto: $");
            gasto = teclado.nextInt();
            gastoTotal += gasto;
            
            porcentaje = (gastoTotal / cupo) * 100;
            if (porcentaje >= 90 && porcentaje <= 95) {
                System.out.println("ALERTA ROJA: Estas en el 5%-10% del limite del cupo.");
            } else if (porcentaje >= 50 && porcentaje <= 60) {
                System.out.println("ALERTA AMARILLA: Estas en el 50%-60% del limite del cupo.");
            }
            if (gastoTotal > cupo) {
                System.out.println("Se ha superado el limite del cupo.");
                break;
            } else if (gastoTotal == cupo) {
                System.out.println("Ha llegado al limite del cupo");
            }
        }
    }
}