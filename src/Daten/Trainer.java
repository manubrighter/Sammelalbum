package Daten;

public class Trainer extends Mensch{

	private String Funktion;
	
	public void createTrainer(int ID, int Alter, String Funktion) {
		super.createSpieler(ID, Alter, Funktion);
		this.Funktion = Funktion;
	}

	public void SpielerString() {
		StringBuilder sb = new StringBuilder();

		sb.append("ID = ");
		sb.append(this.ID);

		sb.append(", Alter = ");
		sb.append(this.Alter);
		
		sb.append(", Anzahl Spiele = ");
		sb.append(this.Funktion);
		System.out.println(sb);
	}
}
