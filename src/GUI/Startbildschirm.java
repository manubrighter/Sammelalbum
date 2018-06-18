package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Startbildschirm extends JFrame implements ActionListener {
	
	//Erstellung der GUI Elemente
	private JButton bAlbumAnsehen;
	private JButton bPaeckchenOeffnen;
	private JButton bNeustarten;
	private JButton bProgrammBeenden;
	private JLabel lblFussballbilderSammelalbum;
	
	//Erstellung Schriften
	private Font Font50 = new Font("Arial", Font.BOLD, 50);
	private Font Font40 = new Font("Arial", Font.BOLD, 40);
	private Font Font20 = new Font("Arial", Font.BOLD, 20);
	
	
	

	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		//GUI Elemente beschriftet
		bAlbumAnsehen = new JButton("Album Ansehen");
		bPaeckchenOeffnen = new JButton ("P�ckchen �ffnen");
		bNeustarten = new JButton ("Neustarten");
		bProgrammBeenden = new JButton ("Beenden");
		lblFussballbilderSammelalbum = new JLabel ("Fussballbilder Sammelalbum");
		
	}

}
