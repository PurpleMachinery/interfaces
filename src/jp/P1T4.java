package jp;

import javax.swing.JOptionPane;

public class P1T4 {
	public static void main(String args[]) {
		double a, b, c, delta, sqrtdelta, raiz1, raiz2;
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite A:"));
		while (a == 0) {
			a = Double.parseDouble(JOptionPane.showInputDialog("Valor inválido:\nDigite A:"));	
		}
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite B:"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite C:"));
		delta = b * b;
		delta = delta - 4 * a * c;
		sqrtdelta = Math.sqrt(delta);
		if(delta>=0) {
            raiz1 = (-b + sqrtdelta)/(2*a);
            raiz2 = (-b - sqrtdelta)/(2*a);
            JOptionPane.showMessageDialog(null, "Raiz 1: "+raiz1+"\nRaiz2: "+raiz2);
		}
		else {
			JOptionPane.showMessageDialog(null, "Raiz impossivel de calcular");
			return;
		}
	}
}
