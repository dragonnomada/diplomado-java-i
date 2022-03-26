import java.util.Date;

public class Ticket {

    private Date date;
    private String terminal;
    private String user;
    private String client;
    private String payment;
    private String[] items;

    public Ticket(Date date, String terminal, String user, String client, String payment, String[] items) {
        this.date = date;
        this.terminal = terminal;
        this.user = user;
        this.client = client;
        this.payment = payment;
        this.items = items.clone();
    }

    public static Ticket createTicket(Date date, String terminal, String user, String client, String payment, String[] items) {
        return new Ticket(date, terminal, user, client, payment, items);
    }

    @Override
    public String toString() {
        String text = "";

        text += this.terminal + "\n";
        text += this.date.toString() + "\n";
        text += "-------------------" + "\n";
        text += "Usuario:" + this.user + "\n";
        text += "Cliente:" + this.client + "\n";
        text += "-------------------" + "\n";
        for (String item : this.items) {
            text += item + "\n";
        }
        text += "-------------------" + "\n";
        text += this.payment + "\n";
        text += "-------------------" + "\n";

        return text;
    }
}
