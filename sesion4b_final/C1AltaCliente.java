import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C1AltaCliente {

    List<ICliente> clientes;

    public C1AltaCliente() {
        this.clientes = new ArrayList<>();
    }

    // OFREZCO ICliente[]
    public ICliente[] getClientes() {
        ICliente[] clientesArray = new ICliente[this.clientes.size()];
        int i = 0;
        for (ICliente cliente : this.clientes) {
            clientesArray[i++] = cliente;
        }
        return clientesArray;
    }

    public void capturar(Scanner scanner) {

        System.out.println("ID:");
        int id = scanner.nextInt();scanner.nextLine();
        System.out.println("Nombre:");
        String nombre = scanner.nextLine();

        // cliente es un objeto de la clase Cliente
        Cliente cliente = new Cliente(id, nombre);

        // clientes es una lista de la interfaz ICliente
        // cliente (objeto original) -> (objeto interfaz)
        //         (Cliente)         -> (ICliente)
        this.clientes.add(cliente);

    }

}
