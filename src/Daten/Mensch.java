package Daten;

public class Mensch {
	
	protected int ID;
	protected int Alter;

	public void createSpieler(int ID, int Alter, int anzSpiele) {
		this.ID = ID;
		this.Alter = Alter;
	}
	
	public void createTrainer(int ID, int Alter, String Funktion) {
		this.ID = ID;
		this.Alter = Alter;
	}
	
	public void createUnparteiische(int ID, int Alter, int AnzPfiffe) {
		this.ID = ID;
		this.Alter = Alter;
	}
	
	public int getID() {
		return ID;
	}
}
