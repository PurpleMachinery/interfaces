package aula;

import java.awt.Container; //Importa o container.

import javax.swing.JButton;
import javax.swing.JFrame; //Importa o JFRAME que é responsavel pela interface grafica.
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	JTextField txtVisor = new JTextField(); // Cria visor txtVisor
	JButton btnMc = new JButton("MC"); // Cria Botão btnMc
	JButton btnMr = new JButton("MR");
	JButton btnMs = new JButton("MS");
	JButton btnMmais = new JButton("M+");
	JButton btnMmenos = new JButton("M-");
	JButton btnSetaes = new JButton("<=");
	JButton btnCe = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnMM = new JButton("+-");
	JButton btnRaiz = new JButton("√");
	JButton btnUm = new JButton("1");
	JButton btnDois = new JButton("2");
	JButton btnTres = new JButton("3");
	JButton btnQuatro = new JButton("4");
	JButton btnCinco = new JButton("5");
	JButton btnSeis = new JButton("6");
	JButton btnSete = new JButton("7");
	JButton btnOito = new JButton("8");
	JButton btnNove = new JButton("9");
	JButton btnZero = new JButton("0");
	JButton btnDiv = new JButton("/");
	JButton btnPor = new JButton("%");
	JButton btnMulti = new JButton("*");
	JButton btnumBarra = new JButton("1/x");
	JButton btnMenos = new JButton("-");
	JButton btnMais = new JButton("+");
	JButton btnIgual = new JButton("=");
	JButton btnVirgula = new JButton(",");

	public Calculadora() { // Construtor.
		super("Calculadora"); // Responsavel pelo titulo da janela.
		Container paine = this.getContentPane(); // Cria objeto Container.
		
		paine.add(txtVisor); //Adiciona o objeto visor
		txtVisor.setBounds(10, 20, 295, 40); //(Espaço da esquerda, Espaço de cima, Largura, Altura).

		paine.add(btnMc);
		btnMc.setBounds(10, 65, 55, 40);
		
		paine.add(btnMr);
		btnMr.setBounds(70, 65, 55, 40);

		paine.add(btnMs);
		btnMs.setBounds(130, 65, 55, 40);

		paine.add(btnMmais);
		btnMmais.setBounds(190, 65, 55, 40);

		paine.add(btnMmenos);
		btnMmenos.setBounds(250, 65, 55, 40);

		paine.add(btnSetaes);
		btnSetaes.setBounds(10, 110, 55, 40);

		paine.add(btnCe);
		btnCe.setBounds(70, 110, 55, 40);

		paine.add(btnC);
		btnC.setBounds(130, 110, 55, 40);

		paine.add(btnMM);
		btnMM.setBounds(190, 110, 55, 40);

		paine.add(btnRaiz);
		btnRaiz.setBounds(250, 110, 55, 40);
		
		paine.add(btnSete);
		btnSete.setBounds(10, 155, 55, 40);
		
		paine.add(btnOito);
		btnOito.setBounds(70, 155, 55, 40);
		
		paine.add(btnNove);
		btnNove.setBounds(130, 155, 55, 40);
		
		paine.add(btnDiv);
		btnDiv.setBounds(190, 155, 55, 40);
		
		paine.add(btnPor);
		btnPor.setBounds(250, 155, 55, 40);
		
		paine.add(btnQuatro);
		btnQuatro.setBounds(10, 200, 55, 40);
		
		paine.add(btnCinco);
		btnCinco.setBounds(70, 200, 55, 40);
		
		paine.add(btnSeis);
		btnSeis.setBounds(130, 200, 55, 40);
		
		paine.add(btnMulti);
		btnMulti.setBounds(190, 200, 55, 40);
		
		paine.add(btnumBarra);
		btnumBarra.setBounds(250, 200, 55, 40);

		paine.add(btnUm);
		btnUm.setBounds(10, 245, 55, 40);
		
		paine.add(btnDois);
		btnDois.setBounds(70, 245, 55, 40);
		
		paine.add(btnTres);
		btnTres.setBounds(130, 245, 55, 40);
		
		paine.add(btnMenos);
		btnMenos.setBounds(190, 245, 55, 40);
		
		paine.add(btnZero);
		btnZero.setBounds(10, 290, 115, 40);
		
		paine.add(btnVirgula);
		btnVirgula.setBounds(130, 290, 55, 40);
		
		paine.add(btnMais);
		btnMais.setBounds(190, 290, 55, 40);
	
		paine.add(btnIgual);
		btnIgual.setBounds(250, 245, 55, 85);
		
		paine.setLayout(null); // Defini o posicionamento na tela.
		this.setVisible(true); // Responsavel pela exibição do programa.
		this.setSize(330, 375); // Responsavel pelo Tamanho de abertura.
	}

	public static void main(String args[]) {
		Calculadora calc = new Calculadora(); // Objeto de Calculadora.

	}
}