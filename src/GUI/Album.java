package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Logik.HauptLogik;

/**
 * Album GUI 
 * @author Jimoh Meyer & Manuel Heller
 *
 */
public class Album extends JFrame implements ActionListener{
	
	
	//Objekte erstellen
	private HauptLogik hauptlogik = new HauptLogik();
	
	
	//Variablen initialisieren///////////////////   Schweiz   /////////////////////////////////////////////////////////////////////////
	private JButton bNaechsteSeite, bVorherigeSeite, bName1, bName2, bName3, bName4;
	private JLabel lblBild1, lblBild2, lblBild3, lblBild4,lblStatistik1, lblStatistik2, lblStatistik3, lblStatistik4, lblSchweiz, lblStatistik5, lblStatistik6, lblStatistik7, lblStatistik8;
	private JPanel pCHAlbum, pTopCHAlbum, pSpielerAngaben, pSpielerNamen, pSpielerBilder, pSpielerStats, pStatistik1, pStatistik2, pStatistik3, pStatistik4;

	
	//Variablen initialisieren/////////////////   UNPARTEIISCHE   /////////////////////////////////////////////////////////////////////
	private JButton bREFNaechsteSeite, bREFVorherigeSeite, bREFEinkleben, bREFName1, bREFName2, bREFName3, bREFName4;
	private JLabel lblREFBild1, lblREFBild2, lblREFBild3, lblREFBild4, lblREFStatistik1, lblREFStatistik2, lblREFStatistik3, lblREFStatistik4, lblREFStatistik5, lblREFStatistik6, lblREFStatistik7, lblREFStatistik8, lblRefree;  
	private JPanel pREFAlbum, pREFTopCHAlbum, pREFSpielerAngaben, pREFSpielerNamen, pREFSpielerBilder, pREFSpielerStats, pREFStatistik1, pREFStatistik2, pREFStatistik3, pREFStatistik4;
	
	
	//Schriften und Farben definieren
	private Font Font50 = new Font("Arial", Font.BOLD, 50);
	private Font Font40 = new Font("Arial", Font.BOLD, 40);
	private Font Font20 = new Font("Arial", Font.BOLD, 20);
	private Font Font15 = new Font("Arial", Font.BOLD, 15);
	
	private Color mygreen = new Color(161, 249, 78);
	private Color myred = new Color (255, 80, 80);
	private Color myblue = new Color (102, 204, 255);
	

	/**
	 * Das Album GUI erstellen
	 */
	public Album() {
		this.setLayout(null); 
		this.setResizable(false); //Fenstergrösse ist nicht veränderbar
		this.setSize(1150, 650); //Grösse des Fensters definieren
		this.setLocation(530, 350); //Ort des Fensters definieren
		
		//Spieler und Bilder erstellen
		hauptlogik.MenschListenLogik();
		hauptlogik.BildListenLogik();
		
		////////////////////////////////////////////   Schweiz   /////////////////////////////////////////////////////////////////////
		 
		//Schweiz Bausteine definieren
		lblBild1 = new JLabel();
		lblBild2 = new JLabel();
		lblBild3 = new JLabel();
		lblBild4 = new JLabel();
		lblSchweiz= new JLabel("Schweiz");
		lblStatistik1 = new JLabel("Statistik");
		lblStatistik2 = new JLabel("Statistik");
		lblStatistik3 = new JLabel("Statistik");
		lblStatistik4 = new JLabel("Statistik");
		lblStatistik5 = new JLabel(hauptlogik.getMenschenListe(0));
		lblStatistik6 = new JLabel(hauptlogik.getMenschenListe(1));
		lblStatistik7 = new JLabel(hauptlogik.getMenschenListe(2));
		lblStatistik8 = new JLabel(hauptlogik.getMenschenListe(3));
		
		bNaechsteSeite = new JButton("Nächste Seite");
		bVorherigeSeite = new JButton("Vorherige Seite");
		bName1 = new JButton("Johan Djourou");
		bName2 = new JButton("Granit Xhaka");
		bName3 = new JButton("Manuel Akanji");
		bName4 = new JButton("Vladimir Petkovic");
		
	
		pCHAlbum = new JPanel();
		pTopCHAlbum = new JPanel();
		pSpielerAngaben = new JPanel();
		pSpielerNamen = new JPanel();
		pSpielerBilder = new JPanel();
		pSpielerStats = new JPanel(); 
		pStatistik1 = new JPanel();
		pStatistik2 = new JPanel();
		pStatistik3 = new JPanel();
		pStatistik4 = new JPanel();
		
		
		//Grösse des Fensters definieren
		pCHAlbum.setBounds(0, 0, 1150, 650); 

		
		//Hinzufügen und definieren der GUI Elemente
		this.add(pCHAlbum);
		pCHAlbum.setBackground(mygreen);
		pCHAlbum.setBorder(BorderFactory.createEmptyBorder(15/*top*/, 40/*left*/, 100/*bottom*/, 40/*right*/));
		
		pCHAlbum.setLayout(new BorderLayout());
		pCHAlbum.add(pTopCHAlbum, BorderLayout.NORTH);
		pCHAlbum.add(pSpielerAngaben, BorderLayout.CENTER);
		
		
		pTopCHAlbum.setBackground(Color.PINK);
		pTopCHAlbum.setLayout(new BorderLayout());
		pTopCHAlbum.add(lblSchweiz, BorderLayout.CENTER);
		pTopCHAlbum.add(bNaechsteSeite, BorderLayout.EAST);
		pTopCHAlbum.add(bVorherigeSeite, BorderLayout.WEST);
		
		lblSchweiz.setFont(Font50);
		lblSchweiz.setHorizontalAlignment(SwingConstants.CENTER);
		lblSchweiz.setVerticalAlignment(SwingConstants.CENTER);
		
		bNaechsteSeite.setBackground(myblue);
		bVorherigeSeite.setBackground(myblue);
		bNaechsteSeite.setFont(Font20);
		bVorherigeSeite.setFont(Font20);
		
		
		pSpielerAngaben.setLayout(new BorderLayout());
		pSpielerAngaben.add(pSpielerNamen, BorderLayout.NORTH);
		pSpielerAngaben.add(pSpielerBilder, BorderLayout.CENTER);
		pSpielerAngaben.add(pSpielerStats, BorderLayout.SOUTH);
		
		pSpielerNamen.setBackground(myred);
		pSpielerNamen.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		pSpielerNamen.setLayout(new GridLayout(1, 4, 10, 10));
		pSpielerNamen.add(bName1);
		pSpielerNamen.add(bName2);
		pSpielerNamen.add(bName3);
		pSpielerNamen.add(bName4);
		
		bName1.setBackground(myblue);
		bName2.setBackground(myblue);
		bName3.setBackground(myblue);
		bName4.setBackground(myblue);
		
		bName1.setFont(Font20);
		bName2.setFont(Font20);
		bName3.setFont(Font20);
		bName4.setFont(Font20);

		bName1.setHorizontalAlignment(SwingConstants.CENTER);
		bName1.setVerticalAlignment(SwingConstants.CENTER);
		bName2.setHorizontalAlignment(SwingConstants.CENTER);
		bName2.setVerticalAlignment(SwingConstants.CENTER);
		bName3.setHorizontalAlignment(SwingConstants.CENTER);
		bName3.setVerticalAlignment(SwingConstants.CENTER);
		bName4.setHorizontalAlignment(SwingConstants.CENTER);
		bName4.setVerticalAlignment(SwingConstants.CENTER);
		
		
		pSpielerBilder.setBackground(myblue);
		pSpielerBilder.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		pSpielerBilder.setLayout(new GridLayout(1, 4, 10, 10));
		pSpielerBilder.add(lblBild1);
		pSpielerBilder.add(lblBild2);
		pSpielerBilder.add(lblBild3);
		pSpielerBilder.add(lblBild4);	

		lblBild1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBild1.setVerticalAlignment(SwingConstants.CENTER);
		lblBild2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBild2.setVerticalAlignment(SwingConstants.CENTER);
		lblBild3.setHorizontalAlignment(SwingConstants.CENTER);
		lblBild3.setVerticalAlignment(SwingConstants.CENTER);
		lblBild4.setHorizontalAlignment(SwingConstants.CENTER);
		lblBild4.setVerticalAlignment(SwingConstants.CENTER);


		pSpielerStats.setBorder(BorderFactory.createEmptyBorder(20/*top*/, 20/*left*/, 20/*bottom*/, 20/*right*/));
		pSpielerStats.setBackground(Color.GRAY);	
		pSpielerStats.setLayout(new GridLayout(1, 4, 10, 10));
		pSpielerStats.add(pStatistik1);
		pSpielerStats.add(pStatistik2);
		pSpielerStats.add(pStatistik3);
		pSpielerStats.add(pStatistik4);
		
		pStatistik1.add(lblStatistik1);
		pStatistik1.add(lblStatistik5);
		pStatistik1.setBackground(Color.GRAY);
		
		pStatistik2.add(lblStatistik2);
		pStatistik2.add(lblStatistik6);
		pStatistik2.setBackground(Color.GRAY);
		
		pStatistik3.add(lblStatistik3);
		pStatistik3.add(lblStatistik7);
		pStatistik3.setBackground(Color.GRAY);
		
		pStatistik4.add(lblStatistik4);
		pStatistik4.add(lblStatistik8);
		pStatistik4.setBackground(Color.GRAY);
		
		lblStatistik1.setFont(Font15);
		lblStatistik2.setFont(Font15);
		lblStatistik3.setFont(Font15);
		lblStatistik4.setFont(Font15);
		lblStatistik5.setFont(Font15);
		lblStatistik6.setFont(Font15);
		lblStatistik7.setFont(Font15);
		lblStatistik8.setFont(Font15);

		lblStatistik1.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistik1.setVerticalAlignment(SwingConstants.CENTER);
		lblStatistik2.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistik2.setVerticalAlignment(SwingConstants.CENTER);
		lblStatistik3.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistik3.setVerticalAlignment(SwingConstants.CENTER);
		lblStatistik4.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistik4.setVerticalAlignment(SwingConstants.CENTER);
		lblStatistik5.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistik5.setVerticalAlignment(SwingConstants.CENTER);
		lblStatistik6.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistik6.setVerticalAlignment(SwingConstants.CENTER);
		lblStatistik7.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistik7.setVerticalAlignment(SwingConstants.CENTER);
		lblStatistik8.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistik8.setVerticalAlignment(SwingConstants.CENTER);
		

		
		
		
		////////////////////////////////////////////   UNPARTEIISCHE   /////////////////////////////////////////////////////////////////////
		
		//Unparteiische Bausteine definieren
		lblREFBild1 = new JLabel();
		lblREFBild2 = new JLabel();
		lblREFBild3 = new JLabel();
		lblREFBild4 = new JLabel();
		lblRefree = new JLabel("Unparteiische");
		lblREFStatistik1 = new JLabel("Statistik");
		lblREFStatistik2 = new JLabel("Statistik");
		lblREFStatistik3 = new JLabel("Statistik");
		lblREFStatistik4 = new JLabel("Statistik");
		lblREFStatistik5 = new JLabel(hauptlogik.getMenschenListe(4));
		lblREFStatistik6 = new JLabel(hauptlogik.getMenschenListe(5));
		lblREFStatistik7 = new JLabel(hauptlogik.getMenschenListe(6));
		lblREFStatistik8 = new JLabel(hauptlogik.getMenschenListe(7));
		
		bREFName1 = new JButton("Fahad Al-Mirdasi");
		bREFName2 = new JButton("Alireza Faghani");
		bREFName3 = new JButton("Ryuji Sato");
		bREFName4 = new JButton("Nawaf Shukralla");
		bREFNaechsteSeite = new JButton("Nächste Seite");
		bREFVorherigeSeite = new JButton("Vorherige Seite");
		
		
		pREFAlbum = new JPanel();
		pREFTopCHAlbum = new JPanel();
		pREFSpielerAngaben = new JPanel();
		pREFSpielerNamen = new JPanel();
		pREFSpielerBilder = new JPanel();
		pREFSpielerStats = new JPanel();
		pREFStatistik1 = new JPanel();
		pREFStatistik2 = new JPanel();
		pREFStatistik3 = new JPanel();
		pREFStatistik4 = new JPanel();
		
		
		//Grösse des Fensters definieren
		pREFAlbum.setBounds(0, 0, 1150, 650);
		
		//Hinzufügen und definieren der GUI Elemente
this.add(pREFAlbum);
		
		pREFAlbum.setBorder(BorderFactory.createEmptyBorder(15/*top*/, 40/*left*/, 100/*bottom*/, 40/*right*/));
		pREFAlbum.setBackground(mygreen);
		pREFAlbum.setLayout(new BorderLayout());
		pREFAlbum.add(pREFTopCHAlbum, BorderLayout.NORTH);
		pREFAlbum.add(pREFSpielerAngaben, BorderLayout.CENTER);
		
		
		pREFTopCHAlbum.setBackground(Color.PINK);
		pREFTopCHAlbum.setLayout(new BorderLayout());
		pREFTopCHAlbum.add(lblRefree, BorderLayout.CENTER);
		pREFTopCHAlbum.add(bREFVorherigeSeite, BorderLayout.WEST);
		pREFTopCHAlbum.add(bREFNaechsteSeite, BorderLayout.EAST);
		
		lblRefree.setFont(Font50);		
		lblRefree.setHorizontalAlignment(SwingConstants.CENTER);
		lblRefree.setVerticalAlignment(SwingConstants.CENTER);
		
		//Buttons Unparteiische Schrift setzen
		bREFVorherigeSeite.setFont(Font20);
		bREFNaechsteSeite.setFont(Font20);
		bREFNaechsteSeite.setBackground(myblue);
		bREFVorherigeSeite.setBackground(myblue);
		

		pREFSpielerAngaben.setLayout(new BorderLayout());
		pREFSpielerAngaben.add(pREFSpielerNamen, BorderLayout.NORTH);
		pREFSpielerAngaben.add(pREFSpielerBilder, BorderLayout.CENTER);
		pREFSpielerAngaben.add(pREFSpielerStats, BorderLayout.SOUTH);
		
		pREFSpielerNamen.setBackground(myred);
		pREFSpielerNamen.setBorder(BorderFactory.createEmptyBorder(20/*top*/, 20/*left*/, 20/*bottom*/, 20/*right*/));
		pREFSpielerNamen.setLayout(new GridLayout(1, 4, 10, 10));
		pREFSpielerNamen.add(bREFName1);
		pREFSpielerNamen.add(bREFName2);
		pREFSpielerNamen.add(bREFName3);
		pREFSpielerNamen.add(bREFName4);
		
		bREFName1.setBackground(myblue);
		bREFName2.setBackground(myblue);
		bREFName3.setBackground(myblue);
		bREFName4.setBackground(myblue);
		
		bREFName1.setFont(Font20);
		bREFName2.setFont(Font20);
		bREFName3.setFont(Font20);
		bREFName4.setFont(Font20);
		
		bREFName1.setHorizontalAlignment(SwingConstants.CENTER);
		bREFName1.setVerticalAlignment(SwingConstants.CENTER);
		bREFName2.setHorizontalAlignment(SwingConstants.CENTER);
		bREFName2.setVerticalAlignment(SwingConstants.CENTER);
		bREFName3.setHorizontalAlignment(SwingConstants.CENTER);
		bREFName3.setVerticalAlignment(SwingConstants.CENTER);
		bREFName4.setHorizontalAlignment(SwingConstants.CENTER);
		bREFName4.setVerticalAlignment(SwingConstants.CENTER);
		
		
		pREFSpielerBilder.setBorder(BorderFactory.createEmptyBorder(20/*top*/, 20/*left*/, 20/*bottom*/, 20/*right*/));
		pREFSpielerBilder.setBackground(myblue);
		pREFSpielerBilder.setLayout(new GridLayout(1, 4, 10, 10));
		pREFSpielerBilder.add(lblREFBild1);
		pREFSpielerBilder.add(lblREFBild2);
		pREFSpielerBilder.add(lblREFBild3);
		pREFSpielerBilder.add(lblREFBild4);	

		lblREFBild1.setHorizontalAlignment(SwingConstants.CENTER);
		lblREFBild1.setVerticalAlignment(SwingConstants.CENTER);
		lblREFBild2.setHorizontalAlignment(SwingConstants.CENTER);
		lblREFBild2.setVerticalAlignment(SwingConstants.CENTER);
		lblREFBild3.setHorizontalAlignment(SwingConstants.CENTER);
		lblREFBild3.setVerticalAlignment(SwingConstants.CENTER);
		lblREFBild4.setHorizontalAlignment(SwingConstants.CENTER);
		lblREFBild4.setVerticalAlignment(SwingConstants.CENTER);
		
		
		pREFSpielerStats.setLayout(new GridLayout(1, 4, 10, 10));
		pREFSpielerStats.setBorder(BorderFactory.createEmptyBorder(20/*top*/, 20/*left*/, 20/*bottom*/, 20/*right*/));
		pREFSpielerStats.setBackground(Color.GRAY);
		pREFSpielerStats.add(pREFStatistik1);
		pREFSpielerStats.add(pREFStatistik2);
		pREFSpielerStats.add(pREFStatistik3);
		pREFSpielerStats.add(pREFStatistik4);
		
		pREFStatistik1.add(lblREFStatistik1);
		pREFStatistik1.add(lblREFStatistik5);
		pREFStatistik1.setBackground(Color.GRAY);
		
		pREFStatistik2.add(lblREFStatistik2);
		pREFStatistik2.add(lblREFStatistik6);
		pREFStatistik2.setBackground(Color.GRAY);
		
		pREFStatistik3.add(lblREFStatistik3);
		pREFStatistik3.add(lblREFStatistik7);
		pREFStatistik3.setBackground(Color.GRAY);
		
		pREFStatistik4.add(lblREFStatistik4);
		pREFStatistik4.add(lblREFStatistik8);
		pREFStatistik4.setBackground(Color.GRAY);
			
		
		lblREFStatistik1.setFont(Font15);
		lblREFStatistik2.setFont(Font15);
		lblREFStatistik3.setFont(Font15);
		lblREFStatistik4.setFont(Font15);
		lblREFStatistik5.setFont(Font15);
		lblREFStatistik6.setFont(Font15);
		lblREFStatistik7.setFont(Font15);
		lblREFStatistik8.setFont(Font15);
		
		lblREFStatistik1.setHorizontalAlignment(SwingConstants.CENTER);
		lblREFStatistik1.setVerticalAlignment(SwingConstants.CENTER);
		lblREFStatistik2.setHorizontalAlignment(SwingConstants.CENTER);
		lblREFStatistik2.setVerticalAlignment(SwingConstants.CENTER);
		lblREFStatistik3.setHorizontalAlignment(SwingConstants.CENTER);
		lblREFStatistik3.setVerticalAlignment(SwingConstants.CENTER);
		lblREFStatistik4.setHorizontalAlignment(SwingConstants.CENTER);
		lblREFStatistik4.setVerticalAlignment(SwingConstants.CENTER);
		
		//add Buttons to Actionlistener
		bNaechsteSeite.addActionListener(this);
		bREFVorherigeSeite.addActionListener(this);
		bName1.addActionListener(this);
		bName2.addActionListener(this);
		bName3.addActionListener(this);
		bName4.addActionListener(this);
		bREFName1.addActionListener(this);
		bREFName2.addActionListener(this);
		bREFName3.addActionListener(this);
		bREFName4.addActionListener(this);
		
		
		//Album visible, REF invisible, Butten enable/disable
		pCHAlbum.setVisible(true);
		pREFAlbum.setVisible(false);
		
		bVorherigeSeite.setEnabled(false);
		bNaechsteSeite.setEnabled(true);
		
		bREFVorherigeSeite.setEnabled(true);
		bREFNaechsteSeite.setEnabled(false);
		
		//das fenster sichtbar machen
		this.setVisible(true); 
		
		//stats CH
		lblStatistik1.setVisible(true);
		lblStatistik5.setVisible(false);
		lblStatistik2.setVisible(true);
		lblStatistik6.setVisible(false);
		lblStatistik3.setVisible(true);
		lblStatistik7.setVisible(false);
		lblStatistik4.setVisible(true);
		lblStatistik8.setVisible(false);
		
		//stats REF
		lblREFStatistik1.setVisible(true);
		lblREFStatistik5.setVisible(false);
		lblREFStatistik2.setVisible(true);
		lblREFStatistik6.setVisible(false);
		lblREFStatistik3.setVisible(true);
		lblREFStatistik7.setVisible(false);
		lblREFStatistik4.setVisible(true);
		lblREFStatistik8.setVisible(false);
	}
	
	
	/**
	 * Actionlistener
	 */
	@Override
	public void actionPerformed(ActionEvent ae) {
		//zwischen den Seiten wechseln
		if(ae.getSource() == this.bNaechsteSeite){
			pCHAlbum.setVisible(false);
			pREFAlbum.setVisible(true);
			
		} 
		
		else if(ae.getSource() == this.bREFVorherigeSeite){
			pCHAlbum.setVisible(true);
			pREFAlbum.setVisible(false);
		}
		
		
		//CH Bild und statistik anzeigen 
		if(ae.getSource() ==this.bName1)
		{
			//Bild wird angezeigt
			lblBild1.setIcon(new ImageIcon(hauptlogik.getBildListe(0)));
			
			//Statistik wird angezeigt
			lblStatistik1.setVisible(false);
			lblStatistik5.setVisible(true);
		}
		
		else if(ae.getSource() ==this.bName2)
		{
			lblBild2.setIcon(new ImageIcon(hauptlogik.getBildListe(1)));
			lblStatistik2.setVisible(false);
			lblStatistik6.setVisible(true);
		}
		
		else if(ae.getSource() ==this.bName3)
		{
			lblBild3.setIcon(new ImageIcon(hauptlogik.getBildListe(2)));
			lblStatistik3.setVisible(false);
			lblStatistik7.setVisible(true);
		}
		
		else if(ae.getSource() ==this.bName4)
		{
			lblBild4.setIcon(new ImageIcon(hauptlogik.getBildListe(3)));
			lblStatistik4.setVisible(false);
			lblStatistik8.setVisible(true);
		}
		
		
		//Unparteiische Bild und statistik anzeigen 
		if(ae.getSource() ==this.bREFName1)
		{
			//Bild wird angezeigt
			lblREFBild1.setIcon(new ImageIcon(hauptlogik.getBildListe(4))); 
			
			//Statistik wird angezeigt
			lblREFStatistik1.setVisible(false);
			lblREFStatistik5.setVisible(true);
		}
		
		else if(ae.getSource() ==this.bREFName2)
		{
			lblREFBild2.setIcon(new ImageIcon(hauptlogik.getBildListe(5)));
			lblREFStatistik2.setVisible(false);
			lblREFStatistik6.setVisible(true);
		}
		
		else if(ae.getSource() ==this.bREFName3)
		{
			lblREFBild3.setIcon(new ImageIcon(hauptlogik.getBildListe(6)));
			lblREFStatistik3.setVisible(false);
			lblREFStatistik7.setVisible(true);
		}
		
		else if(ae.getSource() ==this.bREFName4)
		{
			lblREFBild4.setIcon(new ImageIcon(hauptlogik.getBildListe(7)));
			lblREFStatistik4.setVisible(false);
			lblREFStatistik8.setVisible(true);
		}
		

	}

	
}
