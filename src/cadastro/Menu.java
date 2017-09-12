package cadastro;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Menu extends JFrame {

	JLabel lblNome = new JLabel("Nome");
	JLabel lblEndereco = new JLabel("Endereço");
	JLabel lblBairro = new JLabel("Bairro");
	JLabel lblCep = new JLabel("CEP");
	JLabel lblCidade = new JLabel("Cidade");
	JLabel lblEstado = new JLabel("Estado");
	JLabel lblTelefone = new JLabel("Telefone");
	JLabel lblCelular = new JLabel("Celular");
	JLabel lblSexo = new JLabel("Sexo");
	JLabel lblRg = new JLabel("RG");
	JLabel lblCpf = new JLabel("CPF");

	JTextField txtNome = new JTextField();
	JTextField txtEndereco = new JTextField();
	JTextField txtBairro = new JTextField();
	JTextField txtCep = new JTextField();
	JTextField txtCidade = new JTextField();
	JTextField txtEstado = new JTextField();
	JTextField txtTelefone = new JTextField();
	JTextField txtCelular = new JTextField();
	JTextField txtSexo = new JTextField();
	JTextField txtRg = new JTextField();
	JTextField txtCpf = new JTextField();
	
	JButton btnEnviar = new JButton("Send");
	JButton btnLimpar = new JButton("Clean");

	public Menu() {
		Container paine = this.getContentPane();
		paine.setLayout(null);

		paine.add(lblNome);
		paine.add(txtNome);
		lblNome.setBounds(220, 10, 100, 20);
		txtNome.setBounds(2, 30, 480, 20);

		paine.add(lblEndereco);
		paine.add(txtEndereco);
		lblEndereco.setBounds(210,50,100,20);
		txtEndereco.setBounds(2, 70, 480, 20);
		
		paine.add(lblBairro);
		paine.add(txtBairro);
		lblBairro.setBounds(220,90,100,20);
		txtBairro.setBounds(2, 110, 480, 20);
		
		paine.add(lblCep);
		paine.add(txtCep);
		lblCep.setBounds(225,130,100,20);
		txtCep.setBounds(2, 150, 480, 20);
		
		paine.add(lblCidade);
		paine.add(txtCidade);
		lblCidade.setBounds(220,170,100,20);
		txtCidade.setBounds(2, 190, 480, 20);
		
		paine.add(lblEstado);
		paine.add(txtEstado);
		lblEstado.setBounds(220,210,100,20);
		txtEstado.setBounds(2, 230, 480, 20);
		
		paine.add(lblTelefone);
		paine.add(txtTelefone);
		lblTelefone.setBounds(215,250,100,20);
		txtTelefone.setBounds(2, 270, 480, 20);
		
		paine.add(lblCelular);
		paine.add(txtCelular);
		lblCelular.setBounds(220,290,100,20);
		txtCelular.setBounds(2, 310, 480, 20);
		
		paine.add(lblSexo);
		paine.add(txtSexo);
		lblSexo.setBounds(225,330,100,20);
		txtSexo.setBounds(2, 350, 480, 20);
		
		paine.add(lblRg);
		paine.add(txtRg);
		lblRg.setBounds(230,370,100,20);
		txtRg.setBounds(2, 390, 480, 20);
		
		paine.add(lblCpf);
		paine.add(txtCpf);
		lblCpf.setBounds(230,410,100,20);
		txtCpf.setBounds(2, 430, 480, 20);
		
		paine.add(btnEnviar);
		btnEnviar.setBounds(100, 480, 100, 50);
		
		paine.add(btnLimpar);
		btnLimpar.setBounds(300, 480, 100, 50);

		//this.setExtendedState(MAXIMIZED_BOTH); <--coloca fullScrenn.
		this.setSize(500, 600);
		this.setVisible(true);
		this.setLocation(500, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Menu mn = new Menu();
	}
}
