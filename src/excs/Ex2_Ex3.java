package excs;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

import org.w3c.dom.css.CSSPrimitiveValue;
import org.w3c.dom.css.RGBColor;

public class Ex2_Ex3 extends JFrame{
	JTextField txbG = new JTextField();
	
	JLabel lbl = new JLabel("Resultado");
	
	JButton btn= new JButton("Calcular");
	
	ButtonGroup group = new ButtonGroup();
	JRadioButton rdb[] = new JRadioButton[2];
	
	
	//JRadioButtonMenuItem 
	
	public Ex2_Ex3(){
		Container paine = this.getContentPane();
		paine.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		paine.add(txbG);
		txbG.setBounds(0,0,485,50);
		
		rdb[0]= new JRadioButton("Celsius");
		rdb[1]=new JRadioButton("Fahrenheit");
		paine.add(rdb[0]);
		paine.add(rdb[1]);
		rdb[0].setBounds(100,100,80,20);
		rdb[1].setBounds(180,100,100,20);
		group.add(rdb[0]);
		group.add(rdb[1]);
		
		paine.add(lbl);
		lbl.setBounds(200,200,200,100);	
		
		paine.add(btn);
		btn.setBounds(0, 362, this.getWidth()-15, 100);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdb[1].isSelected()){
					lbl.setText("Fahrenheit: "+((Double.parseDouble(txbG.getText())-32)/1.8));
				}
				else if(rdb[0].isSelected()) {
					lbl.setText("Celsius: "+((Double.parseDouble(txbG.getText())*1.8)+32));
				}
				
			}
		});
		
	}
	public static void main(String args[]) {
		Ex2_Ex3 ex = new Ex2_Ex3();
	}
}
