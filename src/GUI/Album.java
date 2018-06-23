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
		
		
		P2.add(lblSchweiz);
		P2.setBackground(Color.PINK);
		lblSchweiz.setFont(Font50);
		
		
		P3.setLayout(new BorderLayout());
		P3.add(P4, BorderLayout.NORTH);
		P3.add(P5, BorderLayout.CENTER);
		P3.add(P6, BorderLayout.SOUTH);
		
		P4.setBackground(myred);
		P4.setLayout(new GridLayout(1, 4, 50, 50));
		P4.add(lblName1);
		P4.add(lblName2);
		P4.add(lblName3);
		P4.add(lblName4);
		lblName1.setFont(Font20);
		lblName2.setFont(Font20);
		lblName3.setFont(Font20);
		lblName4.setFont(Font20);
		P4.setBorder(BorderFactory.createEmptyBorder(20/*top*/, 20/*left*/, 20/*bottom*/, 20/*right*/));
		lblName1.setHorizontalAlignment(SwingConstants.CENTER);
		lblName1.setVerticalAlignment(SwingConstants.CENTER);
		lblName2.setHorizontalAlignment(SwingConstants.CENTER);
		lblName2.setVerticalAlignment(SwingConstants.CENTER);
		lblName3.setHorizontalAlignment(SwingConstants.CENTER);
		lblName3.setVerticalAlignment(SwingConstants.CENTER);
		lblName4.setHorizontalAlignment(SwingConstants.CENTER);
		lblName4.setVerticalAlignment(SwingConstants.CENTER);
		
		
		P5.setLayout(new GridLayout(1, 4, 10, 10));
		P5.add(lblBild1);
		P5.add(lblBild2);
		P5.add(lblBild3);
		P5.add(lblBild4);	
		P5.setBorder(BorderFactory.createEmptyBorder(20/*top*/, 20/*left*/, 20/*bottom*/, 20/*right*/));

		P5.setBackground(myblue);
		lblBild1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBild1.setVerticalAlignment(SwingConstants.CENTER);
		lblBild2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBild2.setVerticalAlignment(SwingConstants.CENTER);
		lblBild3.setHorizontalAlignment(SwingConstants.CENTER);
		lblBild3.setVerticalAlignment(SwingConstants.CENTER);
		lblBild4.setHorizontalAlignment(SwingConstants.CENTER);
		lblBild4.setVerticalAlignment(SwingConstants.CENTER);
		
		
		P6.setLayout(new GridLayout(1, 4, 10, 10));
		P6.add(lblStatistik1);
		P6.add(lblStatistik2);
		P6.add(lblStatistik3);
		P6.add(lblStatistik4);
		lblStatistik1.setFont(Font20);
		lblStatistik2.setFont(Font20);
		lblStatistik3.setFont(Font20);
		lblStatistik4.setFont(Font20);
		P6.setBorder(BorderFactory.createEmptyBorder(20/*top*/, 20/*left*/, 20/*bottom*/, 20/*right*/));
		P6.setBackground(Color.GRAY);
		lblStatistik1.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistik1.setVerticalAlignment(SwingConstants.CENTER);
		lblStatistik2.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistik2.setVerticalAlignment(SwingConstants.CENTER);
		lblStatistik3.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistik3.setVerticalAlignment(SwingConstants.CENTER);
		lblStatistik4.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistik4.setVerticalAlignment(SwingConstants.CENTER);
		
		
		this.setVisible(true); 
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
	
	public static void main(String[] args) {
		Album al = new Album();
		
	}
	
}
