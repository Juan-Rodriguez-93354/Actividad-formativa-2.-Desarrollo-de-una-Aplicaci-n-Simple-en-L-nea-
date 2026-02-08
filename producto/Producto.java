package producto;

class Producto {
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método para mostrar información
    public void mostrarResumen() {
        System.out.println("\n--- Producto Registrado ---");
        System.out.println("Nombre: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }
}