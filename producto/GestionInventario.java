package producto;
import java.util.Scanner;

public class GestionInventario {
    public static void main(String[] args) {
        // Creamos el objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos productos desea registrar? ");
        int cantidadProductos = teclado.nextInt();
        teclado.nextLine(); // Limpiar el buffer

        // Arreglo para almacenar los objetos creados
        Producto[] inventario = new Producto[cantidadProductos];

        // Ciclo para AGREGAR DATOS e INSTANCIAR objetos
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("\nCapturando datos " + (i + 1) + ":");
            
            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Precio: ");
            double precio = teclado.nextDouble();

            System.out.print("Stock inicial: ");
            int stock = teclado.nextInt();
            teclado.nextLine(); // Limpiar el buffer después de un número

            // INSTANCIACIÓN: Creamos el objeto con los datos recibidos
            inventario[i] = new Producto(nombre, precio, stock);
        }

        // PRUEBA DE MÉTODOS: Mostramos lo que se guardó
        System.out.println("\n***** INVENTARIO FINAL *****");
        for (Producto p : inventario) {
            p.mostrarResumen();
        }

        teclado.close(); // Cerramos el scanner
    }
}