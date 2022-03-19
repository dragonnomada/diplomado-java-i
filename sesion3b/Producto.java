public class Producto {

    private int id;
    private String nombre;
    private double precio;
    private int existencias;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = 0;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public void describir() {
        System.out.printf("[Producto %d] %s $%.2f (%d)\n",
                this.id, this.nombre, this.precio, this.existencias);
    }

}
