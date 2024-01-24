/* Ejercicios 6
Dada una matriz cuadrada y con número aleatorios únicos enteros positivos o negativos (-9-0, 0-9) generados automáticamente, 
presente los elemento de la diagonal secundaria, los ubicados sobre la diagonal secundaria, y bajo dicha diagonal.
*/
package clases;
public class equis {
    public static void main(String[] args) {
        int limMt = 5;
        int mt[][] = new int[limMt][limMt];

        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt[i].length; j++) {
                mt[i][j] = (int) (Math.random() * 19) - 9; 
            }
        }
        
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt[i].length; j++) 
                System.out.print(mt[i][j] + "\t");
            System.out.println("");
        }
        
        System.out.println("----ELEMENTOS DE LA DIAGONAL SECUNDARIA------");
        for (int i = 0; i < mt.length; i++) 
            System.out.print(mt[i][(mt.length - 1)- i] + " ");
        

        System.out.println("\n----ELEMENTOS SOBRE LA DIAGONAL SECUNDARIA------");
        for (int i = 0; i < mt.length - 1; i++) {
            for (int j = 0; j < mt[i].length - 1 - i; j++) 
                System.out.print(mt[i][j] + " ");
        }

        System.out.println("\n---ELEMENTOS DEBAJO DE LA DIAGONAL SECUNDARIA------");
        for (int i = 1; i < mt.length; i++) {
            for (int j = mt.length - i; j < mt[i].length; j++) 
                System.out.print(mt[i][j] + " ");
        }
    }
}