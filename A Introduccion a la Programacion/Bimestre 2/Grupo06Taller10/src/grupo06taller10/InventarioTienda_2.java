/*
 Ejercicio 2
Crea un programa que gestione el inventario de una tienda. Utiliza una matriz bidimensional para almacenar 
los productos disponibles en la tienda, con información como nombre, precio y cantidad.
El programa debe permitir agregar nuevos productos, actualizar existencias, buscar productos y eliminarlos.
 */
import java.util.Scanner;

public class InventarioTienda_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] productos = new String[100][3];
        String respuesta;
        int indiceProducto = 0;
        do {
            System.out.println("Ingrese el nombre del producto:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el precio del producto:");
            String precio = scanner.nextLine();
            System.out.println("Ingrese la cantidad del producto:");
            String cantidad = scanner.nextLine();
            
            productos[indiceProducto][0] = nombre;
            productos[indiceProducto][1] = precio;
            productos[indiceProducto][2] = cantidad;
            indiceProducto++;

            System.out.println("¿Desea agregar otro producto? (si/no)");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("Ingrese el nombre del producto que desea buscar:");
        String nombreBuscado = scanner.nextLine();
        for (int i = 0; i < productos.length; i++) {
            if (productos[i][0] != null && productos[i][0].equals(nombreBuscado)) {
                System.out.println("Nombre| Precio| Cantidad ");
                System.out.println(productos[i][0] + "|\t" + productos[i][1] + "\t|" + productos[i][2]);
                break;
            }
        }

        System.out.println("Ingrese el nombre del producto que desea actualizar:");
        String nombreActualizado = scanner.nextLine();
        for (int i = 0; i < productos.length; i++) {
            if (productos[i][0] != null && productos[i][0].equals(nombreActualizado)) {
                System.out.println("Ingrese el nuevo precio del producto:");
                productos[i][1] = scanner.nextLine();
                System.out.println("Ingrese la nueva cantidad del producto:");
                productos[i][2] = scanner.nextLine();
                break;
            }
        }

        System.out.println("Ingrese el nombre del producto que desea eliminar:");
        String nombreEliminado = scanner.nextLine();
        for (int i = 0; i < productos.length; i++) {
            if (productos[i][0] != null && productos[i][0].equals(nombreEliminado)) {
                productos[i][0] = null;
                productos[i][1] = null;
                productos[i][2] = null;
                System.out.println("Producto eliminado.");
                break;
            }
        }
    }
}