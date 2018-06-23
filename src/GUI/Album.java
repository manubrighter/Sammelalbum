package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Album extends JFrame implements ActionListener{
	
	
	//Variablen initialisieren
	private JButton bNaechsteSeite, bVorhaerigeSeite, bEinkleben;
	private JLabel lblBild1, lblBild2, lblBild3, lblBild4, lblName1, lblName2, lblName3, lblName4, lblStatistik1, lblStatistik2, lblStatistik3, lblStatistik4, lblSchweiz;  
	private JPanel pAlbum, pTopAlbum, pSpielerAngaben, pSpielerNamen, pSpielerBilder, pSpielerStats;

	private Font Font50 = new Font("Arial", Font.BOLD, 50);
	private Font Font40 = new Font("Arial", Font.BOLD, 40);
	private Font Font20 = new Font("Arial", Font.BOLD, 20);
	
	private Color mygreen = new Color(161, 249, 78);
	private Color myred = new Color (255, 80, 80);
	private Color myblue = new Color (102, 204, 255);
	

	
	public Album() {
		this.setLayout(null); 
		
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
		
		pAlbum = new JPanel();
		pTopAlbum = new JPanel();
		pSpielerAngaben = new JPanel();
		pSpielerNamen = new JPanel();
		pSpielerBilder = new JPanel();
		pSpielerStats = new JPanel();
		
		pAlbum.setBounds(0, 0, 1150, 650);

		
		
		this.add(pAlbum);
		
		pAlbum.setLayout(new BorderLayout());
		pAlbum.add(pTopAlbum, BorderLayout.NORTH);
		pAlbum.add(pSpielerAngaben, BorderLayout.CENTER);
		pAlbum.setBackground(mygreen);
		
		pAlbum.setBorder(BorderFactory.createEmptyBorder(15/*top*/, 40/*left*/, 100/*bottom*/, 40/*right*/));
		
		
		pTopAlbum.add(lblSchweiz);
		pTopAlbum.setBackground(Color.PINK);
		lblSchweiz.setFont(Font50);
		
		
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
		
		private JLabel lblREFBild1, lblREFBild2, lblREFBild3, lblREFBild4, lblREFName1, lblREFName2, lblREFName3, lblREFName4, lblREFStatistik1, lblREFStatistik2, lblREFStatistik3, lblREFStatistik4, lblREFSchweiz;  
		private JPanel pAlbum, pTopAlbum, pSpielerAngaben, pSpielerNamen, pSpielerBilder, pSpielerStats;
		
		
		
		
		
		
		this.setVisible(true); 
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
	
	public static void main(String[] args) {
		Album al = new Album();
		
	}
	
}
