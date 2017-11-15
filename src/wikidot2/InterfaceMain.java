package wikidot2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class InterfaceMain extends JFrame{
	Agenda agenda = new Agenda();
	JMenuBar menuBar = new JMenuBar();

	JMenu menuAgenda = new JMenu("Agenda");
	JMenu menuEstilo = new JMenu("Estilo");
	
	JMenuItem openAgenda = new JMenuItem("Abrir Agenda");
	JMenuItem closeAgenda = new JMenuItem("Fechar Agenda");
    
    JCheckBoxMenuItem checkAction = new JCheckBoxMenuItem("Check Action");
    
    ButtonGroup bg = new ButtonGroup();   
    JRadioButtonMenuItem normal = new JRadioButtonMenuItem("Normal");
    JRadioButtonMenuItem windows = new JRadioButtonMenuItem("Windows");
    
	public InterfaceMain() {
		super("Frame Principal");
		Container paine = this.getContentPane();
		paine.setLayout(null);

		setJMenuBar(menuBar);
		
		menuBar.add(menuAgenda);
		menuBar.add(menuEstilo);
		
		menuAgenda.add(openAgenda);
		openAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paine.remove(agenda);
				paine.add(agenda);
				agenda.setVisible(true);
			}
		});
		
		menuAgenda.addSeparator();
		menuAgenda.add(closeAgenda);
		closeAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agenda.setVisible(false);
				paine.remove(agenda);
			}
		});
		
		bg.add(normal);
		bg.add(windows);

		normal.setSelected(true);
		menuEstilo.add(normal);
		menuEstilo.add(windows);
		
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setExtendedState(MAXIMIZED_BOTH);
	}
}
