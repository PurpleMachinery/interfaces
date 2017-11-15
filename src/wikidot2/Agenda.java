package wikidot2;

import javax.swing.JInternalFrame;

public class Agenda extends JInternalFrame{
	public Agenda(){
		this.setVisible(true);
		this.setSize(500,500);
		this.setResizable(true);
		this.setMaximizable(true);
		this.setClosable(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
