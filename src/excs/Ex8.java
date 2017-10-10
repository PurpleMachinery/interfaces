package excs;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ex8 extends JFrame {
	JTextField txb0 = new JTextField();
	JTextField txb1 = new JTextField();
	JTextField txb2 = new JTextField();
	JTextField txb3 = new JTextField();

	JButton btn = new JButton("Calcular");

	public Ex8() {
		Container paine = this.getContentPane();
		paine.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		paine.add(txb0);
		txb0.setBounds(0, 0, 485, 40);
		paine.add(txb1);
		txb1.setBounds(0, 40, 485, 40);
		paine.add(txb2);
		txb2.setBounds(0, 80, 485, 40);
		paine.add(btn);
		btn.setBounds(0, 120, 485, 40);
		paine.add(txb3);
		txb3.setHorizontalAlignment(txb3.CENTER);
		txb3.setBounds(0, 160, 485, 40);
		txb3.setEditable(false);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(txb0.getText());//valor
				double b = Double.parseDouble(txb1.getText());//parcelas
				double c = Double.parseDouble(txb2.getText());//juros
				c/=100;
				double d=0;//total
				d=a/b;
				d+=d*c;
				d*=b;
				txb3.setText("Total: "+d);
			}
		});

	}

	public static void main(String args[]) {
		Ex8 ex = new Ex8();
	}
}
