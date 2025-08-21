import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrmDevuelta extends JFrame {

    private int[] denominaciones = new int[] { 100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50 };
    private int[] existencia = new int[denominaciones.length];
    private JComboBox<String> cmbDenominacion;
    private JTextField txtExistencia;
    private JTextField txtDevuelta;

    public FrmDevuelta() {
        setTitle("Calculo de devueltas");
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblDenominacion = new JLabel("Denominacion:");
        lblDenominacion.setBounds(100, 10, 100, 25);
        getContentPane().add(lblDenominacion);

        cmbDenominacion = new JComboBox();
        cmbDenominacion.setBounds(210, 10, 150, 25);
        getContentPane().add(cmbDenominacion);

        String[] strDenominaciones = new String[denominaciones.length];
        for (int i = 0; i < denominaciones.length; i++) {
            strDenominaciones[i] = String.valueOf(denominaciones[i]);
        }
        cmbDenominacion.setModel(new DefaultComboBoxModel(strDenominaciones));

        JButton btnActualizarExistencia = new JButton("Actualizar Existencia");
        btnActualizarExistencia.setBounds(10, 40, 180, 25);
        getContentPane().add(btnActualizarExistencia);

        txtExistencia = new JTextField();
        txtExistencia.setBounds(210, 40, 150, 25);
        getContentPane().add(txtExistencia);

        cmbDenominacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consultarExistencia();
            }
        });

        btnActualizarExistencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarExistencia();
            }
        });

        JLabel lblDevuelta = new JLabel("Denominacion:");
        lblDevuelta.setBounds(100, 70, 100, 25);
        getContentPane().add(lblDevuelta);

        txtDevuelta = new JTextField();
        txtDevuelta.setBounds(210, 40, 150, 25);
        getContentPane().add(txtDevuelta);

    }

    private void consultarExistencia() {
        // Lógica para consultar la existencia de la denominación seleccionada
        int existenciaActual = existencia[cmbDenominacion.getSelectedIndex()];
        txtExistencia.setText(String.valueOf(existenciaActual));
    }

    private void actualizarExistencia() {
        int existenciaActual = Integer.parseInt(txtExistencia.getText());
        existencia[cmbDenominacion.getSelectedIndex()] = existenciaActual;
    }
}
