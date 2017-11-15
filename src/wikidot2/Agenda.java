package wikidot2;

import java.awt.Color;

import javax.swing.JInternalFrame;

public class Agenda extends JInternalFrame{
	public Agenda(){
		super("Agenda");
		this.setBackground(Color.BLUE);
		this.setVisible(true);
		this.setSize(500,500);
		this.setResizable(true);
		this.setMaximizable(true);
		this.setClosable(true);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
	}
}
