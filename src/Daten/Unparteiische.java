package Daten;

/**
 * Daten der Unparteiischen
 * @author Jimoh Meyer & Manuel Heller
 *
 */
public class Unparteiische extends Mensch{
	
	private int AnzPfiffe;
	
	/**
	 * erstellt ein Unparteiischen
	 */
	public void createUnparteiische(int Alter, int AnzPfiffe) {
		super.createUnparteiische(Alter, AnzPfiffe);
		this.AnzPfiffe = AnzPfiffe;
	}

	/**
	 * Erstellt eine String aus den lokalen Variablen
	 * @return
	 */
	public String UnparteiischeString() {
		StringBuilder sbTrainer = new StringBuilder();

		sbTrainer.append("Alter: ");
		sbTrainer.append(this.Alter);
		
		sbTrainer.append(", Anzahl Pfiffe: ");
		sbTrainer.append(this.AnzPfiffe);
		return sbTrainer.toString();
	}
	
}
