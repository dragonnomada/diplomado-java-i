public interface IPagable {

    int getId();
    Cliente getCliente();
    Producto[] getProductos();

}

// IPagable pagable = venta
// IPagable pagable = ventaTienda
// IPagable pagable = ventaLinea

// pagable.getId()
// pagable.getCliente()
// pagable.getProductos()
