import java.util.Scanner;

public class TestC1AltaCliente {

    public static void main(String[] args) {
        C1AltaCliente altaCliente = new C1AltaCliente();

        Scanner scanner = new Scanner(System.in);

        altaCliente.capturar(scanner);
        altaCliente.capturar(scanner);
        altaCliente.capturar(scanner);

        ICliente[] clientes = altaCliente.getClientes();

        for (ICliente cliente : clientes) {
            System.out.println(cliente.getId());
        }
    }

}
