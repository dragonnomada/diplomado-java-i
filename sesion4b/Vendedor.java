public class Vendedor implements IVendedor {

    int id;
    String nombre;

    public Vendedor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

}
