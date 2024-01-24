package clasesfuncionesyprocedimientos;
import java.util.Scanner;
public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        double num1, num2, respt;
        System.out.println("Deme 2 numeros: ");
        num1 = tecla.nextDouble();
        num2 = tecla.nextDouble();
        System.out.println("La suma es: "+ sumarNumeros(num1, num2));
        respt = restarNumeros(num1, num2);
        System.out.println("La resta es: "+ respt);
        respt = multiplicarNumeros(num1, num2);
        System.out.println("La multiplicacion es: "+ respt);
        System.out.println("La suma recargada es: "+ sumarNumeros((int)num1, (int)num2));
    }
    public static double sumarNumeros(double num1, double num2){
        double respt;
        respt = num1 + num2;
        return respt;
    }
    public static int sumarNumeros(int num1, int num2){
        int respt;
        respt = num1 + num2;
        return respt;
    }
    public static double restarNumeros(double num1, double num2){
        double respt;
        respt = num1 - num2;
        return respt;
    }
    public static double multiplicarNumeros(double num1, double num2){
        double respt;
        respt = num1 * num2;
        return respt;
    }
}
