/*ToDo
 * Alle Buttons Designen und visible machen
 * Layout integrieren (border?, grid? card?)
 * Action Listener Befehle
 */







package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Startbildschirm extends JFrame implements ActionListener{
	
	//Erstellung der GUI Elemente
	private JButton bAlbumAnsehen;
	private JButton bPaeckchenOeffnen;
	private JButton bNeustarten;
	private JButton bProgrammBeenden;
	private JLabel lblFussballbilderSammelalbum;
	private JPanel pStartbildschirm;
	
	//Erstellung Schriften
	private Font Font50 = new Font("Arial", Font.BOLD, 50);
	private Font Font40 = new Font("Arial", Font.BOLD, 40);
	private Font Font20 = new Font("Arial", Font.BOLD, 20);
	
	public Startbildschirm()
	{
		//Anzeige Fenster erstellen (provisorische Werte) und sichtbar machen
		this.setLayout(null);
		this.setResizable(false); //Fenstergrösse ist nicht veränderbar
		this.setSize(1150, 650); //Grösse des Fensters definieren
		this.setLocation(530, 350); //Ort des Fensters definieren
		this.setVisible(true);
		
		
		
		//GUI Elemente beschriften und Designen
		bAlbumAnsehen = new JButton("Album Ansehen");

		bAlbumAnsehen.setBounds(100,100,100,100);
		bAlbumAnsehen.setVisible(true);
		
		bPaeckchenOeffnen = new JButton ("P�ckchen �ffnen");

		bNeustarten = new JButton ("Neustarten");
		
		bProgrammBeenden = new JButton ("Beenden");
		
		lblFussballbilderSammelalbum = new JLabel ("Fussballbilder Sammelalbum");
		
		
		
		//Panel Design und ins Fenster adden
		pStartbildschirm = new JPanel ();
		pStartbildschirm.setBounds(0 ,0 ,1150 ,650);
		this.add(pStartbildschirm);

		
		
	}
	

	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		//GUI Elemente beschriftet
		bAlbumAnsehen = new JButton("Album Ansehen");
		bPaeckchenOeffnen = new JButton ("Päckchen öffnen");
		bNeustarten = new JButton ("Neustarten");
		bProgrammBeenden = new JButton ("Beenden");
		lblFussballbilderSammelalbum = new JLabel ("Fussballbilder Sammelalbum");
		
	}

}
