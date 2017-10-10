package excs;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex1 extends JFrame {
	JTextField txbN1 = new JTextField();
	JTextField txbN2 = new JTextField();
	JButton btnCalc = new JButton("calcular");
	JLabel lblSoma = new JLabel("soma");
	JLabel lblSub = new JLabel("Subtração");
	JLabel lblDiv = new JLabel("Divisão");
	JLabel lblMult = new JLabel("Multiplicação");

	public Ex1() {
		super("Ex1");
		Container paine = this.getContentPane();
		paine.setLayout(null);
		this.setVisible(true);
		this.setSize(500, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		int ww = this.getWidth() - 15;

		this.add(txbN1);
		txbN1.setBounds(0, 0, ww, 40);
		txbN1.setHorizontalAlignment(JTextField.CENTER);
		this.add(txbN2);
		txbN2.setBounds(0, 50, ww, 40);
		txbN2.setHorizontalAlignment(JTextField.CENTER);
		this.add(btnCalc);
		btnCalc.setBounds(0, 100, ww, 40);
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txbN1.getText() != null || txbN2.getText() != null) {
					lblSoma.setText(
							"Soma: " + (Double.parseDouble(txbN1.getText()) + Double.parseDouble(txbN2.getText())));
					lblSub.setText("Subtração: "
							+ (Double.parseDouble(txbN1.getText()) - Double.parseDouble(txbN2.getText())));
					lblDiv.setText(
							"Divisão: " + (Double.parseDouble(txbN1.getText()) / Double.parseDouble(txbN2.getText())));
					lblMult.setText("Multiplicação: "
							+ (Double.parseDouble(txbN1.getText()) * Double.parseDouble(txbN2.getText())));
				}
			}
		});
		this.add(lblSoma);
		lblSoma.setBounds(225, 150, ww, 40);
		this.add(lblSub);
		lblSub.setBounds(215, 170, ww, 40);
		this.add(lblDiv);
		lblDiv.setBounds(222, 190, ww, 40);
		this.add(lblMult);
		lblMult.setBounds(205, 210, ww, 40);
	}

	public static void main(String args[]) {
		Ex1 ex = new Ex1();
	}
}
