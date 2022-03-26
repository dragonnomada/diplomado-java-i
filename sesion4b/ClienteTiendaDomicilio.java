public class ClienteTiendaDomicilio extends ClienteTienda {

    private String domicilio;

    public ClienteTiendaDomicilio(int id, String nombre, String telefono, String domicilio) {
        super(id, nombre, telefono);

        this.domicilio = domicilio;
    }

    public String getDomicilio() {
        return domicilio;
    }

}
