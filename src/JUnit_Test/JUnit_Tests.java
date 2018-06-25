package JUnit_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Daten.Spieler;
import Daten.Unparteiische;
import Logik.HauptLogik;

class JUnit_Tests {
	
	private static HauptLogik hl;
	private static Unparteiische up;

	/**
	 * Wird vor dem Testen ausgeführt
	 * ein Objekt zur Klasse HauptLogik und Unparteiische erstellen
	 * @throws Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		hl = new HauptLogik();		
		up = new Unparteiische();	
	}

	/**
	 * Wird vor jedem Test ausgeführt
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * testet ob man die richtigen Werte bekommt wenn man eine Abfrage der MenschenListe macht
	 */
	@Test
	void testgetMenschenListe() {
		
		hl.MenschListenLogik();
		
		String test1 = hl.getMenschenListe(0);
		assertTrue(test1.contains("25"));
		assertTrue(test1.contains("15"));
	}
	
	/**
	 * testet ob der Konstruktor, der für das erstellen eines Unparteiischen zuständig ist, richtig funktioniert
	 */
	@Test
	void testcreateUnparteiische() {
		
		up.createUnparteiische(15, 100);
		
		String test2 = up.UnparteiischeString();
		assertTrue(test2.contains("15"));
		assertTrue(test2.contains("100"));
	}

}
