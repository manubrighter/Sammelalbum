package Daten;

/**
 * Verwaltet die Trainer
 * @author Jimoh Meyer & Manuel Heller
 *
 */
public class Trainer extends Mensch{

	private String Funktion;
	
	/**
	 * erstellt ein Trainer
	 */
	public void createTrainer(int Alter, String Funktion) {
		super.createTrainer(Alter, Funktion);
		this.Funktion = Funktion;
	}

	/**
	 * Erstellt eine String aus den lokalen Variablen
	 * @return
	 */
	public String TrainerString() {
		StringBuilder sbTrainer = new StringBuilder();

		sbTrainer.append("Alter: ");
		sbTrainer.append(this.Alter);
		
		sbTrainer.append(", Funktion: ");
		sbTrainer.append(this.Funktion);
		return sbTrainer.toString();
		
	}
}
