package aprendizajeautonomo;
import java.util.Random;
import java.util.Scanner;

public class otroEjercicio {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner tecla= new Scanner(System.in);
        double noteACD, noteAPE, noteAA, total, porcentajeAprobados, porcentajeReprobados;
        String nombre, condicion;
        int cedula, contAprobados=0, contReprobados=0;
        do {
            System.out.println("Ingrese el nombre del estudiante: ");
            nombre=tecla.next();
            System.out.println("Ingres el numero de cedula: ");
            cedula=tecla.nextInt();
            System.out.println("NOTAS");
            System.out.println("-----------------------------------");
            noteACD=random.nextInt(10)+1;
            noteAPE=random.nextInt(10)+1;
            noteAA=random.nextInt(10)+1;
            total=(noteACD+noteAPE+noteAA)/3;
            System.out.println("Nota Total: "+total);
            System.out.println("--------//REPORTE//--------");
            System.out.println("--NOTAS PARA EL BIMESTRE--");
            System.out.println("Nota ACD: "+noteACD);
            System.out.println("Nota APE: "+noteAPE);
            System.out.println("Nota AA: "+noteAA);
            if (total>=7) {
                System.out.println("Nombre del Estudiante: "+ nombre + " con cédula: "+cedula +" está APROBADO");
                contAprobados++;
            }else{
                System.out.println("Nombre del Estudiante: "+ nombre + " con cédula: "+cedula +" está NO APROBADO");
                contReprobados++;
            }
            System.out.println("______________________________________");
            System.out.println("Desea ingresar un estudiante mas? (coloque si sino cualquier letra ) ");
            condicion=tecla.next().toLowerCase();
        } while (("si").equals(condicion));
        porcentajeAprobados=((contAprobados*100)/(contAprobados+contReprobados));
        porcentajeReprobados=((contReprobados*100)/(contAprobados+contReprobados));
        System.out.println("______________________________________________");
        System.out.println("El porcentaje de estudiantes aprobados es: "+porcentajeAprobados+"%");
        System.out.println("El porcentaje de estudiantes no aprobados es: "+porcentajeReprobados+"%");
    }
}
