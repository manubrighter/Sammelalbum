/*ToDo
 * Schön machen (Margin etc)
 * Fonts anwenden
 * Action Listener Befehle
 */







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
	private Font Font30 = new Font("Arial", Font.BOLD, 30);
	private Font Font20 = new Font("Arial", Font.BOLD, 20);
	
	public Startbildschirm()
	{
		//Anzeige Fenster erstellen (provisorische Werte) und sichtbar machen
		this.setLayout(null);
		this.setResizable(false); //FenstergrÃ¶sse ist nicht verÃ¤nderbar
		this.setSize(1150, 650); //GrÃ¶sse des Fensters definieren
		this.setLocation(530, 350); //Ort des Fensters definieren
		this.setVisible(true);
		
		
		
		//GUI Elemente beschriften und Designen
		bAlbumAnsehen = new JButton("    Album Ansehen");
		bAlbumAnsehen.setFont(Font30);
		bAlbumAnsehen.setVisible(true);
		
		bPaeckchenOeffnen = new JButton ("Päckchen öffnen");
		bPaeckchenOeffnen.setFont(Font30);
		bPaeckchenOeffnen.setVisible(true);

		bNeustarten = new JButton ("Neustarten");
		bNeustarten.setFont(Font30);
		bNeustarten.setVisible(true);
		
		bProgrammBeenden = new JButton ("Beenden");
		bProgrammBeenden.setFont(Font30);
		bProgrammBeenden.setVisible(true);
		
		lblFussballbilderSammelalbum = new JLabel ("Fussballbilder Sammelalbum");
		lblFussballbilderSammelalbum.setVerticalAlignment(JLabel.CENTER);
		lblFussballbilderSammelalbum.setHorizontalAlignment(JLabel.CENTER);
		lblFussballbilderSammelalbum.setFont(Font30);
		lblFussballbilderSammelalbum.setVisible(true);
		
		
		
		//Panel Design und ins Fenster adden
		pStartbildschirm = new JPanel ();
		pStartbildschirm.setBounds(0 ,0 ,1150 ,620);
		pStartbildschirm.setBackground(Color.blue);
		this.add(pStartbildschirm);
		
		//Border Layout für pStartbildschirm
		pStartbildschirm.setLayout(new BorderLayout());
		pStartbildschirm.add(bAlbumAnsehen, BorderLayout.WEST);
		pStartbildschirm.add(bPaeckchenOeffnen, BorderLayout.EAST);
		pStartbildschirm.add(bProgrammBeenden, BorderLayout.SOUTH);
		pStartbildschirm.add(bNeustarten, BorderLayout.NORTH);
		pStartbildschirm.add(lblFussballbilderSammelalbum, BorderLayout.CENTER);
		pStartbildschirm.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
		

		
		
	}
	

	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		//GUI Elemente beschriftet
		bAlbumAnsehen = new JButton("Album Ansehen");
		bPaeckchenOeffnen = new JButton ("PÃ¤ckchen Ã¶ffnen");
		bNeustarten = new JButton ("Neustarten");
		bProgrammBeenden = new JButton ("Beenden");
		lblFussballbilderSammelalbum = new JLabel ("Fussballbilder Sammelalbum");
		
	}

}
