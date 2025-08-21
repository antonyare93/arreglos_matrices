import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrmDevuelta extends JFrame {

    private int[] denominaciones = new int[]{100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50}

    public FrmDevuelta() {
        setTitle("Calculo de devueltas");
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblDenominacion = new JLabel("Denominacion:");
        lblDenominacion.setBounds(100, 10, 100, 25);
        getContentPane().add(lblDenominacion);

        JComboBox cmbDenominacion = new JComboBox();
        cmbDenominacion.setBounds(210, 10, 150, 25);
        getContentPane().add(cmbDenominacion);

        String[] strDenominaciones = new String[denominaciones.length];
        for (int i = 0; i < denominaciones.length; i++) {
            strDenominaciones[i] = String.valueOf(denominaciones[i]);
        }

    }

}
