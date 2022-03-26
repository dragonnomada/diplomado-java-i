public class ClienteTienda extends Cliente {

    // Todos los clientes en la tienda tienen un teléfono
    private String telefono;

    // Para construir un cliente de tienda, requerimos
    // el id y el nombre que se le darán a la super clase
    // y adicionalmente el teléfono del cliente
    public ClienteTienda(int id, String nombre, String telefono) {
        super(id, nombre); // new Cliente(id, nombre)

        this.telefono = telefono;
    }

    // Getter: Obtener el teléfono (lectura)
    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return super.toString() + " Tel. " + this.telefono;
    }

}

// ClienteTienda clienteTienda = new ClienteTienda(987, "Beto Cuevas", "5512345678");
// System.out.println(clienteTienda); // [CLIENTE 987] Beto Cuevas Tel. 5512345678
