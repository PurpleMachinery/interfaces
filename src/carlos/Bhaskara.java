package carlos;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Bhaskara extends JFrame {
	JTextField txbA = new JTextField();
	JTextField txbB = new JTextField();
	JTextField txbC = new JTextField();
	JTextField txbX1 = new JTextField();
	JTextField txbX2 = new JTextField();

	JLabel lblValorA = new JLabel("Valor de a");
	JLabel lblValorB = new JLabel("Valor de b");
	JLabel lblValorC = new JLabel("Valor de c");
	JLabel lblFormula = new JLabel("Fórmula de Bhaskara");
	JLabel lblFor = new JLabel("ax² + BX + C = 0");
	JLabel lblX1 = new JLabel("X¹");
	JLabel lblX2 = new JLabel("X²");

	JButton btnCalcular = new JButton("Calcular");

	public Bhaskara() {
		super("Fórmula de Bhaskara");
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
		paine.add(lblValorC);
		lblValorC.setBounds(40, 140, 150, 20);
		paine.add(txbA);
		txbA.setBounds(120, 80, 160, 20);
		paine.add(txbB);
		txbB.setBounds(120, 110, 160, 20);
		paine.add(txbC);
		txbC.setBounds(120, 140, 160, 20);
		paine.add(btnCalcular);
		btnCalcular.setBounds(40, 170, 200, 20);
		btnCalcular.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(txbA.getText()), b=Double.parseDouble(txbB.getText()), c=Double.parseDouble(txbC.getText());
				double delta = ((b*b))-(4*(a*c));
				double x1=((b*-1)+Math.sqrt(delta))/(2*a);
				double x2=((b*-1)-Math.sqrt(delta))/(2*a);
				txbX1.setText(""+x1);
				txbX2.setText(""+x2);
			}
		});
		paine.add(lblX1);
		lblX1.setBounds(100, 200, 50, 20);
		paine.add(lblX2);
		lblX2.setBounds(100, 230, 50, 20);
		paine.add(txbX1);
		txbX1.setBounds(120,200,150,20);
		paine.add(txbX2);
		txbX2.setBounds(120,230,150,20);
		
		paine.setLayout(null);
		this.setSize(300, 300);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String ars[]) {
		Bhaskara b = new Bhaskara();
	}
}
