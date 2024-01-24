package clasesvirtuales;
public class BaseEjercicio1DelProyecto {
    public static void main(String[] args) {
        int limPostulantes = 50, limDatos = 2;
        String matrizDatosPostulantes[][] = new String[limPostulantes][limDatos];
        generarNombPostulantes(matrizDatosPostulantes);
        generarCarrPostulantes(matrizDatosPostulantes);
        System.out.println("NOMBRES\t\t| CARRERAS");
        devolverData(matrizDatosPostulantes);
    }
    public static void generarNombPostulantes(String matrizDatosPostulantes[][]) {
        String nombPostulantes[] = {"Isabella", "Gabriel", "Sophia", "Mateo", "Olivia", "Luis", "Ava", "Daniel", "Mia", "Alejandro", "Emma", "Lucas", "Valentina", "Adrian", "Camila", "Eduardo", "Julia", "Sebastian", "Victoria", "Carlos"};
        String apelPostulantes[] = {"Gonzalez", "Martinez", "Rodriguez", "Perez", "Fernandez", "Lopez", "Gomez", "Diaz", "Torres", "Vasquez", "Hernandez", "Ramirez", "Sanchez", "Castillo", "Rojas", "Ruiz", "Mendoza", "Jimenez", "Alvarez", "Moreno"};

        for (int i = 0; i < matrizDatosPostulantes.length; i++) {
            int indAleat_Nom = (int) (Math.random() * (nombPostulantes.length - 1 + 1));
            int indAleat_Ape = (int) (Math.random() * (apelPostulantes.length - 1 + 1));
            matrizDatosPostulantes[i][0] = nombPostulantes[indAleat_Nom] + " " + apelPostulantes[indAleat_Ape];
        }
    }
    public static void generarCarrPostulantes(String matrizDatosPostulantes[][]) {
        String nombCarrera[] = {"Quimica, Fisio, Medicina"};
        for (int i = 0; i < matrizDatosPostulantes.length; i++) {
            int indAleat_Carr = (int) (Math.random() * (nombCarrera.length - 1 + 1));
            matrizDatosPostulantes[i][1] = nombCarrera[indAleat_Carr] ;
        }
    }
    public static void devolverData(String matrizDatosPostulantes[][]) { //Es devolver porque este metodo no presenta sino devuelve
        for (int i = 0; i < matrizDatosPostulantes.length; i++) {
            System.out.printf("%s\t|  %s\n", matrizDatosPostulantes[i][0], matrizDatosPostulantes[i][1]);
        }
    }
}
