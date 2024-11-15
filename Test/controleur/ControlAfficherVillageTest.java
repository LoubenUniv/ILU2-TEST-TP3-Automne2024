package controleur;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlAfficherVillageTest {
	private Village village;
	private Chef abra;

	@BeforeEach
	public void initialiserSituationAfficherVillage() {
		village = new Village("le village cool", 5, 1);
		abra = new Chef("abra", 10, village);
		village.setChef(abra);
	}

	@Test
	void testDonnerNomsVillageois() {
		fail("Not yet implemented");
	}

	@Test
	void testDonnerNomVillage() {
		fail("Not yet implemented");
	}

	@Test
	void testDonnerNbEtals() {
		fail("Not yet implemented");
	}

}
