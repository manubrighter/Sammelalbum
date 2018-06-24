/*ToDo
 * Statt ein Spieler ein Manager einfügen
 * Alle Bilder im Projekt speichern
 * Alle JButtons definieren (addAcionListener etc.)
 * Action Listener komplettieren
 */


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

public class Album extends JFrame implements ActionListener{
	
	
	//Objekte
	HauptLogik hauptlogik = new HauptLogik();
	
	
	//Variablen initialisieren/////////////////////////////////////////////////////////////////////////////////////////////////////////
	private JButton bNaechsteSeite, bVorherigeSeite,bName1, bName2, bName3, bName4;
	private JLabel lblBild1, lblBild2, lblBild3, lblBild4,lblStatistik1, lblStatistik2, lblStatistik3, lblStatistik4, lblSchweiz, lblStatistik5, lblStatistik6, lblStatistik7, lblStatistik8;
	private JPanel pCHAlbum, pTopCHAlbum, pSpielerAngaben, pSpielerNamen, pSpielerBilder, pSpielerStats, pStatistik1, pStatistik2, pStatistik3, pStatistik4;

	private Font Font50 = new Font("Arial", Font.BOLD, 50);
	private Font Font40 = new Font("Arial", Font.BOLD, 40);
	private Font Font20 = new Font("Arial", Font.BOLD, 20);
	private Font Font15 = new Font("Arial", Font.BOLD, 15);
	
	private Color mygreen = new Color(161, 249, 78);
	private Color myred = new Color (255, 80, 80);
	private Color myblue = new Color (102, 204, 255);
	
	////////////////////////////////////////////   UNPARTEIISCHE   /////////////////////////////////////////////////////////////////////
	
	private JButton bREFNaechsteSeite, bREFVorherigeSeite, bREFEinkleben;
	private JLabel lblREFBild1, lblREFBild2, lblREFBild3, lblREFBild4, lblREFName1, lblREFName2, lblREFName3, lblREFName4, lblREFStatistik1, lblREFStatistik2, lblREFStatistik3, lblREFStatistik4, lblRefree;  
	private JPanel pREFAlbum, pREFTopCHAlbum, pREFSpielerAngaben, pREFSpielerNamen, pREFSpielerBilder, pREFSpielerStats;
	
	

	
	public Album() {
		this.setLayout(null); 
		
		////////////////////////////////////////////   Schweiz   /////////////////////////////////////////////////////////////////////
		
		this.setResizable(false); //Fenstergrösse ist nicht veränderbar
		this.setSize(1150, 650); //Grösse des Fensters definieren
		this.setLocation(530, 350); //Ort des Fensters definieren
		
		//Spieler erstellen
		hauptlogik.Listenlogik();
		 
		//Bausteine definieren
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
		bName4 = new JButton("Haris Seferovic");
		
	
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
		
		pCHAlbum.setBounds(0, 0, 1150, 650); 

		
		
		this.add(pCHAlbum);
		
		pCHAlbum.setLayout(new BorderLayout());
		pCHAlbum.add(pTopCHAlbum, BorderLayout.NORTH);
		pCHAlbum.add(pSpielerAngaben, BorderLayout.CENTER);
		pCHAlbum.setBackground(mygreen);

		
		pCHAlbum.setBorder(BorderFactory.createEmptyBorder(15/*top*/, 40/*left*/, 100/*bottom*/, 40/*right*/));
		
		pTopCHAlbum.setLayout(new BorderLayout());
		pTopCHAlbum.add(lblSchweiz, BorderLayout.CENTER);
		pTopCHAlbum.add(bNaechsteSeite, BorderLayout.EAST);
		pTopCHAlbum.add(bVorherigeSeite, BorderLayout.WEST);
		pTopCHAlbum.setBackground(Color.PINK);
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
		pSpielerNamen.setLayout(new GridLayout(1, 4, 10, 10));
		pSpielerNamen.add(bName1);
		pSpielerNamen.add(bName2);
		pSpielerNamen.add(bName3);
		pSpielerNamen.add(bName4);
		bName1.setFont(Font20);
		bName2.setFont(Font20);
		bName3.setFont(Font20);
		bName4.setFont(Font20);
		pSpielerNamen.setBorder(BorderFactory.createEmptyBorder(20/*top*/, 20/*left*/, 20/*bottom*/, 20/*right*/));
		bName1.setHorizontalAlignment(SwingConstants.CENTER);
		bName1.setVerticalAlignment(SwingConstants.CENTER);
		bName2.setHorizontalAlignment(SwingConstants.CENTER);
		bName2.setVerticalAlignment(SwingConstants.CENTER);
		bName3.setHorizontalAlignment(SwingConstants.CENTER);
		bName3.setVerticalAlignment(SwingConstants.CENTER);
		bName4.setHorizontalAlignment(SwingConstants.CENTER);
		bName4.setVerticalAlignment(SwingConstants.CENTER);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		pSpielerBilder.setLayout(new GridLayout(1, 4, 10, 10));
		pSpielerBilder.add(lblBild1);
		pSpielerBilder.add(lblBild2);
		pSpielerBilder.add(lblBild3);
		pSpielerBilder.add(lblBild4);	
		pSpielerBilder.setBorder(BorderFactory.createEmptyBorder(20/*top*/, 20/*left*/, 20/*bottom*/, 20/*right*/));

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		pSpielerBilder.setBackground(myblue);
		lblBild1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBild1.setVerticalAlignment(SwingConstants.CENTER);
		lblBild2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBild2.setVerticalAlignment(SwingConstants.CENTER);
		lblBild3.setHorizontalAlignment(SwingConstants.CENTER);
		lblBild3.setVerticalAlignment(SwingConstants.CENTER);
		lblBild4.setHorizontalAlignment(SwingConstants.CENTER);
		lblBild4.setVerticalAlignment(SwingConstants.CENTER);


			
		pSpielerStats.setLayout(new GridLayout(1, 4, 10, 10));
		pSpielerStats.add(pStatistik1);
		pSpielerStats.add(pStatistik2);
		pSpielerStats.add(pStatistik3);
		pSpielerStats.add(pStatistik4);
		
		pSpielerStats.setBorder(BorderFactory.createEmptyBorder(20/*top*/, 20/*left*/, 20/*bottom*/, 20/*right*/));
		pSpielerStats.setBackground(Color.GRAY);
		
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
		
		lblStatistik1.setFont(Font20);
		lblStatistik2.setFont(Font20);
		lblStatistik3.setFont(Font20);
		lblStatistik4.setFont(Font20);
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
		
		//Bausteine definieren
		lblREFBild1 = new JLabel();
		lblREFBild2 = new JLabel();
		lblREFBild3 = new JLabel();
		lblREFBild4 = new JLabel();
		lblRefree = new JLabel("Unparteiische");
		lblREFName1 = new JLabel("Fahad Al-Mirdasi");
		lblREFName2 = new JLabel("Alireza Faghani");
		lblREFName3 = new JLabel("Ryuji Sato");
		lblREFName4 = new JLabel("Nawaf Shukralla");
		lblREFStatistik1 = new JLabel("Statistik");
		lblREFStatistik2 = new JLabel("Statistik");
		lblREFStatistik3 = new JLabel("Statistik");
		lblREFStatistik4 = new JLabel("Statistik");
		bREFNaechsteSeite = new JButton("Nächste Seite");
		bREFVorherigeSeite = new JButton("Vorherige Seite");
		
		
		pREFAlbum = new JPanel();
		pREFTopCHAlbum = new JPanel();
		pREFSpielerAngaben = new JPanel();
		pREFSpielerNamen = new JPanel();
		pREFSpielerBilder = new JPanel();
		pREFSpielerStats = new JPanel();
		
		pREFAlbum.setBounds(0, 0, 1150, 650);
		
this.add(pREFAlbum);
		
		pREFAlbum.setLayout(new BorderLayout());
		pREFAlbum.add(pREFTopCHAlbum, BorderLayout.NORTH);
		pREFAlbum.add(pREFSpielerAngaben, BorderLayout.CENTER);
		pREFAlbum.setBackground(mygreen);
		
		
		pREFAlbum.setBorder(BorderFactory.createEmptyBorder(15/*top*/, 40/*left*/, 100/*bottom*/, 40/*right*/));
		
		
		pREFTopCHAlbum.setLayout(new BorderLayout());
		pREFTopCHAlbum.setBackground(Color.PINK);
		lblRefree.setFont(Font50);
		pREFTopCHAlbum.add(lblRefree, BorderLayout.CENTER);
		pREFTopCHAlbum.add(bREFVorherigeSeite, BorderLayout.WEST);
		pREFTopCHAlbum.add(bREFNaechsteSeite, BorderLayout.EAST);
		
		
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
		pREFSpielerNamen.setLayout(new GridLayout(1, 4, 50, 50));
		pREFSpielerNamen.add(lblREFName1);
		pREFSpielerNamen.add(lblREFName2);
		pREFSpielerNamen.add(lblREFName3);
		pREFSpielerNamen.add(lblREFName4);
		lblREFName1.setFont(Font20);
		lblREFName2.setFont(Font20);
		lblREFName3.setFont(Font20);
		lblREFName4.setFont(Font20);
		pREFSpielerNamen.setBorder(BorderFactory.createEmptyBorder(20/*top*/, 20/*left*/, 20/*bottom*/, 20/*right*/));
		lblREFName1.setHorizontalAlignment(SwingConstants.CENTER);
		lblREFName1.setVerticalAlignment(SwingConstants.CENTER);
		lblREFName2.setHorizontalAlignment(SwingConstants.CENTER);
		lblREFName2.setVerticalAlignment(SwingConstants.CENTER);
		lblREFName3.setHorizontalAlignment(SwingConstants.CENTER);
		lblREFName3.setVerticalAlignment(SwingConstants.CENTER);
		lblREFName4.setHorizontalAlignment(SwingConstants.CENTER);
		lblREFName4.setVerticalAlignment(SwingConstants.CENTER);
		
		
		pREFSpielerBilder.setLayout(new GridLayout(1, 4, 10, 10));
		pREFSpielerBilder.add(lblREFBild1);
		pREFSpielerBilder.add(lblREFBild2);
		pREFSpielerBilder.add(lblREFBild3);
		pREFSpielerBilder.add(lblREFBild4);	
		pREFSpielerBilder.setBorder(BorderFactory.createEmptyBorder(20/*top*/, 20/*left*/, 20/*bottom*/, 20/*right*/));

		pREFSpielerBilder.setBackground(myblue);
		lblREFBild1.setHorizontalAlignment(SwingConstants.CENTER);
		lblREFBild1.setVerticalAlignment(SwingConstants.CENTER);
		lblREFBild2.setHorizontalAlignment(SwingConstants.CENTER);
		lblREFBild2.setVerticalAlignment(SwingConstants.CENTER);
		lblREFBild3.setHorizontalAlignment(SwingConstants.CENTER);
		lblREFBild3.setVerticalAlignment(SwingConstants.CENTER);
		lblREFBild4.setHorizontalAlignment(SwingConstants.CENTER);
		lblREFBild4.setVerticalAlignment(SwingConstants.CENTER);
		
		
		pREFSpielerStats.setLayout(new GridLayout(1, 4, 10, 10));
		pREFSpielerStats.add(lblREFStatistik1);
		pREFSpielerStats.add(lblREFStatistik2);
		pREFSpielerStats.add(lblREFStatistik3);
		pREFSpielerStats.add(lblREFStatistik4);
		lblREFStatistik1.setFont(Font20);
		lblREFStatistik2.setFont(Font20);
		lblREFStatistik3.setFont(Font20);
		lblREFStatistik4.setFont(Font20);
		pREFSpielerStats.setBorder(BorderFactory.createEmptyBorder(20/*top*/, 20/*left*/, 20/*bottom*/, 20/*right*/));
		pREFSpielerStats.setBackground(Color.GRAY);
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
		
		
		//Album visible, REF invisible
		pCHAlbum.setVisible(true);
		pREFAlbum.setVisible(false);
		
		bVorherigeSeite.setEnabled(false);
		bNaechsteSeite.setEnabled(true);
		
		bREFVorherigeSeite.setEnabled(true);
		bREFNaechsteSeite.setEnabled(false);
		
		this.setVisible(true); 
		
		//stats
		lblStatistik1.setVisible(true);
		lblStatistik5.setVisible(false);
		lblStatistik2.setVisible(true);
		lblStatistik6.setVisible(false);
		lblStatistik3.setVisible(true);
		lblStatistik7.setVisible(false);
		lblStatistik4.setVisible(true);
		lblStatistik8.setVisible(false);
	}
	
	
	/**
	 * Actionlistener
	 */
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == this.bNaechsteSeite){
			pCHAlbum.setVisible(false);
			pREFAlbum.setVisible(true);
			
		} if(ae.getSource() == this.bREFVorherigeSeite){
			pCHAlbum.setVisible(true);
			pREFAlbum.setVisible(false);
		}
		
		
		
		if(ae.getSource() ==this.bName1)
		{
			//pSpielerBilder.setBorder(BorderFactory.createEmptyBorder(20/*top*/, 20/*left*/, 20/*bottom*/, 20/*right*/));
			
			
			
			//Bild wird angezeigt
			lblBild1.setIcon(new ImageIcon(".\\IMG\\JohanDjourou.jpg"));
			
			//Statistik wird angezeigt
			lblStatistik1.setVisible(false);
			lblStatistik5.setVisible(true);
		}
	}
		
	
	public static void main(String[] args) {
		Album al = new Album();
		
	}
	
}
