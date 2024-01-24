package clases;
public class unTallerMas {
    public static void main(String[] args) {
        int limMt = 5;
        int mt[][]= new int [limMt][limMt];
        for (int i = 0; i < mt.length; i++) 
            for (int j = 0; j < mt.length; j++) 
                mt[i][j]=(i+j);
        for (int i = 0; i < mt.length; i++){
            for (int j = 0; j < mt.length; j++) 
                System.out.print(mt[i][j]+ "\t");
            System.out.println("");
       }
        System.out.println("----ELEMENTOS--DIAGONAL------"); 
        for (int i = 0; i < mt.length; i++)
            System.out.print(mt[i][i] + " ,");
    }
}