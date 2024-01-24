package clasesvirtuales;

/* FORMA 1
public class ClasesVirtuales {
    static int resptOperaciones; //VARIABLE GLOBAL
    
    public static void main(String[] args) {
        int nA = 4, nB=6, resptResta = 0;
        System.out.println("La suma es: " + funcionSumar(nA, nB));
        metodoRestar(nA, nB);
        System.out.println("La resta es: "+ resptOperaciones);
    }
    public static int funcionSumar(int num1, int num2){ //Funcion -> devuelve valor con RETURN 
        return num1 + num2;
    }
    public static void metodoRestar(int numA, int numB){ //Metodo
       resptOperaciones = numA - numB;
    }
}
*/
public class ClasesVirtuales {
    public static void main(String[] args) {
        int respuestas[] = new int[1];
        int nA = 4, nB=6, resptResta = 0;
        System.out.println("La suma es: " + funcionSumar(nA, nB));
        metodoRestar(nA, nB, respuestas);
        System.out.println("La resta es: "+ respuestas[0]);
        System.out.println("nA=" + nA + " nB=" + nB + " respuestas[0]=" + respuestas[0]);
    }
    public static int funcionSumar(int num1, int num2){  
        return num1 + num2;
    }
    public static void metodoRestar(int numA, int numB, int respuestas[]){
       numA = 57;
       numB = -13;
       respuestas[0] = numA - numB;
    }
}