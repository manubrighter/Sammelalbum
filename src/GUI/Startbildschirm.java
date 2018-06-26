package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Startbildschirm GUI
 * @author Jimoh Meyer & Manuel Heller
 *
 */
public class Startbildschirm extends JFrame implements ActionListener {
	
	
	//Initialisierung der GUI Variablen
	private JButton bAlbumAnsehen;
	private JButton bPaeckchenOeffnen;  
	private JButton bProgrammBeenden;
	private JLabel lblFussballbilderSammelalbum;
	private JLabel lblCopyright;
	private JPanel pStartbildschirm;
	
	//Erstellung der Schriften Objekte
	private Font Font50 = new Font("Arial", Font.BOLD, 50);
	private Font Font40 = new Font("Arial", Font.BOLD, 40);
	private Font Font30 = new Font("Arial", Font.BOLD, 30);
	private Font Font20 = new Font("Arial", Font.BOLD, 20);
	
	//Erstellung der Farben Objekte
	private Color myblue = new Color(66, 203, 244);
	private Color myred = new Color(249, 79, 105);
	private Color mygreen = new Color(161, 249, 78); 
	
	public Startbildschirm()
	{
		//Anzeige Fenster erstellen sichtbar machen
		this.setLayout(null);
		this.setResizable(false); //Fenstergrösse ist nicht veraenderbar
		this.setSize(1150, 650); //Grösse des Fensters definieren
		this.setLocation(400, 200); //Ort des Fensters definieren
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //das Programm beenden wenn man es schliesst
		
		
		
		//GUI Elemente beschriften und Designen
		bAlbumAnsehen = new JButton("Album Ansehen");
		bAlbumAnsehen.setFont(Font30);
		bAlbumAnsehen.setBackground(mygreen);
		bAlbumAnsehen.setVisible(true);
		bAlbumAnsehen.addActionListener(this);
		
		bPaeckchenOeffnen = new JButton ("Päckchen öffnen");
		bPaeckchenOeffnen.setFont(Font30);
		bPaeckchenOeffnen.setBackground(mygreen);
		bPaeckchenOeffnen.setVisible(true);
		bPaeckchenOeffnen.addActionListener(this);

		lblCopyright = new JLabel ("© by Manuel Heller and Jimoh Meyer");
		lblCopyright.setHorizontalAlignment(SwingConstants.CENTER);
		lblCopyright.setVerticalAlignment(SwingConstants.CENTER);
		lblCopyright.setFont(Font30);
		lblCopyright.setOpaque(true);;
		lblCopyright.setBackground(mygreen);
		lblCopyright.setVisible(true);
		
		bProgrammBeenden = new JButton ("Beenden");
		bProgrammBeenden.setFont(Font30);
		bProgrammBeenden.setBackground(mygreen);
		bProgrammBeenden.setVisible(true);
		bProgrammBeenden.addActionListener(this);
		
		lblFussballbilderSammelalbum = new JLabel ("Fussballbilder Sammelalbum");
		lblFussballbilderSammelalbum.setVerticalAlignment(JLabel.CENTER);
		lblFussballbilderSammelalbum.setHorizontalAlignment(JLabel.CENTER);
		lblFussballbilderSammelalbum.setFont(Font30);
		lblFussballbilderSammelalbum.setOpaque(true); //Transparent zur Anpassung der Hintergrundfarbe
		lblFussballbilderSammelalbum.setBackground(myred);
		lblFussballbilderSammelalbum.setVisible(true);
		
		
		
		//Panel Design und ins Fenster adden
		pStartbildschirm = new JPanel ();
		pStartbildschirm.setBounds(0 ,0 ,1150 ,620);
		pStartbildschirm.setBackground(myblue);
		this.add(pStartbildschirm);
		
		//Border Layout für pStartbildschirm
		pStartbildschirm.setLayout(new BorderLayout());
		pStartbildschirm.add(bAlbumAnsehen, BorderLayout.WEST);
		pStartbildschirm.add(bPaeckchenOeffnen, BorderLayout.EAST);
		pStartbildschirm.add(bProgrammBeenden, BorderLayout.SOUTH);
		pStartbildschirm.add(lblCopyright, BorderLayout.NORTH);
		pStartbildschirm.add(lblFussballbilderSammelalbum, BorderLayout.CENTER);
		pStartbildschirm.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
		

	}
	

	
	/**
	 * Alle funktionen des Startbildschirms
	 */
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		//weiterleitung zur Album Klasse
		if (ae.getSource() == bAlbumAnsehen)
		{
			Album album = new Album();
		}
		
		//weiterleitung zur PaeckchenOeffnen Klasse
		else if (ae.getSource() == bPaeckchenOeffnen)
		{
			bPaeckchenOeffnen.setText("Funktion nicht einsatzbereit");
		}
		
		//beendet das Programm
		else if (ae.getSource() == bProgrammBeenden)
		{
			System.exit(0);
		}
		
	}

}
