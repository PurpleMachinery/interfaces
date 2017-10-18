package calculadora;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Pitagoras extends JFrame{
	JLabel catetoA = new JLabel("cateto: a");
	JLabel catetoB = new JLabel("cateto: b");

	JTextField cA = new JTextField();
	JTextField cB = new JTextField();
	
	JLabel result = new JLabel("Hipotenusa");
	
	JButton btn = new JButton("calcular");
	public Pitagoras(){
		Container paine = this.getContentPane();
		paine.add(catetoA);
		catetoA.setBounds(0,40,60,20);
		paine.add(cA);
		paine.add(cB);
		paine.add(catetoB);
		catetoB.setBounds(0,80,60,20);
		cA.setBounds(70,40,200,20);
		cB.setBounds(70,80,200,20);
		paine.add(btn);
		btn.setBounds(0,110,200,20);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				result.setText(""+((Double.parseDouble(cA.getText())*Double.parseDouble(cA.getText()))+((Double.parseDouble(cB.getText())*Double.parseDouble(cB.getText())))));
			}
		});
		paine.add(result);
		result.setBounds(100, 150, 150, 20);
		
		paine.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
	}
	public static void main(String args[]){
		Pitagoras p = new Pitagoras();
	}
}
