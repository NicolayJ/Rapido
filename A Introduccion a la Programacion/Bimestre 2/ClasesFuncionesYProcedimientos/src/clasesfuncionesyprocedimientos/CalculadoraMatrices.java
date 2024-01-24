package clasesfuncionesyprocedimientos;
public class CalculadoraMatrices {
    public static void main(String[] args) {
        int limF=3, limC =3;
        int matriz1[][] = new int [limF][limC];
        int matriz2[][] = new int [limF][limC];
        int matriz3[][] = new int [limF][limC];
        generarMatriz(matriz1, limF, limC);
        generarMatriz(matriz2, limF, limC);
        System.out.println("LA MATRIZ 1 GENERADA ES: \n"+ devolverMatriz(matriz1, limF, limC));
        System.out.println("LA MATRIZ 2 GENERADA ES: \n"+ devolverMatriz(matriz2, limF, limC));
        System.out.println("=======================================================");
        sumarMatrices(matriz1, matriz2, matriz3, limF, limC);
        System.out.println("LA SUMA DE LAS 2 MATRICES ES: \n"+ devolverMatriz(matriz3, limF, limC));
        restarMatrices(matriz1, matriz2, matriz3, limF, limC);
        System.out.println("LA RESTA DE LAS 2 MATRICES ES: \n"+ devolverMatriz(matriz3, limF, limC));
    }
    public static void generarMatriz(int matriz[][], int limiF, int limiC){
        for (int i = 0; i < limiF; i++) 
            for (int j = 0; j < limiF; j++) 
                matriz[i][j] = (int)(Math.random()*(9-0+1)+0);
    }
    public static String devolverMatriz(int matriz[][], int limiF, int limiC){
        String cadena="";
        for (int i = 0; i < limiF; i++){ 
            for (int j = 0; j < limiF; j++)
                cadena += String.format("%d \t", matriz[i][j]);   //"%d\t"   %d(char)9
            cadena+= "\n"; // cadena += " /n";
        }    
        return cadena;        
    }
    public static void sumarMatrices(int matrizA[][],int matrizB[][], int matrizC[][], int limiF, int limiC){
        for (int i = 0; i < limiF; i++) 
            for (int j = 0; j < limiF; j++) 
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
        
    }
    public static void restarMatrices(int matrizA[][],int matrizB[][], int matrizC[][], int limiF, int limiC){
        for (int i = 0; i < limiF; i++) 
            for (int j = 0; j < limiF; j++) 
                matrizC[i][j] = matrizA[i][j] - matrizB[i][j];
        
    }
}