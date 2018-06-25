package Daten;

import GUI.Startbildschirm;

public class Mensch {
	
	protected int Alter;

	public void createSpieler(int Alter, int anzSpiele) {
		this.Alter = Alter;
	}
	
	public void createTrainer(int Alter, String Funktion) {
		this.Alter = Alter;
	}
	
	public void createUnparteiische(int Alter, int AnzPfiffe) {
		this.Alter = Alter;
	}
	
}
