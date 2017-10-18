package calculadora;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MUV extends JFrame{
	JLabel velocidadeInicial = new JLabel("Velocidade Inicial: ");
	JLabel aceleracao = new JLabel("Aceleração: ");
	JLabel instante = new JLabel("Velocidade no instante 6s: ");
	
	
	
	public MUV(){
		Container paine = this.getContentPane();
			
		paine.add(velocidadeInicial);
		velocidadeInicial.setBounds(20, 10, 300, 20);
		paine.add(aceleracao);
		aceleracao.setBounds(20, 50, 300, 20);
		paine.add(instante);
		instante.setBounds(20, 90, 300, 20);
		double vi=5,ac=10,temp=6,vni=(temp*ac)+vi;
		velocidadeInicial.setText("Veloc. Inicial: "+vi+"m/s");
		aceleracao.setText("Aceleração: "+ac+"m/s");
		instante.setText("Velocidade no intante 6s: "+vni+"m/s");
		
		
		paine.setLayout(null);
		this.setVisible(true);
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		MUV m = new MUV();
	}
}
