package Daten;

public class Trainer extends Mensch{

	private String Funktion;
	
	public void createTrainer(int ID, int Alter, String Funktion) {
		super.createTrainer(ID, Alter, Funktion);
		this.Funktion = Funktion;
	}

	public void TrainerString() {
		StringBuilder sbTrainer = new StringBuilder();

		sbTrainer.append("ID = ");
		sbTrainer.append(this.ID);

		sbTrainer.append(", Alter = ");
		sbTrainer.append(this.Alter);
		
		sbTrainer.append(", Funktion = ");
		sbTrainer.append(this.Funktion);
		System.out.println(sbTrainer);
	}
}
