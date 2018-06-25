package Daten;

public class Unparteiische extends Mensch{
	
	private int AnzPfiffe;
	
	public void createUnparteiische(int Alter, int AnzPfiffe) {
		super.createUnparteiische(Alter, AnzPfiffe);
		this.AnzPfiffe = AnzPfiffe;
	}

	public String UnparteiischeString() {
		StringBuilder sbTrainer = new StringBuilder();

		sbTrainer.append("Alter: ");
		sbTrainer.append(this.Alter);
		
		sbTrainer.append(", Anzahl Pfiffe: ");
		sbTrainer.append(this.AnzPfiffe);
		return sbTrainer.toString();
	}
	
}
