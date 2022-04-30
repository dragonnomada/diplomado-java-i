import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppHanoi extends JFrame {
    private JLabel labelT11;
    private JLabel labelT12;
    private JLabel labelT13;
    private JLabel labelT14;
    private JLabel labelT15;
    private JLabel labelT21;
    private JLabel labelT22;
    private JLabel labelT23;
    private JLabel labelT24;
    private JLabel labelT25;
    private JLabel labelT31;
    private JLabel labelT32;
    private JLabel labelT33;
    private JLabel labelT34;
    private JLabel labelT35;
    private JPanel panel;
    private JButton seleccionarButtonT1;
    private JButton seleccionarButtonT2;
    private JButton seleccionarButtonT3;
    private JButton colocarButtonT1;
    private JButton colocarButtonT2;
    private JButton colocarButtonT3;
    JLabel labelSeleccionado;

    public AppHanoi() {
        this.add(panel);

        this.setSize(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        seleccionarButtonT1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (labelSeleccionado != null) {
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                }

                if (!labelT11.getText().equals("|")) {
                    labelSeleccionado = labelT11;
                } else if (!labelT12.getText().equals("|")) {
                    labelSeleccionado = labelT12;
                } else if (!labelT13.getText().equals("|")) {
                    labelSeleccionado = labelT13;
                } else if (!labelT14.getText().equals("|")) {
                    labelSeleccionado = labelT14;
                } else if (!labelT15.getText().equals("|")) {
                    labelSeleccionado = labelT15;
                } else {
                    JOptionPane.showMessageDialog(panel, "No hay discos por seleccionar");
                }

                if (labelSeleccionado != null) {
                    labelSeleccionado.setForeground(Color.RED);
                }
            }
        });

        seleccionarButtonT2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (labelSeleccionado != null) {
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                }

                if (!labelT21.getText().equals("|")) {
                    labelSeleccionado = labelT21;
                } else if (!labelT22.getText().equals("|")) {
                    labelSeleccionado = labelT22;
                } else if (!labelT23.getText().equals("|")) {
                    labelSeleccionado = labelT23;
                } else if (!labelT24.getText().equals("|")) {
                    labelSeleccionado = labelT24;
                } else if (!labelT25.getText().equals("|")) {
                    labelSeleccionado = labelT25;
                } else {
                    JOptionPane.showMessageDialog(panel, "No hay discos por seleccionar");
                }

                if (labelSeleccionado != null) {
                    labelSeleccionado.setForeground(Color.RED);
                }
            }
        });

        seleccionarButtonT3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (labelSeleccionado != null) {
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                }

                if (!labelT31.getText().equals("|")) {
                    labelSeleccionado = labelT31;
                } else if (!labelT32.getText().equals("|")) {
                    labelSeleccionado = labelT32;
                } else if (!labelT33.getText().equals("|")) {
                    labelSeleccionado = labelT33;
                } else if (!labelT34.getText().equals("|")) {
                    labelSeleccionado = labelT34;
                } else if (!labelT35.getText().equals("|")) {
                    labelSeleccionado = labelT35;
                } else {
                    JOptionPane.showMessageDialog(panel, "No hay discos por seleccionar");
                }

                if (labelSeleccionado != null) {
                    labelSeleccionado.setForeground(Color.RED);
                }
            }
        });

        colocarButtonT1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (labelSeleccionado == null) {
                    JOptionPane.showMessageDialog(panel, "No hay disco seleccionado");
                    return;
                }

                // 1. Tamaño del primer disco
                JLabel disco;

                if (!labelT11.getText().equals("|")) {
                    disco = labelT11;
                } else if (!labelT12.getText().equals("|")) {
                    disco = labelT12;
                } else if (!labelT13.getText().equals("|")) {
                    disco = labelT13;
                } else if (!labelT14.getText().equals("|")) {
                    disco = labelT14;
                } else if (!labelT15.getText().equals("|")) {
                    disco = labelT15;
                } else {
                    labelT15.setText(labelSeleccionado.getText());
                    labelSeleccionado.setText("|");
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                    return;
                }

                int tamañoDiscoTorre = 0;

                switch (disco.getText()) {
                    case "*":
                        tamañoDiscoTorre = 1;
                        break;
                    case "**":
                        tamañoDiscoTorre = 2;
                        break;
                    case "***":
                        tamañoDiscoTorre = 3;
                        break;
                    case "****":
                        tamañoDiscoTorre = 4;
                        break;
                    case "*****":
                        tamañoDiscoTorre = 5;
                        break;
                    default:
                        JOptionPane.showMessageDialog(panel, "Error de tamaño del disco");
                        return;
                }

                int tamañoDiscoSeleccionado = 0;

                switch (labelSeleccionado.getText()) {
                    case "*":
                        tamañoDiscoSeleccionado = 1;
                        break;
                    case "**":
                        tamañoDiscoSeleccionado = 2;
                        break;
                    case "***":
                        tamañoDiscoSeleccionado = 3;
                        break;
                    case "****":
                        tamañoDiscoSeleccionado = 4;
                        break;
                    case "*****":
                        tamañoDiscoSeleccionado = 5;
                        break;
                    default:
                        JOptionPane.showMessageDialog(panel, "Error de tamaño del disco");
                        return;
                }

                if (tamañoDiscoSeleccionado > tamañoDiscoTorre) {
                    JOptionPane.showMessageDialog(panel, "No se puede colocar el disco");
                    return;
                }

                // 2. Colocar el disco
                if (labelT15.getText().equals("|")) {
                    labelT15.setText(labelSeleccionado.getText());
                    labelSeleccionado.setText("|");
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                } else if (labelT14.getText().equals("|")) {
                    labelT14.setText(labelSeleccionado.getText());
                    labelSeleccionado.setText("|");
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                } else if (labelT13.getText().equals("|")) {
                    labelT13.setText(labelSeleccionado.getText());
                    labelSeleccionado.setText("|");
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                } else if (labelT12.getText().equals("|")) {
                    labelT12.setText(labelSeleccionado.getText());
                    labelSeleccionado.setText("|");
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                } else if (!labelT11.getText().equals("|")) {
                    labelT11.setText(labelSeleccionado.getText());
                    labelSeleccionado.setText("|");
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                } else {
                    JOptionPane.showMessageDialog(panel, "No cabe en la torre");
                    return;
                }

            }
        });

        colocarButtonT2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (labelSeleccionado == null) {
                    JOptionPane.showMessageDialog(panel, "No hay disco seleccionado");
                    return;
                }

                // 1. Tamaño del primer disco
                JLabel disco;

                if (!labelT21.getText().equals("|")) {
                    disco = labelT21;
                } else if (!labelT22.getText().equals("|")) {
                    disco = labelT22;
                } else if (!labelT23.getText().equals("|")) {
                    disco = labelT23;
                } else if (!labelT24.getText().equals("|")) {
                    disco = labelT24;
                } else if (!labelT25.getText().equals("|")) {
                    disco = labelT25;
                } else {
                    labelT25.setText(labelSeleccionado.getText());
                    labelSeleccionado.setText("|");
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                    return;
                }

                int tamañoDiscoTorre = 0;

                switch (disco.getText()) {
                    case "*":
                        tamañoDiscoTorre = 1;
                        break;
                    case "**":
                        tamañoDiscoTorre = 2;
                        break;
                    case "***":
                        tamañoDiscoTorre = 3;
                        break;
                    case "****":
                        tamañoDiscoTorre = 4;
                        break;
                    case "*****":
                        tamañoDiscoTorre = 5;
                        break;
                    default:
                        JOptionPane.showMessageDialog(panel, "Error de tamaño del disco");
                        return;
                }

                int tamañoDiscoSeleccionado = 0;

                switch (labelSeleccionado.getText()) {
                    case "*":
                        tamañoDiscoSeleccionado = 1;
                        break;
                    case "**":
                        tamañoDiscoSeleccionado = 2;
                        break;
                    case "***":
                        tamañoDiscoSeleccionado = 3;
                        break;
                    case "****":
                        tamañoDiscoSeleccionado = 4;
                        break;
                    case "*****":
                        tamañoDiscoSeleccionado = 5;
                        break;
                    default:
                        JOptionPane.showMessageDialog(panel, "Error de tamaño del disco");
                        return;
                }

                if (tamañoDiscoSeleccionado > tamañoDiscoTorre) {
                    JOptionPane.showMessageDialog(panel, "No se puede colocar el disco");
                    return;
                }

                // 2. Colocar el disco
                if (labelT25.getText().equals("|")) {
                    labelT25.setText(labelSeleccionado.getText());
                    labelSeleccionado.setText("|");
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                } else if (labelT24.getText().equals("|")) {
                    labelT24.setText(labelSeleccionado.getText());
                    labelSeleccionado.setText("|");
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                } else if (labelT23.getText().equals("|")) {
                    labelT23.setText(labelSeleccionado.getText());
                    labelSeleccionado.setText("|");
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                } else if (labelT22.getText().equals("|")) {
                    labelT22.setText(labelSeleccionado.getText());
                    labelSeleccionado.setText("|");
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                } else if (!labelT21.getText().equals("|")) {
                    labelT21.setText(labelSeleccionado.getText());
                    labelSeleccionado.setText("|");
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                } else {
                    JOptionPane.showMessageDialog(panel, "No cabe en la torre");
                    return;
                }

            }
        });

        colocarButtonT3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (labelSeleccionado == null) {
                    JOptionPane.showMessageDialog(panel, "No hay disco seleccionado");
                    return;
                }

                // 1. Tamaño del primer disco
                JLabel disco;

                if (!labelT31.getText().equals("|")) {
                    disco = labelT31;
                } else if (!labelT32.getText().equals("|")) {
                    disco = labelT32;
                } else if (!labelT33.getText().equals("|")) {
                    disco = labelT33;
                } else if (!labelT34.getText().equals("|")) {
                    disco = labelT34;
                } else if (!labelT35.getText().equals("|")) {
                    disco = labelT35;
                } else {
                    labelT35.setText(labelSeleccionado.getText());
                    labelSeleccionado.setText("|");
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                    return;
                }

                int tamañoDiscoTorre = 0;

                switch (disco.getText()) {
                    case "*":
                        tamañoDiscoTorre = 1;
                        break;
                    case "**":
                        tamañoDiscoTorre = 2;
                        break;
                    case "***":
                        tamañoDiscoTorre = 3;
                        break;
                    case "****":
                        tamañoDiscoTorre = 4;
                        break;
                    case "*****":
                        tamañoDiscoTorre = 5;
                        break;
                    default:
                        JOptionPane.showMessageDialog(panel, "Error de tamaño del disco");
                        return;
                }

                int tamañoDiscoSeleccionado = 0;

                switch (labelSeleccionado.getText()) {
                    case "*":
                        tamañoDiscoSeleccionado = 1;
                        break;
                    case "**":
                        tamañoDiscoSeleccionado = 2;
                        break;
                    case "***":
                        tamañoDiscoSeleccionado = 3;
                        break;
                    case "****":
                        tamañoDiscoSeleccionado = 4;
                        break;
                    case "*****":
                        tamañoDiscoSeleccionado = 5;
                        break;
                    default:
                        JOptionPane.showMessageDialog(panel, "Error de tamaño del disco");
                        return;
                }

                if (tamañoDiscoSeleccionado > tamañoDiscoTorre) {
                    JOptionPane.showMessageDialog(panel, "No se puede colocar el disco");
                    return;
                }

                // 2. Colocar el disco
                if (labelT35.getText().equals("|")) {
                    labelT35.setText(labelSeleccionado.getText());
                    labelSeleccionado.setText("|");
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                } else if (labelT34.getText().equals("|")) {
                    labelT34.setText(labelSeleccionado.getText());
                    labelSeleccionado.setText("|");
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                } else if (labelT33.getText().equals("|")) {
                    labelT33.setText(labelSeleccionado.getText());
                    labelSeleccionado.setText("|");
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                } else if (labelT32.getText().equals("|")) {
                    labelT32.setText(labelSeleccionado.getText());
                    labelSeleccionado.setText("|");
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                } else if (!labelT31.getText().equals("|")) {
                    labelT31.setText(labelSeleccionado.getText());
                    labelSeleccionado.setText("|");
                    labelSeleccionado.setForeground(Color.black);
                    labelSeleccionado = null;
                } else {
                    JOptionPane.showMessageDialog(panel, "No cabe en la torre");
                    return;
                }

            }
        });
    }

    public static void main(String[] args) {
        AppHanoi app = new AppHanoi();
    }

}
