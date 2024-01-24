package semana10arreglos;

public class NewClass {

    public static void main(String[] args) {
        
        int limEst = 10;
        double sumaNotas = 0, promedio, notaMayor, notaMenor;
        double notasEst[] = new double[limEst];
        for (int i = 0; i < notasEst.length; i++)
            notasEst[i] = (double) (Math.random() * (9 - 0 + 1) + 0);
        System.out.println("LISTAD-DE-NOTAS--------");
        for (int i = 0; i < notasEst.length; i++) 
           System.out.printf("%s %d: %.2f \n", "Nota del Estudiante", (i+1), notasEst[i]);
        for (int i = 0; i < notasEst.length; i++) 
            sumaNotas += notasEst[i];
        promedio = sumaNotas / notasEst.length;
        
        System.out.println("===================================");
        System.out.printf("Promedio: %.2f \n", promedio);
        
        notaMayor = notasEst[0];
        notaMenor = notasEst[0];
        for (int i = 1; i < notasEst.length; i++) {
            //notaMayor = (notasEst[i] > notaMayor) ? notasEst[i]:notasEst[i-1] ;
            if (notasEst[i] > notaMayor)
                notaMayor = notasEst[i];
            //notaMenor = (notasEst[i] > notaMenor) ? notasEst[i]:notasEst[i-1] ;
            if (notasEst[i] < notaMenor)
                notaMenor = notasEst[i];
        }
        System.out.printf("Nota mayor: %.2f \n", notaMayor);
        System.out.printf("Nota menor: %.2f \n", notaMenor);
        System.out.println("=============================");
        System.out.println("Estudiantes Mayor Al promedio");
        //presentar el listado del estudiante que esten mayor al promedio
        for (int i = 0; i < notasEst.length; i++) {
            if (notasEst[i] > promedio)
                System.out.printf("Estudiante %d: %.2f\n", (i + 1), notasEst[i]);
        }
    }
}
