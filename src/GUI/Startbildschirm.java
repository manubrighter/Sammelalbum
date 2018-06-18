package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Startbildschirm extends JFrame implements ActionListener {
	
	//Erstellung der GUI Elemente
	private JButton albumAnsehen;
	private JButton paeckchenOeffnen;
	private JButton neustarten;
	private JButton programmBeenden;
	private JLabel fussballbilderSammelalbum;
	
	//Erstellung Schriften
	private Font Font50 = new Font("Arial", Font.BOLD, 50);
	private Font Font40 = new Font("Arial", Font.BOLD, 40);
	private Font Font20 = new Font("Arial", Font.BOLD, 20);

	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}

}
