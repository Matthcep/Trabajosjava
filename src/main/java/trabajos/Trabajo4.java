package trabajos;
//Ejercicio 2: Lista de Compras
//Implementa un programa que permita al usuario crear una lista de compras.
// El programa debe permitir agregar elementos a la lista, mostrar la lista completa y eliminar elementos específicos.
import java.util.Scanner;
import java.util.ArrayList;

public class Trabajo4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> productos = new ArrayList<>();
        ArrayList<Double> precios = new ArrayList<>();

        System.out.println("¡Bienvenido a la lista de compras!");

        // Agregar productos y precios
        boolean agregarProductos = true;
        while (agregarProductos) {
            System.out.print("Ingrese el nombre del producto (o 'fin' para terminar): ");
            String producto = scanner.nextLine();

            if (producto.equalsIgnoreCase("fin")) {
                agregarProductos = false;
            } else {
                System.out.print("Ingrese el precio de " + producto + ": ");
                double precio = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea pendiente

                productos.add(producto);
                precios.add(precio);
            }
        }

        // Calcular el total de la cuenta
        double total = 0;
        for (double precio : precios) {
            total += precio;
        }

        // Mostrar la lista de compras y el total
        System.out.println("\nLista de compras:");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i) + ": $" + precios.get(i));
        }
        System.out.println("Total: $" + total);

        scanner.close();
    }
}
