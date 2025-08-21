import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrmDevuelta extends JFrame {

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

    }

}
