package Daten;

import GUI.Album;

public class Spieler extends Mensch{

	private int anzSpiele;
	
	public void createSpieler(int ID, int Alter, int anzSpiele) {
		super.createSpieler(ID, Alter, anzSpiele);
		this.anzSpiele = anzSpiele;
	}

	public void SpielerString() {
		StringBuilder sb = new StringBuilder();

		sb.append("ID = ");
		sb.append(this.ID);

		sb.append(", Alter = ");
		sb.append(this.Alter);
		
		sb.append(", Anzahl Spiele = ");
		sb.append(this.anzSpiele);
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		Spieler spieler = new Spieler();
		spieler.createSpieler(1, 25, 15);
		
		spieler.SpielerString();
		
	}
}