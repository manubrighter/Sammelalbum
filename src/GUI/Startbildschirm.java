







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

public class Startbildschirm extends JFrame implements ActionListener {
	
	
	//Erstellung der GUI Elemente
	private JButton bAlbumAnsehen;
	private JButton bPaeckchenOeffnen;  
	private JButton bProgrammBeenden;
	private JLabel lblFussballbilderSammelalbum;
	private JLabel lblNeustarten;
	private JPanel pStartbildschirm;
	
	//Erstellung Schriften
	private Font Font50 = new Font("Arial", Font.BOLD, 50);
	private Font Font40 = new Font("Arial", Font.BOLD, 40);
	private Font Font30 = new Font("Arial", Font.BOLD, 30);
	private Font Font20 = new Font("Arial", Font.BOLD, 20);
	
	//Erstellung Farben
	private Color myblue = new Color(66, 203, 244);
	private Color myred = new Color(249, 79, 105);
	private Color mygreen = new Color(161, 249, 78); 
	
	public Startbildschirm()
	{
		//Anzeige Fenster erstellen (provisorische Werte) und sichtbar machen
		this.setLayout(null);
		this.setResizable(false); //Fenstergrösse ist nicht verÃ¤nderbar
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

		lblNeustarten = new JLabel ("© by Manuel Heller and Jimoh Meyer");
		lblNeustarten.setHorizontalAlignment(SwingConstants.CENTER);
		lblNeustarten.setVerticalAlignment(SwingConstants.CENTER);
		lblNeustarten.setFont(Font30);
		lblNeustarten.setOpaque(true);;
		lblNeustarten.setBackground(mygreen);
		lblNeustarten.setVisible(true);
		
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
		pStartbildschirm.add(lblNeustarten, BorderLayout.NORTH);
		pStartbildschirm.add(lblFussballbilderSammelalbum, BorderLayout.CENTER);
		pStartbildschirm.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
		

	}
	

	

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if (ae.getSource() == bAlbumAnsehen)
		{
			Album album = new Album();
		}
		
		if (ae.getSource() == bPaeckchenOeffnen)
		{
			bPaeckchenOeffnen.setText("Funktion nicht einsatzbereit");
		}
		
		if (ae.getSource() == lblNeustarten)
		{
			//Reset Pictures
			//Meldung "Neugestartet
		}
		
		if (ae.getSource() == bProgrammBeenden)
		{
			System.exit(0); //beendet Programm
		}
		
	}

}
