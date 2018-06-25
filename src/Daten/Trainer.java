package Daten;

public class Trainer extends Mensch{

	private String Funktion;
	
	public void createTrainer(int Alter, String Funktion) {
		super.createTrainer(Alter, Funktion);
		this.Funktion = Funktion;
	}

	public String TrainerString() {
		StringBuilder sbTrainer = new StringBuilder();

		sbTrainer.append("Alter: ");
		sbTrainer.append(this.Alter);
		
		sbTrainer.append(", Funktion: ");
		sbTrainer.append(this.Funktion);
		return sbTrainer.toString();
		
	}
}
