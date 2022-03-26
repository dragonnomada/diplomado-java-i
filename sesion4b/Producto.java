public class Producto implements IVendible {

    int id;
    double precio;
    int existencias;

    public Producto(int id, double precio, int existencias) {
        this.id = id;
        this.precio = precio;
        this.existencias = existencias;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public int getExistencias() {
        return existencias;
    }
}
