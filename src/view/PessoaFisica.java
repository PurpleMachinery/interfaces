package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import javax.swing.text.MaskFormatter;

public class PessoaFisica extends JFrame {

	MaskFormatter formaCep = null;
	MaskFormatter formaTel = null;
	MaskFormatter formaCel = null;
	MaskFormatter formaRg = null;
	MaskFormatter formaCpf = null;

	JLabel lblNome = new JLabel("Nome");
	JLabel lblSexo = new JLabel("Sexo");
	JLabel lblEndereco = new JLabel("Endereço");
	JLabel lblBairro = new JLabel("Bairro");
	JLabel lblCep = new JLabel("CEP");
	JLabel lblCidade = new JLabel("Cidade");
	JLabel lblEstado = new JLabel("Estado");
	JLabel lblTelefone = new JLabel("Telefone");
	JLabel lblCelular = new JLabel("Celular");
	JLabel lblRg = new JLabel("RG");
	JLabel lblCpf = new JLabel("CPF");

	ButtonGroup group = new ButtonGroup();
	JRadioButton rdnSexo[] = new JRadioButton[2];

	JComboBox combEstado = new JComboBox();

	JTextField txtNome = new JTextField();
	JTextField txtEndereco = new JTextField();
	JTextField txtBairro = new JTextField();
	JTextField txtCep = new JTextField();
	JTextField txtCidade = new JTextField();
	JTextField txtEstado = new JTextField();
	JTextField txtTelefone = new JTextField();
	JTextField txtCelular = new JTextField();
	JTextField txtRg = new JTextField();
	JTextField txtCpf = new JTextField();

	JButton btnSalvar = new JButton("Enviar");
	JButton btnImprimir = new JButton ("Imprimir");
	JButton btnLimpar = new JButton("Limpar");

	public PessoaFisica() {
		Container paine = this.getContentPane();
		paine.setLayout(null);
		BasicComboBoxRenderer.UIResource UIResource = new BasicComboBoxRenderer.UIResource();
		UIResource.setHorizontalAlignment(SwingConstants.CENTER);

		paine.add(lblNome);
		paine.add(txtNome);
		txtNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(220, 10, 100, 20);
		txtNome.setBounds(2, 30, 480, 20);

		paine.add(lblEndereco);
		paine.add(txtEndereco);
		txtEndereco.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndereco.setBounds(210, 50, 100, 20);
		txtEndereco.setBounds(2, 70, 480, 20);

		paine.add(lblBairro);
		paine.add(txtBairro);
		txtBairro.setHorizontalAlignment(SwingConstants.CENTER);
		lblBairro.setBounds(220, 90, 100, 20);
		txtBairro.setBounds(2, 110, 480, 20);

		try {
			formaCep = new MaskFormatter("#####-###");
			txtCep = new JFormattedTextField(formaCep);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		paine.add(lblCep);
		paine.add(txtCep);
		txtCep.setHorizontalAlignment(SwingConstants.CENTER);
		lblCep.setBounds(225, 130, 100, 20);
		txtCep.setBounds(2, 150, 480, 20);

		paine.add(lblCidade);
		paine.add(txtCidade);
		txtCidade.setHorizontalAlignment(SwingConstants.CENTER);
		lblCidade.setBounds(220, 170, 100, 20);
		txtCidade.setBounds(2, 190, 480, 20);

		paine.add(lblEstado);
		paine.add(combEstado);
		combEstado.setRenderer(UIResource);
		combEstado.setBackground(new Color(255, 255, 255));
		combEstado.addItem("Acre");
		combEstado.addItem("Alagoas");
		combEstado.addItem("Amapá");
		combEstado.addItem("Amazonas");
		combEstado.addItem("Bahia");
		combEstado.addItem("Ceará");
		combEstado.addItem("Distrito Federal");
		combEstado.addItem("Espírito Santo");
		combEstado.addItem("Goiás");
		combEstado.addItem("Maranhão");
		combEstado.addItem("Mato Grosso");
		combEstado.addItem("Mato Grosso do Sul");
		combEstado.addItem("Minas Gerais");
		combEstado.addItem("Pará");
		combEstado.addItem("Paraíba");
		combEstado.addItem("Paraná");
		combEstado.addItem("Pernambuco");
		combEstado.addItem("Piauí");
		combEstado.addItem("Rio de Janeiro");
		combEstado.addItem("Rio Grande do Norte");
		combEstado.addItem("Rio Grande do Sul");
		combEstado.addItem("Rondônia");
		combEstado.addItem("Roraima");
		combEstado.addItem("Santa Catarina");
		combEstado.addItem("São Paulo");
		combEstado.addItem("Sergipe");
		combEstado.addItem("Tocantins");
		lblEstado.setBounds(220, 210, 100, 20);
		combEstado.setBounds(2, 230, 480, 20);

		try {
			formaTel = new MaskFormatter("(##) ####-####");
			txtTelefone = new JFormattedTextField(formaTel);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		paine.add(lblTelefone);
		paine.add(txtTelefone);
		txtTelefone.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefone.setBounds(215, 250, 100, 20);
		txtTelefone.setBounds(2, 270, 480, 20);

		try {
			formaCel = new MaskFormatter("(##) 9####-####");
			txtCelular = new JFormattedTextField(formaCel);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		paine.add(lblCelular);
		paine.add(txtCelular);
		txtCelular.setHorizontalAlignment(SwingConstants.CENTER);
		lblCelular.setBounds(220, 290, 100, 20);
		txtCelular.setBounds(2, 310, 480, 20);

		try {// 50.850.901-4
			formaRg = new MaskFormatter("##.###.###-A");
			txtRg = new JFormattedTextField(formaRg);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		paine.add(lblRg);
		paine.add(txtRg);
		txtRg.setHorizontalAlignment(SwingConstants.CENTER);
		lblRg.setBounds(230, 330, 100, 20);
		txtRg.setBounds(2, 350, 480, 20);

		try {// 490.042.328-93
			formaCpf = new MaskFormatter("###.###.###-##");
			txtCpf = new JFormattedTextField(formaCpf);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		paine.add(lblCpf);
		paine.add(txtCpf);
		txtCpf.setHorizontalAlignment(SwingConstants.CENTER);
		lblCpf.setBounds(230, 370, 100, 20);
		txtCpf.setBounds(2, 390, 480, 20);

		paine.add(lblSexo);
		lblSexo.setBounds(225, 410, 100, 20);
		rdnSexo[0] = new JRadioButton("Feminino");
		rdnSexo[1] = new JRadioButton("Masculino");
		paine.add(rdnSexo[0]);
		paine.add(rdnSexo[1]);
		group.add(rdnSexo[0]);
		group.add(rdnSexo[1]);
		rdnSexo[0].setBounds(150, 430, 100, 20);
		rdnSexo[1].setBounds(250, 430, 100, 20);

		paine.add(btnSalvar);
		btnSalvar.setBounds(100, 500, 100, 50);
		paine.add(btnImprimir);
		btnImprimir.setBounds(200, 500, 100, 50);

		paine.add(btnLimpar);
		btnLimpar.setBounds(300, 500, 100, 50);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBairro.setText("");
				txtCelular.setText("");
				txtCep.setText("");
				txtCidade.setText("");
				txtCpf.setText("");
				txtEndereco.setText("");
				txtEstado.setText("");
				txtNome.setText("");
				txtRg.setText("");
				txtTelefone.setText("");
			}
		});

		// this.setExtendedState(MAXIMIZED_BOTH); <--coloca fullScrenn.
		this.setSize(500, 600);
		this.setVisible(true);
		this.setLocation(500, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		PessoaFisica mn = new PessoaFisica();
	}
}
