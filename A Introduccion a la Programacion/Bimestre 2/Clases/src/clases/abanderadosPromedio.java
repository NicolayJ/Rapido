/*for (String nombreAbanderado : nombAbanderado) {
            System.out.println(nombreAbanderado);
        }
        for(double nota : notas)
            sumaPromedios += nota;
        System.out.print("Promedio: " + (sumaPromedios/notas.length));*/
package clases;
public class abanderadosPromedio {
    public static void main(String[] args) {
        
        String[] nombAbanderado = {"Juan S.", "Juan D.", "Ricardo", "Carlos"};
        double notas[] = {10, 9.99, 9.98, 9.97};
        double sumaPromedios = 0, promedio;
        
        for (int i = 0; i < notas.length ; i++) 
            sumaPromedios += notas[i];
        System.out.println("NOMBRES\t| NOTAS");
        
        for (int i = 0; i < notas.length; i++)
            System.out.printf("%s \t|%.2f\n", nombAbanderado[i], notas[i]);
        promedio = (sumaPromedios/notas.length);
        System.out.printf("SU PROMEDIO ES: %.2f\n "+ promedio);
    }              
}
