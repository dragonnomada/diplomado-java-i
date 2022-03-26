public class Producto implements IPrecio {

    private String codigo;
    private String nombre;
    private double precio;
    private int existencias;

    public Producto(String codigo, String nombre, double precio, int existencias) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    public void agregarExistencia() {
        this.existencias += 1;
    }

    public void quitarExistencia() {
        if (this.existencias <= 0) {
            return;
        }
        this.existencias -= 1;
    }

}
