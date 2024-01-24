package recuperacionprogramacion;
import java.util.Scanner;
public class Xd {
    public static void main(String[] args) {
        int diaCorte, diaIngre;
        double num, cvc, limiteCredito, dinero, monto, suma, montoA = 0, millas = 0;
        String avanzar;
        boolean decision = false;
        dinero = 0;
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de la tarjeta: ");
        num = tecla.nextInt();
        System.out.println("Ingrese el CVC: ");
        cvc = tecla.nextInt();
        
        System.out.println("=====================================");
        System.out.print("Ingrese el dia de corte: ");
        diaCorte = tecla.nextInt();
        System.out.print("Ingrese el limite de credito: $");
        limiteCredito = tecla.nextDouble();
        System.out.println("----------------DIAS-GASTADOS-------------------");
        
        while (dinero <= limiteCredito) {
            System.out.println("Ha gastado dinero en el dia (si / no):");
            avanzar = tecla.next();
            
            if (avanzar.equalsIgnoreCase("si")) {
                System.out.print("Ingrese el dia que ha realizado el gasto: ");
                diaIngre = tecla.nextInt();
                System.out.print("Escriba el monto que ha gastado en el dia " + diaIngre + " :$");
                monto = tecla.nextInt();
                montoA += monto;
            } else if (avanzar.equalsIgnoreCase("no")) {
                break;
            }
            dinero++;
        }
        millas = montoA * 1.5;
        System.out.println("Debe pagar " + montoA + " hasta " + diaCorte + "dia" );
        System.out.println("Tiene una recompensa de " + millas + " millas");
    }
}

