package Logik;

import Daten.Spieler;

public class HauptLogik {
	public static void main(String[] args) {
		Spieler spieler = new Spieler();
		spieler.createSpieler(1, 25, 15);
		
		spieler.SpielerString();
		
	}

}
