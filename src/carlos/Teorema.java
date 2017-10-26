package carlos;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Teorema extends JFrame{
	JTextField txbA = new JTextField();
	JTextField txbB = new JTextField();
	JTextField txbHi = new JTextField();

	JLabel lblValorA = new JLabel("Valor de a");
	JLabel lblValorB = new JLabel("Valor de b");
	JLabel lblFormula = new JLabel("Teorema de Pitagoras");
	JLabel lblFor = new JLabel("C² = A² + B²");
	JLabel lblX1 = new JLabel("Hipotenusa");

	JButton btnCalcular = new JButton("Calcular");

	public Teorema() {
		super("Teorema");
		Container paine = this.getContentPane();

		paine.add(lblFormula);
		lblFormula.setFont(new Font("Arial", Font.BOLD, 22));
		lblFormula.setBounds(40, 10, 400, 20);
		paine.add(lblFor);
		lblFor.setBounds(110, 40, 400, 20);
		paine.add(lblValorA);
		lblValorA.setBounds(40, 80, 150, 20);
		paine.add(lblValorB);
		lblValorB.setBounds(40, 110, 150, 20);
		paine.add(txbA);
		txbA.setBounds(120, 80, 160, 20);
		paine.add(txbB);
		txbB.setBounds(120, 110, 160, 20);
		paine.add(btnCalcular);
		btnCalcular.setBounds(40, 170, 200, 20);
		btnCalcular.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(txbA.getText()), b=Double.parseDouble(txbB.getText());
				double x1=Math.sqrt((a*a)+(b*b));
				txbHi.setText(""+x1);
			}
		});
		paine.add(lblX1);
		lblX1.setBounds(40, 200, 100, 20);
		paine.add(txbHi);
		txbHi.setBounds(120, 200, 160, 20);
		
		paine.setLayout(null);
		this.setSize(300, 300);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String ars[]) {
		Teorema b = new Teorema();
	}
}
