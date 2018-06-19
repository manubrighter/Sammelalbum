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
import javax.swing.JTextField;

public class Album extends JFrame implements ActionListener{
	
	
	//Variablen initialisieren
	private JButton B1;
	private JLabel LBild1, LBild2, LBild3, LBild4, LBild5, LBild6, LBild7, LBild8, LName1, LName2, LName3, LName4, LStatistik1, LStatistik2, LStatistik3, LStatistik4, LNation1;  
	private JPanel P1, P2, P3, P4, P5;

	private Font Font50 = new Font("Arial", Font.BOLD, 50);
	private Font Font40 = new Font("Arial", Font.BOLD, 40);
	private Font Font20 = new Font("Arial", Font.BOLD, 20);
	

	
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
		LBild5 = new JLabel();
		LBild6 = new JLabel();
		LBild7 = new JLabel();
		LBild8 = new JLabel();
		LNation1= new JLabel("Schweiz");
		
		P1 = new JPanel();
		P2 = new JPanel();
		P3 = new JPanel();
		P4 = new JPanel();
		P5 = new JPanel();
		
		P1.setBounds(0, 0, 1150, 650);
		
		
		this.add(P1);
		
		P1.setLayout(new BorderLayout());
		P1.add(P2, BorderLayout.NORTH);
		P1.add(P3, BorderLayout.CENTER);
		P1.setBackground(Color.GREEN);
		
		P1.setBorder(BorderFactory.createEmptyBorder(15/*top*/, 40/*left*/, 100/*bottom*/, 40/*right*/));
		
		
		P2.add(LNation1);
		LNation1.setFont(Font50);
		
		
		P3.setLayout(new BorderLayout());
		
		
		
		this.setVisible(true); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //das Programm beenden wenn man es schliesst
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
	
	public static void main(String[] args) {
		Album al = new Album();
		
	}
	
}
