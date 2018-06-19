package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Album extends JFrame implements ActionListener{
	
	
	//Variablen initialisieren
	private JButton B1;
	private JTextField T1; 
	private JLabel L1;  
	private JPanel P1;
	private JRadioButton R1;
	private JCheckBox CH1;
	private JComboBox CO1;
	private String[] A1 = { "text1", "text2", "text3" };

	private Font F1 = new Font("Arial", Font.BOLD, 50);
	
	public Album() {
		this.setLayout(null); 
		
		this.setResizable(false); //Fenstergrösse ist nicht veränderbar
		this.setSize(1150, 650); //Grösse des Fensters definieren
		this.setLocation(530, 350); //Ort des Fensters definieren
		
		
		
		
		
		this.setVisible(true); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //das Programm beenden wenn man es schliesst
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
	
}
