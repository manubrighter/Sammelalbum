package Daten;

import GUI.Startbildschirm;

/**
 * Verwaltet die Menschen
 * @author Jimoh Meyer & Manuel Heller
 *
 */
public class Mensch {
	
	protected int Alter;

	/**
	 * erstellt Spieler
	 * @param Alter
	 * @param anzSpiele
	 */
	public void createSpieler(int Alter, int anzSpiele) {
		this.Alter = Alter;
	}
	
	/**
	 * erstellt Trainer
	 * @param Alter
	 * @param Funktion
	 */
	public void createTrainer(int Alter, String Funktion) {
		this.Alter = Alter;
	}
	
	/**
	 * erstellt Unparteiische
	 * @param Alter
	 * @param AnzPfiffe
	 */
	public void createUnparteiische(int Alter, int AnzPfiffe) {
		this.Alter = Alter;
	}
	
}
