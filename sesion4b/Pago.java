import java.util.Date;

public class Pago implements IPago {

    int id;
    Date createAt;

    public Pago(int id, Date createAt) {
        this.id = id;
        this.createAt = createAt;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Date getCreateAt() {
        return createAt;
    }
}
