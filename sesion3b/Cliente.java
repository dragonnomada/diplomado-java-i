public class Cliente {

    private int id;
    private String nombre;

    public Cliente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void describir() {
        System.out.printf("[Cliente %d] %s\n", this.id, this.nombre);
    }

}
