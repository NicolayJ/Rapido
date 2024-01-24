package aprendizajeautonomo;
import java.util.Scanner;
public class adivinarNumero2Borrador {
    public static void main(String[] args) {
        // Declaración de variables
        int numAdivinar, numIngresado, intentos = 10, intentosUsados = 0;
        Scanner tecla = new Scanner(System.in); // Creación de un objeto Scanner para entrada de usuario
        numAdivinar = (int) (Math.random() * 100 + 1); // Generación de un número aleatorio entre 1 y 100
        // Impresión de las instrucciones del juego
        System.out.println("BIENVENIDO A ADIVINAR EL NUMERO 2.0 \n INSTRUCCIONES: ");
        System.out.println("..."); // Instrucciones del juego
        // Bucle principal del juego
        while (intentos > 0) {
            System.out.println("Te quedan " + intentos + " intentos."); // Muestra la cantidad de intentos restantes
            System.out.print("------> Adivina el numero: ");
            numIngresado = tecla.nextInt(); // Lee el número ingresado por el usuario
            intentosUsados++;

            // Verifica si el número ingresado es igual al número a adivinar
            if (numIngresado == numAdivinar) {
                System.out.println("FELICIDADES, has adivinado el numero en " + intentosUsados + " intentos");
                break; // Termina el juego si el número es adivinado correctamente
            } else {
                System.out.print("Numero equivocado, deseas una pista? (Si/No): ");
                String quierePista = tecla.next();

                // Si el jugador quiere una pista
                if (quierePista.equalsIgnoreCase("Si")) {
                    intentos--; // Descuenta un intento por pedir una pista

                    boolean pistaMostrada = false; // Bandera para verificar si se mostró una pista

                    // Genera un número aleatorio para seleccionar una pista al azar
                    int pistaAleatoria = (int) (Math.random() * 4) + 1;

                    // Verifica las características del número ingresado y muestra una pista aleatoria
                    if (numIngresado > numAdivinar && pistaAleatoria == 1) {
                        System.out.println("Pista: El numero es menor.");
                        pistaMostrada = true;
                    }
                    if (numIngresado < numAdivinar && pistaAleatoria == 2) {
                        System.out.println("Pista: El numero es mayor.");
                        pistaMostrada = true;
                    }
                    if (numIngresado % 2 == 0 && pistaAleatoria == 3) {
                        System.out.println("Pista: El numero es par.");
                        pistaMostrada = true;
                    }
                    if (numIngresado % 2 != 0 && pistaAleatoria == 4) {
                        System.out.println("Pista: El numero es impar.");
                        pistaMostrada = true;
                    }
                    // Puedes añadir más pistas aquí si lo deseas

                    // Si ninguna pista se mostró
                    if (!pistaMostrada) {
                        System.out.println("No hay más pistas disponibles.");
                    }

                } else {
                    System.out.println("Cuidado, elige cuidadosamente tu próxima jugada.");
                    intentos--; // Descuenta un intento por rechazar la pista
                }
            }
        }
        // Si se agotan los intentos sin adivinar el número
        if (intentos == 0) {
            System.out.println("Lo siento, has agotado tus intentos.");
            System.out.println("El numero era: " + numAdivinar);
        }
        tecla.close(); // Cierra el objeto Scanner
    }
}
