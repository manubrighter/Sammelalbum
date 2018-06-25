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

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		hl = new HauptLogik();		
		up = new Unparteiische();	
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testgetMenschenListe() {
		
		hl.MenschListenLogik();
		
		String test1 = hl.getMenschenListe(0);
		assertTrue(test1.contains("25"));
		assertTrue(test1.contains("15"));
	}
	
	@Test
	void testcreateUnparteiische() {
		
		up.createUnparteiische(15, 100);
		
		String test2 = up.UnparteiischeString();
		assertTrue(test2.contains("15"));
		assertTrue(test2.contains("100"));
	}

}
