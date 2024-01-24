package recuperacionprogramacion;
import java.util.Scanner;
public class RecuperacionProgramacion{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int corte = 15, cupo = 3000, dia = 0, gasto = 0, gastoTotal = 0;
        double porcentajeDeuda; 

        while ((dia <= corte) && (gasto < cupo)) {
            System.out.println("Dia: ");
            dia = teclado.nextInt();

            if (dia > corte)
                break;

            System.out.println("Gasto: ");
            gasto = teclado.nextInt();
            gastoTotal += gasto;
            porcentajeDeuda = ((double) gastoTotal / cupo) * 100; // Cálculo corregido

            if (porcentajeDeuda >= 90 && porcentajeDeuda <= 100) {
                System.out.println("Alerta: Estás en el 90%-100% del límite de endeudamiento.");
            } else if (porcentajeDeuda >= 50 && porcentajeDeuda <= 60) {
                System.out.println("Alerta: Estás en el 50%-60% del límite de endeudamiento.");
            }
        }
    }
}