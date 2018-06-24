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

public class Album extends JFrame implements ActionListener{
	
	
	//Variablen initialisieren/////////////////////////////////////////////////////////////////////////////////////////////////////////
	private JButton bNaechsteSeite, bVorherigeSeite, bEinkleben;
	private JLabel lblBild1, lblBild2, lblBild3, lblBild4, lblName1, lblName2, lblName3, lblName4, lblStatistik1, lblStatistik2, lblStatistik3, lblStatistik4, lblSchweiz;
	private JPanel pCHAlbum, pTopCHAlbum, pSpielerAngaben, pSpielerNamen, pSpielerBilder, pSpielerStats;

	private Font Font50 = new Font("Arial", Font.BOLD, 50);
	private Font Font40 = new Font("Arial", Font.BOLD, 40);
	private Font Font20 = new Font("Arial", Font.BOLD, 20);
	
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
		 
		//Bausteine definieren
		lblBild1 = new JLabel();
		lblBild2 = new JLabel();
		lblBild3 = new JLabel();
		lblBild4 = new JLabel();
		lblSchweiz= new JLabel("Schweiz");
		lblName1 = new JLabel("Johan Djourou");
		lblName2 = new JLabel("Granit Xhaka");
		lblName3 = new JLabel("Manuel Akanji");
		lblName4 = new JLabel("Haris Seferovic");
		lblStatistik1 = new JLabel("Statistik");
		lblStatistik2 = new JLabel("Statistik");
		lblStatistik3 = new JLabel("Statistik");
		lblStatistik4 = new JLabel("Statistik");
		bNaechsteSeite = new JButton("Nächste Seite");
		bVorherigeSeite = new JButton("Vorherige Seite");
		
		pCHAlbum = new JPanel();
		pTopCHAlbum = new JPanel();
		pSpielerAngaben = new JPanel();
		pSpielerNamen = new JPanel();
		pSpielerBilder = new JPanel();
		pSpielerStats = new JPanel(); 
		
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
		pSpielerNamen.setLayout(new GridLayout(1, 4, 50, 50));
		pSpielerNamen.add(lblName1);
		pSpielerNamen.add(lblName2);
		pSpielerNamen.add(lblName3);
		pSpielerNamen.add(lblName4);
		lblName1.setFont(Font20);
		lblName2.setFont(Font20);
		lblName3.setFont(Font20);
		lblName4.setFont(Font20);
		pSpielerNamen.setBorder(BorderFactory.createEmptyBorder(20/*top*/, 20/*left*/, 20/*bottom*/, 20/*right*/));
		lblName1.setHorizontalAlignment(SwingConstants.CENTER);
		lblName1.setVerticalAlignment(SwingConstants.CENTER);
		lblName2.setHorizontalAlignment(SwingConstants.CENTER);
		lblName2.setVerticalAlignment(SwingConstants.CENTER);
		lblName3.setHorizontalAlignment(SwingConstants.CENTER);
		lblName3.setVerticalAlignment(SwingConstants.CENTER);
		lblName4.setHorizontalAlignment(SwingConstants.CENTER);
		lblName4.setVerticalAlignment(SwingConstants.CENTER);
		
		
		pSpielerBilder.setLayout(new GridLayout(1, 4, 10, 10));
		pSpielerBilder.add(lblBild1);
		pSpielerBilder.add(lblBild2);
		pSpielerBilder.add(lblBild3);
		pSpielerBilder.add(lblBild4);	
		pSpielerBilder.setBorder(BorderFactory.createEmptyBorder(20/*top*/, 20/*left*/, 20/*bottom*/, 20/*right*/));

		pSpielerBilder.setBackground(myblue);
		lblBild1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBild1.setVerticalAlignment(SwingConstants.CENTER);
		lblBild2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBild2.setVerticalAlignment(SwingConstants.CENTER);
		lblBild3.setHorizontalAlignment(SwingConstants.CENTER);
		lblBild3.setVerticalAlignment(SwingConstants.CENTER);
		lblBild4.setHorizontalAlignment(SwingConstants.CENTER);
		lblBild4.setVerticalAlignment(SwingConstants.CENTER);
		lblBild1.setIcon(new ImageIcon(".\\IMG\\JohanDjourou.jpg"));

			
		pSpielerStats.setLayout(new GridLayout(1, 4, 10, 10));
		pSpielerStats.add(lblStatistik1);
		pSpielerStats.add(lblStatistik2);
		pSpielerStats.add(lblStatistik3);
		pSpielerStats.add(lblStatistik4);
		lblStatistik1.setFont(Font20);
		lblStatistik2.setFont(Font20);
		lblStatistik3.setFont(Font20);
		lblStatistik4.setFont(Font20);
		pSpielerStats.setBorder(BorderFactory.createEmptyBorder(20/*top*/, 20/*left*/, 20/*bottom*/, 20/*right*/));
		pSpielerStats.setBackground(Color.GRAY);
		lblStatistik1.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistik1.setVerticalAlignment(SwingConstants.CENTER);
		lblStatistik2.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistik2.setVerticalAlignment(SwingConstants.CENTER);
		lblStatistik3.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistik3.setVerticalAlignment(SwingConstants.CENTER);
		lblStatistik4.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistik4.setVerticalAlignment(SwingConstants.CENTER);
		
		
		
		////////////////////////////////////////////   UNPARTEIISCHE   /////////////////////////////////////////////////////////////////////
		
		//Bausteine definieren
		lblREFBild1 = new JLabel();
		lblREFBild2 = new JLabel();
		lblREFBild3 = new JLabel();
		lblREFBild4 = new JLabel();
		lblRefree= new JLabel("Unparteiische");
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
		
		//Album visible, REF invisible
		pCHAlbum.setVisible(false);
		pREFAlbum.setVisible(true);
		
		
		this.setVisible(true); 
		
	}
	
	
	/**
	 * Actionlistener
	 */
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == this.bNaechsteSeite){
			pCHAlbum.setVisible(false);
			pREFAlbum.setVisible(true);
			
		} else if(ae.getSource() == this.bREFVorherigeSeite){
			pCHAlbum.setVisible(true);
			pREFAlbum.setVisible(false);
		}
	}
		
	
	public static void main(String[] args) {
		Album al = new Album();
		
	}
	
}
