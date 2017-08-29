package jp;

import javax.swing.JOptionPane;

public class P1T3 {
	public static void main(String args[]) {
		double x, y, z;
		
		x=Double.parseDouble(JOptionPane.showInputDialog("Digite x"));
		y=Double.parseDouble(JOptionPane.showInputDialog("Digite y"));
		z=x+y;
		JOptionPane.showMessageDialog(null, "z = "+z);
		
	}
}