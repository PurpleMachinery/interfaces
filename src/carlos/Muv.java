package carlos;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Muv extends JFrame {
	JLabel lbl1 = new JLabel("Cálculo - MUV");
	JLabel lbl2 = new JLabel("V = 5 + 10T");

	JButton btn3 = new JButton("Calcular");

	JLabel lbl4 = new JLabel("Veloc. Inicial");
	JLabel lbl5 = new JLabel("Aceleração");
	JLabel lbl6 = new JLabel("Velocidade No Instante");

	public Muv() {
		super("MUV");
		Container paine = this.getContentPane();
		paine.setLayout(null);

		double vi=5, ac=10, t=6;
		
		paine.add(lbl1);
		lbl1.setBounds(130, 0, 350, 20);
		paine.add(lbl2);
		lbl2.setBounds(135, 30, 350, 20);
		paine.add(btn3);
		btn3.setBounds(0, 60, 344, 40);
		btn3.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				lbl4.setText(""+vi+" m/s");
				lbl5.setText(""+ac+" m/s");
				lbl6.setText(""+(vi+(ac*t))+" m/s");
			}
		});
		paine.add(lbl4);
		lbl4.setBounds(135, 110, 350, 20);
		paine.add(lbl5);
		lbl5.setBounds(140, 140, 350, 20);
		paine.add(lbl6);
		lbl6.setBounds(140, 170, 350, 20);

		this.setSize(350, 250);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String ars[]) {
		Muv b = new Muv();
	}
}
