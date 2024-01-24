package repasobimestral;
import java.util.Random;
import java.util.Scanner;

public class SistemaAcademicoUtpl_2sinComentarios {

    public static void main(String[] args) {
        int totalEstudiantes, estudiantesAprobados = 0, estudiantesReprobados = 0, cedula, notas;
        double ACD, APE, AA, notaACD, notaAPE, notaAA;
        Random rand = new Random();
        Scanner tecla = new Scanner(System.in);

        System.out.println("---------->GESTION--DE--CALIFICACIONES--UTPL<----------");

        // Definición de los números asignados a nombres y materias
        int[] numerosNombres = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};
        int[] numerosMaterias = {1, 2, 3, 4, 5, 6};

        do {
            // Seleccionar aleatoriamente un número para representar el nombre
            int numeroNombre = numerosNombres[rand.nextInt(numerosNombres.length)];
            String nombre = "Nombre_" + numeroNombre;

            // Seleccionar aleatoriamente un número para representar la materia
            int numeroMateria = numerosMaterias[rand.nextInt(numerosMaterias.length)];
            String materia = "Materia_" + numeroMateria;

            cedula = 1100000000 + rand.nextInt(100000000);
            ACD = rand.nextDouble() * 10;
            APE = rand.nextDouble() * 10;
            AA = rand.nextDouble() * 10;

            notaACD = Math.round((ACD * 0.35) * 100.0) / 100.0;
            notaAPE = Math.round((APE * 0.35) * 100.0) / 100.0;
            notaAA = Math.round((AA * 0.3) * 100.0) / 100.0;

            double promedio = Math.round((notaACD + notaAPE + notaAA) * 100.0) / 100.0;

            System.out.println("----------RESULTADOS-----------");
            System.out.println("NOMBRE DEL ESTUDIANTE: " + nombre);
            System.out.println("CEDULA: " + cedula);
            System.out.println("MATERIA: " + materia);
            System.out.println("Nota ACD (3.5/10): " + notaACD);
            System.out.println("Nota APE (3.5/10): " + notaAPE);
            System.out.println("Nota AA (3/10): " + notaAA);
            System.out.println("Promedio: " + promedio);
            System.out.println("-----------------------");

            if (promedio >= 7.0) {
                System.out.println("El estudiante ha aprobado la materia.");
                estudiantesAprobados++;
            } else {
                System.out.println("El estudiante debe rendir un examen de recuperacion.");
                estudiantesReprobados++;
            }

            System.out.println("=======================================");
            System.out.println("Desea ingresar otro estudiante? (Si/No)");
            notas = tecla.next().charAt(0);

        } while (notas == 'S' || notas == 's');

        totalEstudiantes = estudiantesAprobados + estudiantesReprobados;
        System.out.println("--------->ESTADISTICA--DE--LA--MATERIA<-----------");
        System.out.println("Estudiantes aprobados: " + estudiantesAprobados);
        System.out.println("Estudiantes reprobados: " + estudiantesReprobados);
        System.out.println("Porcentaje de aprobacion: " + ((double) estudiantesAprobados / totalEstudiantes) * 100 + "%");
        System.out.println("Porcentaje de reprobacion: " + ((double) estudiantesReprobados / totalEstudiantes) * 100 + "%");
    }
}
