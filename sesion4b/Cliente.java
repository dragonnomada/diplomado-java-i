public class Cliente implements ICliente {

    // Todos los clientes tienen un id y un nombre
    private int id;
    private String nombre;

    // Para construir un cliente, requerimos el id y el nombre
    public Cliente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getter: Obtener el id (lectura)
    public int getId() {
        return this.id;
    }

    // Getter: Obtener el nombre (lectura)
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        String texto = "[CLIENTE: " + this.id + "] " + this.nombre;
        return texto;
    }

}

// Cliente cliente = new Cliente(582, "Beto Díaz");
// System.out.println(cliente); // [CLIENTE: 582] Beto Díaz
