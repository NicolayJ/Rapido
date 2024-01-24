package clases;
public class matrices {
    public static void main(String[] args) {
        String[] nombAbad = {"Juan S.", "Juan D.", "Ricardo", "Carlos"};        
        int limEst = nombAbad.length, limNotas= 3;
        double matNotas[][]= new double [limEst][limNotas];
        for (int i = 0; i < limEst; i++) {
            for (int j = 0; j < limNotas; j++) {
                matNotas[i][j] = (double)(Math.random()*(9-0+1)+0);
                System.out.printf("[%d,%d]=%.2f\t",i,j,matNotas[i][j] );
            }
            System.out.println("");
        }
    }
}
