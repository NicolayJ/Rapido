package clases;
public class claseJueves01 {
    public static void main(String[] args) {
        int limPiramide = 10;
        /*for (int i = 0; i < limPiramide; i++){
            for (int j = 0; j <= i; j++)  // la i es porque los asteriscos son variables
                System.out.print("*");
            System.out.println("");
        }*/
        for (int i = 0; i < limPiramide; i++) {
            for (int j = 0; j < (limPiramide-i); j++) 
                System.out.print("*");
            System.out.println("");
            
        }
    }
}
