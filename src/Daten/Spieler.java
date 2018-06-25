package Daten;

import GUI.Album;

public class Spieler extends Mensch{

	private int anzSpiele;
	
	public void createSpieler(int Alter, int anzSpiele) {
		super.createSpieler(Alter, anzSpiele);
		this.anzSpiele = anzSpiele;
	}
	

	public String SpielerString() {
		StringBuilder sbSpieler = new StringBuilder();

		sbSpieler.append("Alter: ");
		sbSpieler.append(this.Alter);
		
		sbSpieler.append(", Anzahl Spiele: ");
		sbSpieler.append(this.anzSpiele);
		return sbSpieler.toString();
	}

}