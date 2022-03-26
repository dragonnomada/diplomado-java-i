public class ClienteProveedor extends Cliente {

    private String empresa;

    public ClienteProveedor(int id, String nombre, String empresa) {
        super(id, nombre);

        this.empresa = empresa;
    }

}
