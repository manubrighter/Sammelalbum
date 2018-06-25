 package Logik;

import java.awt.Component;
import java.awt.List;
import java.util.ArrayList;

import Daten.Mensch;
import Daten.Spieler;
import Daten.Trainer;
import Daten.Unparteiische;

public class HauptLogik implements HauptlogikInterface{
	
	ArrayList<String> MenschenListe = new ArrayList<>();
	
	
	Spieler spieler = new Spieler();
	Trainer trainer = new Trainer();
	Unparteiische unparteiische = new Unparteiische();
	
	
	public void Listenlogik(){
	
		spieler.createSpieler(1, 25, 15);
		MenschenListe.add(spieler.SpielerString());
		spieler.createSpieler(2, 19, 8);
		MenschenListe.add(spieler.SpielerString());
		spieler.createSpieler(3, 23, 13);
		MenschenListe.add(spieler.SpielerString());
		
		trainer.createTrainer(4, 87, "Cheftrainer");
		MenschenListe.add(trainer.TrainerString());
		
		unparteiische.createUnparteiische(5, 36, 134);
		MenschenListe.add(unparteiische.UnparteiischeString());
		unparteiische.createUnparteiische(6, 28, 54);
		MenschenListe.add(unparteiische.UnparteiischeString());
		unparteiische.createUnparteiische(7, 32, 87);
		MenschenListe.add(unparteiische.UnparteiischeString());
		unparteiische.createUnparteiische(8, 28, 187);
		MenschenListe.add(unparteiische.UnparteiischeString());
		
	/*	for (int i = 0; i < MenschenListe.size(); i++) {
			System.out.println(MenschenListe.get(i));
		}*/
	}
	
	public String getMenschenListe(int ID) {
		return MenschenListe.get(ID);
	}
	
	
	
	public static void main(String[] args) {
		HauptLogik hl = new HauptLogik();
		hl.Listenlogik();


	}

	
}
