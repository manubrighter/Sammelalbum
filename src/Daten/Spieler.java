package Daten;

import GUI.Album;

/**
 * Verwaltet die Spieler
 * @author Jimoh Meyer & Manuel Heller
 *
 */
public class Spieler extends Mensch{

	private int anzSpiele;
	
	/**
	 * erstellt ein Spieler
	 */
	public void createSpieler(int Alter, int anzSpiele) {
		super.createSpieler(Alter, anzSpiele);
		this.anzSpiele = anzSpiele;
	}
	
	/**
	 * Erstellt eine String aus den lokalen Variablen
	 * @return
	 */
	public String SpielerString() {
		StringBuilder sbSpieler = new StringBuilder();

		sbSpieler.append("Alter: ");
		sbSpieler.append(this.Alter);
		
		sbSpieler.append(", Anzahl Spiele: ");
		sbSpieler.append(this.anzSpiele);
		return sbSpieler.toString();
	}

}