package borradorproyecto;
import java.util.HashMap;
import java.util.Map;

public class BorradorProyecto {

    // Definición de constantes
    private static final double TARIFA_ENTRADA_NORMAL = 10.00;
    private static final double TARIFA_ENTRADA_ESPECIAL = 20.00;
    private static final double DESCUENTO_PROMOCION = 5.00;

    // Estructura de datos para boletos y asistencia
    private static class Boletos {
        int cantidadEntradasNormales = 0;
        int cantidadEntradasEspeciales = 0;
    }

    private static class Asistencia {
        Map<String, Integer> asistenciaFuncionesEspeciales = new HashMap<>();
    }

    // Variables globales
    private static Boletos boletos = new Boletos();
    private static Asistencia asistencia = new Asistencia();

    // Función para la compra de boletos
    public static void comprarBoletos(int cantidadNormales, int cantidadEspeciales, String fecha) {
        if (fecha.compareTo("30-08-2024") >= 0 && fecha.compareTo("08-09-2024") <= 0) {
            boletos.cantidadEntradasNormales += cantidadNormales;
            boletos.cantidadEntradasEspeciales += cantidadEspeciales;
        } else {
            System.out.println("La fecha de compra está fuera del rango de la feria.");
        }
    }

    // Función para calcular el monto a pagar por cada tipo de entrada
    public static double calcularMontoPagar() {
        double montoTotal = boletos.cantidadEntradasNormales * TARIFA_ENTRADA_NORMAL;
        montoTotal += boletos.cantidadEntradasEspeciales * TARIFA_ENTRADA_ESPECIAL;
        // Aplicar descuento por promoción en funciones especiales
        montoTotal -= DESCUENTO_PROMOCION * boletos.cantidadEntradasEspeciales;
        return montoTotal;
    }

    // Función para registrar la asistencia a funciones especiales
    public static void registrarAsistencia(String fecha, int cantidadPersonas) {
        if (fecha.compareTo("30-08-2024") >= 0 && fecha.compareTo("08-09-2024") <= 0) {
            asistencia.asistenciaFuncionesEspeciales.put(fecha, cantidadPersonas);
        } else {
            System.out.println("La fecha de asistencia está fuera del rango de la feria.");
        }
    }

    // Función para generar estadísticas finales
    public static void generarEstadisticas() {
        int totalVisitantes = asistencia.asistenciaFuncionesEspeciales.values().stream().mapToInt(Integer::intValue).sum();
        double gananciasGeneradas = calcularMontoPagar();

        System.out.println("Afluencia total de visitantes: " + totalVisitantes);
        System.out.println("Ganancias generadas: " + gananciasGeneradas);
        System.out.println("Asistencia por día: " + asistencia.asistenciaFuncionesEspeciales);
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        comprarBoletos(5, 3, "02-09-2024");
        comprarBoletos(2, 1, "05-09-2024");

        registrarAsistencia("02-09-2024", 80);
        registrarAsistencia("05-09-2024", 120);

        generarEstadisticas();
    }
}
