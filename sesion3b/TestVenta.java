public class TestVenta {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(1, "Paco");
        Cliente cliente2 = new Cliente(2, "Ana");

        Producto producto1 = new Producto(1001, "Coca Cola", 49.5);
        Producto producto2 = new Producto(1002, "Galletas Marías", 15.99);
        Producto producto3 = new Producto(1003, "Gansito", 11.73);

        producto1.setExistencias(20);
        producto2.setExistencias(3);
        producto3.setExistencias(1);

        Venta venta1 = new Venta(cliente1);

        venta1.addProducto(producto1);
        venta1.addProducto(producto1);
        venta1.addProducto(producto3);

        venta1.describir();

        Venta venta2 = new Venta(cliente2);

        venta2.addProducto(producto2);

        venta2.describir();

    }

}
