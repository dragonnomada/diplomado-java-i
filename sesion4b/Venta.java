public class Venta implements IPagable {

    int id;
    Cliente cliente;
    Vendedor vendedor;
    Vendible[] productos;
    Pago pago;

    public Venta(int id, Cliente cliente, Vendedor vendedor, Vendible[] productos, Pago pago) {
        this.id = id;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.productos = productos;
        this.pago = pago;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    @Override
    public Vendible[] getProductos() {
        return productos;
    }

    public Pago getPago() {
        return pago;
    }
}
