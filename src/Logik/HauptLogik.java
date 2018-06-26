 package Logik;

import java.awt.Component;
import java.awt.List;
import java.util.ArrayList;

import Daten.Mensch;
import Daten.Spieler;
import Daten.Trainer;
import Daten.Unparteiische;
import GUI.Startbildschirm;

public class HauptLogik implements HauptlogikInterface{
	
	private ArrayList<String> MenschenListe = new ArrayList<>();
	private ArrayList<String> BilderListe = new ArrayList<>();
	
	
	private Spieler spieler = new Spieler();
	private Trainer trainer = new Trainer();
	private Unparteiische unparteiische = new Unparteiische();
	
	
	public void MenschListenLogik(){
	
		spieler.createSpieler(25, 15);
		MenschenListe.add(spieler.SpielerString());
		spieler.createSpieler(19, 8);
		MenschenListe.add(spieler.SpielerString());
		spieler.createSpieler(23, 13);
		MenschenListe.add(spieler.SpielerString());
		
		trainer.createTrainer(87, "Cheftrainer");
		MenschenListe.add(trainer.TrainerString());
		
		unparteiische.createUnparteiische(36, 134);
		MenschenListe.add(unparteiische.UnparteiischeString());
		unparteiische.createUnparteiische(28, 54);
		MenschenListe.add(unparteiische.UnparteiischeString());
		unparteiische.createUnparteiische(32, 87);
		MenschenListe.add(unparteiische.UnparteiischeString());
		unparteiische.createUnparteiische(28, 187);
		MenschenListe.add(unparteiische.UnparteiischeString());
		
	}
	
		
	public void BildListenLogik(){
		
		//Spieler
		BilderListe.add(".\\IMG\\JohanDjourou.jpg");
		BilderListe.add(".\\IMG\\GranitXhaka.jpg");
		BilderListe.add(".\\IMG\\ManuelAkanji.jpg");
		
		//Trainer
		BilderListe.add(".\\IMG\\VladimirPetkovic.jpg");
		
		//Unparteiische
		BilderListe.add(".\\IMG\\Fahad Al-Mirdasi.jpg");
		BilderListe.add(".\\IMG\\AlirezaFaghani.jpg");
		BilderListe.add(".\\IMG\\RyujiSato.jpg");
		BilderListe.add(".\\IMG\\NawafShukralla.jpeg");
			
	}
	
	/**
	 * gibt den gew�nschten Eintrag der MenschenListe zur�ck
	 */
	public String getMenschenListe(int ID) {
		return MenschenListe.get(ID);
	}
	
	/**
	 * gibt den gew�nschten Eintrag der BilderListe zur�ck
	 */
	public String getBildListe(int ID) {
		return BilderListe.get(ID);
	}
	
}