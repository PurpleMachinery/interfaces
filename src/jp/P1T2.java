package jp;

import javax.swing.JOptionPane;
public class P1T2 {
	public static void main(String args[]) {
		String nome = JOptionPane.showInputDialog("Digite seu nome jovem gafanhoto: ");
		String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome pobre gambá: ");
		JOptionPane.showMessageDialog(null, "bem vindo "+nome+" "+sobrenome);
	}
}
