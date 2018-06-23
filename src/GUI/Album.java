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
	private JButton B1;
	private JLabel LBild1, LBild2, LBild3, LBild4, LName1, LName2, LName3, LName4, LStatistik1, LStatistik2, LStatistik3, LStatistik4, LNation1;  
	private JPanel P1, P2, P3, P4, P5, P6;

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
		LBild1 = new JLabel();
		LBild2 = new JLabel();
		LBild3 = new JLabel();
		LBild4 = new JLabel();
		LNation1= new JLabel("Schweiz");
		LName1 = new JLabel("Johan Djourou");
		LName2 = new JLabel("Granit Xhaka");
		LName3 = new JLabel("Manuel Akanji");
		LName4 = new JLabel("Haris Seferovic");
		LStatistik1 = new JLabel("Statistik");
		LStatistik2 = new JLabel("Statistik");
		LStatistik3 = new JLabel("Statistik");
		LStatistik4 = new JLabel("Statistik");
		
		P1 = new JPanel();
		P2 = new JPanel();
		P3 = new JPanel();
		P4 = new JPanel();
		P5 = new JPanel();
		P6 = new JPanel();
		
		P1.setBounds(0, 0, 1150, 650);
		
		
		this.add(P1);
		
		P1.setLayout(new BorderLayout());
		P1.add(P2, BorderLayout.NORTH);
		P1.add(P3, BorderLayout.CENTER);
		P1.setBackground(mygreen);
		
		P1.setBorder(BorderFactory.createEmptyBorder(15/*top*/, 40/*left*/, 100/*bottom*/, 40/*right*/));
		
		
		P2.add(LNation1);
		P2.setBackground(Color.PINK);
		LNation1.setFont(Font50);
		
		
		P3.setLayout(new BorderLayout());
		P3.add(P4, BorderLayout.NORTH);
		P3.add(P5, BorderLayout.CENTER);
		P3.add(P6, BorderLayout.SOUTH);
		
		P4.setBackground(myred);
		P4.setLayout(new GridLayout(1, 4, 50, 50));
		P4.add(LName1);
		P4.add(LName2);
		P4.add(LName3);
		P4.add(LName4);
		LName1.setFont(Font20);
		LName2.setFont(Font20);
		LName3.setFont(Font20);
		LName4.setFont(Font20);
		P4.setBorder(BorderFactory.createEmptyBorder(20/*top*/, 20/*left*/, 20/*bottom*/, 20/*right*/));
		LName1.setHorizontalAlignment(SwingConstants.CENTER);
		LName1.setVerticalAlignment(SwingConstants.CENTER);
		LName2.setHorizontalAlignment(SwingConstants.CENTER);
		LName2.setVerticalAlignment(SwingConstants.CENTER);
		LName3.setHorizontalAlignment(SwingConstants.CENTER);
		LName3.setVerticalAlignment(SwingConstants.CENTER);
		LName4.setHorizontalAlignment(SwingConstants.CENTER);
		LName4.setVerticalAlignment(SwingConstants.CENTER);
		
		
		P5.setLayout(new GridLayout(1, 4, 10, 10));
		P5.add(LBild1);
		P5.add(LBild2);
		P5.add(LBild3);
		P5.add(LBild4);	
		P5.setBorder(BorderFactory.createEmptyBorder(20/*top*/, 20/*left*/, 20/*bottom*/, 20/*right*/));
		P5.setBackground(myblue);
		LBild1.setHorizontalAlignment(SwingConstants.CENTER);
		LBild1.setVerticalAlignment(SwingConstants.CENTER);
		LBild2.setHorizontalAlignment(SwingConstants.CENTER);
		LBild2.setVerticalAlignment(SwingConstants.CENTER);
		LBild3.setHorizontalAlignment(SwingConstants.CENTER);
		LBild3.setVerticalAlignment(SwingConstants.CENTER);
		LBild4.setHorizontalAlignment(SwingConstants.CENTER);
		LBild4.setVerticalAlignment(SwingConstants.CENTER);
		
		
		P6.setLayout(new GridLayout(1, 4, 10, 10));
		P6.add(LStatistik1);
		P6.add(LStatistik2);
		P6.add(LStatistik3);
		P6.add(LStatistik4);
		LStatistik1.setFont(Font20);
		LStatistik2.setFont(Font20);
		LStatistik3.setFont(Font20);
		LStatistik4.setFont(Font20);
		P6.setBorder(BorderFactory.createEmptyBorder(20/*top*/, 20/*left*/, 20/*bottom*/, 20/*right*/));
		P6.setBackground(Color.GRAY);
		LStatistik1.setHorizontalAlignment(SwingConstants.CENTER);
		LStatistik1.setVerticalAlignment(SwingConstants.CENTER);
		LStatistik2.setHorizontalAlignment(SwingConstants.CENTER);
		LStatistik2.setVerticalAlignment(SwingConstants.CENTER);
		LStatistik3.setHorizontalAlignment(SwingConstants.CENTER);
		LStatistik3.setVerticalAlignment(SwingConstants.CENTER);
		LStatistik4.setHorizontalAlignment(SwingConstants.CENTER);
		LStatistik4.setVerticalAlignment(SwingConstants.CENTER);
		
		
		this.setVisible(true); 
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
	
	public static void main(String[] args) {
		Album al = new Album();
		
	}
	
}
