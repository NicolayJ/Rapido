import java.util.Scanner;

public class matricesParte2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] tablero = new String[3][3];
        String turno = "X";

        // Inicializar el tablero con '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = "-";
            }
        }

        boolean jugando = true;
        while (jugando) {
            int fila = -1;
            int columna = -1;
            while (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
                System.out.println("Jugador " + turno + ", ingresa tu movimiento (fila [1-3] y columna [1-3]):");
                fila = scanner.nextInt() - 1;
                columna = scanner.nextInt() - 1;
            }

            // Verificamos si la casilla está vacía
            if (tablero[fila][columna].equals("-")) {
                tablero[fila][columna] = turno;
            } else {
                System.out.println("La casilla ya está ocupada. Intenta de nuevo.");
                continue;
            }

            for (int i = 0; i < 3; i++) {
                if (tablero[i][0].equals(turno) && tablero[i][1].equals(turno) && tablero[i][2].equals(turno)
                        || tablero[0][i].equals(turno) && tablero[1][i].equals(turno) && tablero[2][i].equals(turno)) {
                    jugando = false;
                    System.out.println("¡El jugador " + turno + " gana!");
                    break;
                }
            }
            if (tablero[0][0].equals(turno) && tablero[1][1].equals(turno) && tablero[2][2].equals(turno)
                    || tablero[0][2].equals(turno) && tablero[1][1].equals(turno) && tablero[2][0].equals(turno)) {
                jugando = false;
                System.out.println("¡El jugador " + turno + " gana!");
            }

            boolean empate = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tablero[i][j].equals("-")) {
                        empate = false;
                        break;
                    }
                }
            }
            if (empate) {
                jugando = false;
                System.out.println("¡Es un empate!");
            }

            if (turno.equals("X")) {
                turno = "O";
            } else {
                turno = "X";
            }
        }

    }
}