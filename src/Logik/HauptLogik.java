package Logik;

import Daten.Spieler;
import Daten.Trainer;
import Daten.Unparteiische;

public class HauptLogik {
		
	public static void main(String[] args) {
		//Spieler hinzufügen~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		Spieler spieler = new Spieler();
		spieler.createSpieler(1, 25, 15);
		spieler.createSpieler(2, 19, 7);
		spieler.createSpieler(3, 13, 13);
		
		//Trainer hinzufügen~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		Trainer trainer = new Trainer();
		trainer.createTrainer(4, 87, "Cheftrainer");
		
		//Unparteiische hinzufügen~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		Unparteiische unparteiische = new Unparteiische();
		unparteiische.createUnparteiische(5, 36, 134);
		unparteiische.createUnparteiische(6, 28, 54);
		unparteiische.createUnparteiische(7, 32, 87);
		unparteiische.createUnparteiische(8, 28, 187);
		
		spieler.SpielerString();
		trainer.TrainerString();
		unparteiische.UnparteiischeString();
	}

}
