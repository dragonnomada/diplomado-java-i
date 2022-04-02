import javax.swing.*;

public class TestAppReservacion {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        AppReservacion app = new AppReservacion();

        frame.add(app.getPanel1());

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
