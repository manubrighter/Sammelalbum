package Daten;

import GUI.Album;

public class Spieler extends Mensch{

	private int anzSpiele;
	
	public void createSpieler(int ID, int Alter, int anzSpiele) {
		super.createSpieler(ID, Alter, anzSpiele);
		this.anzSpiele = anzSpiele;
	}

	public void SpielerString() {
		StringBuilder sbSpieler = new StringBuilder();

		sbSpieler.append("ID: ");
		sbSpieler.append(this.ID);

		sbSpieler.append(", Alter: ");
		sbSpieler.append(this.Alter);
		
		sbSpieler.append(", Anzahl Spiele: ");
		sbSpieler.append(this.anzSpiele);
		System.out.println(sbSpieler);
	}
	
}