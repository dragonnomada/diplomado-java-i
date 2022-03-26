import java.util.Date;

public class TestTicket {

    public static void main(String[] args) {
        TestTicket test = new TestTicket();

        Object obj = new Object();

        System.out.println(test); // test.toString()
        System.out.println(obj); // obj.toString()

        Ticket ticket = new Ticket(
                new Date(), // Objeto anónimo
                "Galerías", // Objeto de sola línea
                "Pepe Díaz", // Objeto de sola línea
                "Alfred", // Objeto de sola línea
                "1234567890987654321", // Objeto de sola línea
                new String[] { // Objeto anónimo
                    "Papas    x1 $15.99",
                    "Galletas x2 $7.66",
                    "Refresco x5 $89.73",
                    "Chicle   x1 $4.63",
                }
        );

        System.out.println(ticket); // ticket.toString()
    }

}
