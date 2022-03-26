public interface IPagable {

    int getId();
    Cliente getCliente();
    Vendible[] getProductos();

}

// IPagable pagable = venta
// IPagable pagable = ventaTienda
// IPagable pagable = ventaLinea

// pagable.getId()
// pagable.getCliente()
// pagable.getProductos()
