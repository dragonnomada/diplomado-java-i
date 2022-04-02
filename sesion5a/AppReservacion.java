import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppReservacion {
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JSpinner spinner3;
    private JButton realizarReservaciónButton;
    private JSpinner spinner4;
    private JCheckBox conFinesDeSemanaCheckBox;
    private JLabel label1;
    private JLabel label2;
    private JPanel panel1;

    Reservacion reservacion;
    CalendarioAsignacion calendarioAsignacion = new CalendarioAsignacion();

    public AppReservacion() {
        realizarReservaciónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha fecha = new Fecha(
                        (int)spinner3.getValue(),
                        (int)spinner2.getValue(),
                        (int)spinner1.getValue()
                );
                int dias = (int)spinner4.getValue();
                boolean conFinesDeSemana = conFinesDeSemanaCheckBox.isSelected();
                reservacion = new Reservacion(fecha, dias, conFinesDeSemana);
                calendarioAsignacion.setAsignacionFechas(reservacion);
                label1.setText(calendarioAsignacion.getFechaInicial().toString());
                label2.setText(calendarioAsignacion.getFechaFinal().toString());
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }
}
