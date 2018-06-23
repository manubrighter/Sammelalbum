package Daten;

import GUI.Album;

public class Spieler extends Mensch{

	private int anzSpiele;
	
	public void createSpieler(int ID, int Alter, int anzSpiele) {
		super.createSpieler(ID, Alter, anzSpiele);
		this.anzSpiele = anzSpiele;
	}

	public void spString() {
		StringBuilder sb = new StringBuilder();

		sb.append("ID = ");
		sb.append(this.ID);

		sb.append(", Alter = ");
		sb.append(this.Alter);
		
		sb.append(", anzSpiele = ");
		sb.append(this.anzSpiele);
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		Spieler spieler = new Spieler();
		spieler.createSpieler(1, 20, 15);
		
		spieler.spString();
		
	}
}