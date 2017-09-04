package calculadora;

import java.awt.Color;
import java.awt.Container;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Calculadora extends JFrame {

	JTextField txtVisor = new JTextField();
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btn0 = new JButton("0");
	JButton btnVirgula = new JButton(",");
	JButton btnIgual = new JButton("=");
	JButton btnAdicao = new JButton("+");
	JButton btnSubtracao = new JButton("-");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnMulti = new JButton("*");
	JButton btnDiv = new JButton("/");
	JButton btnBS = new JButton("◄");
	
	public Calculadora() {
		super("Calculation");
		Container paine = this.getContentPane();
		
		//
		//VISOR
		//
		paine.add(txtVisor);
		txtVisor.setSize(290, 50);
		txtVisor.setBorder(null);
		txtVisor.setBackground(new java.awt.Color(0, 255, 255));
		CompoundBorder innerCompound = null;
		CompoundBorder outerCompound = null;
		innerCompound = new CompoundBorder(new EmptyBorder(0, 30, 0, 30), new EmptyBorder(0,0,0,0));
		outerCompound = new CompoundBorder(new LineBorder(new Color(80, 60, 140), 5), innerCompound);
		txtVisor.setBorder(outerCompound);
		//
		//VISOR
		//
		
		//
		//BackSpace
		//
		paine.add(btnBS);
		btnBS.setBounds(290, 5, 90, 40);
		btnBS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().length()>1) {
					txtVisor.setText(""+txtVisor.getText().subSequence(0, txtVisor.getText().length()-1));
				}
				else if(txtVisor.getText().length()==0) {
					txtVisor.setText(""+0);
				}
			}
		});
		//
		//BackSpace
		//
		
		//
		//CE -- apaga o ultimo
		//
		paine.add(btnCE);
		btnCE.setBounds(5, 50, 90, 50);
		//
		//CE -- apaga o ultimo
		//
		
		//
		//C -- apaga tudo
		//
		paine.add(btnC);
		btnC.setBounds(100, 50, 90, 50);
		//
		//C -- apaga tudo
		//
		
		//
		//*
		//
		paine.add(btnMulti);
		btnMulti.setBounds(195, 50, 90, 50);
		//
		//*
		//
		
		//
		///
		//
		paine.add(btnDiv);
		btnDiv.setBounds(290, 50, 90, 50);
		//
		///
		//
		
		//
		//7
		//
		paine.add(btn7);
		btn7.setBounds(5, 105, 90, 50);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText()+"7");
			}
		});
		//
		//7
		//

		//
		//8
		//
		paine.add(btn8);
		btn8.setBounds(100, 105, 90, 50);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText()+"8");
			}
		});
		//
		//8
		//
		
		//
		//9
		//
		paine.add(btn9);
		btn9.setBounds(195, 105, 90, 50);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText()+"9");
			}
		});
		//
		//9
		//

		//
		//4
		//
		paine.add(btn4);
		btn4.setBounds(5, 160, 90, 50);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText()+"4");
			}
		});
		//
		//4
		//
		
		//
		//5
		//
		paine.add(btn5);
		btn5.setBounds(100, 160, 90, 50);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText()+"5");
			}
		});
		//
		//5
		//
		
		//
		//6
		//
		paine.add(btn6);
		btn6.setBounds(195, 160, 90, 50);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText()+"6");
			}
		});
		//
		//6
		//
		
		//
		//1
		//
		paine.add(btn1);
		btn1.setBounds(5, 215, 90, 50);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText()+"1");
			}
		});
		//
		//1
		//
		
		//
		//2
		//
		paine.add(btn2);
		btn2.setBounds(100, 215, 90, 50);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText()+"2");
			}
		});
		//
		//2
		//
		
		//
		//3
		//
		paine.add(btn3);
		btn3.setBounds(195, 215, 90, 50);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText()+"3");
			}
		});
		//
		//3
		//
		
		//
		//0
		//
		paine.add(btn0);
		btn0.setBounds(5, 270, 185, 50);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText()+"0");
			}
		});
		//
		//0
		//
		
		//
		//,
		//
		paine.add(btnVirgula);
		btnVirgula.setBounds(195, 270, 90, 50);
		//
		//,
		//
		
		//
		//=
		//
		paine.add(btnIgual);
		btnIgual.setBounds(290, 215, 90, 105);
		//
		//=
		//
		
		//
		//+
		//
		paine.add(btnAdicao);
		btnAdicao.setBounds(290, 105, 90, 50);
		//
		//+
		//
		
		//
		//-
		//
		paine.add(btnSubtracao);
		btnSubtracao.setBounds(290, 160, 90, 50);
		//
		//-
		//
		
		
		
		paine.setLayout(null);
		paine.setBackground(new Color(80, 60, 140));
		this.setSize(402, 363);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Calculadora calc = new Calculadora();
	}
}
