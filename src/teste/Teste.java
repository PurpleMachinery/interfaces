package teste;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Teste extends JFrame{
	private JTextField k = new JTextField();
	String a="a";
	private Teste(){
		super("oi");
		Container paine = this.getContentPane();
		k.setBounds(100,100,100,100);
		paine.add(k);
		
		paine.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
	}
	public static void main(String args[]){
		Teste t = new Teste();
	}
}
