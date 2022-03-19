import java.util.ArrayList;
import java.util.List;

public class Venta {

    private Cliente cliente;
    private List<Producto> productos; // null

    public Venta(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>(); // !!! inicializar todos los atributos
    }

    public void addProducto(Producto producto) {
        if (producto.getExistencias() <= 0) {
            System.out.println("No hay existencias del producto");
            producto.describir();
            return; // Termino la función
        }

        this.productos.add(producto);
    }

    public double getTotal() {
        double total = 0.0;

        for (Producto producto : this.productos) {
            total += producto.getPrecio(); // total = total + producto.getPrecio()
        }

        return total;
    }

    public void describir() {
        System.out.println("Venta:");
        System.out.println("--------------------------------");
        this.cliente.describir();
        System.out.println("--------------------------------");
        for (Producto producto : this.productos) {
            producto.describir();
        }
        System.out.println("--------------------------------");
        System.out.printf("Total: $%.2f\n\n", this.getTotal());
    }

}

/*
        // FORMA 1 - Índice
        for (int i = 0; i < this.productos.size(); i++) {
            Producto producto = this.productos.get(i);
            // ...
        }

        // FORMA 2 - Elemento
        for (Producto producto : this.productos) {
            // ...
        }
 */
