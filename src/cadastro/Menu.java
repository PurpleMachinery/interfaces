package cadastro;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Menu extends JFrame {

	JLabel lblNome = new JLabel("Nome");

	JTextField txtNome = new JTextField();

	public Menu() {
		Container paine = this.getContentPane();
		paine.setLayout(null);

		paine.add(lblNome);
		paine.add(txtNome);
		lblNome.setBounds(220, 10, 100, 20);
		txtNome.setBounds(2, 30, 480, 20);

		this.setSize(500, 500);
		this.setVisible(true);
		this.setLocation(500, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Menu mn = new Menu();
	}
}
