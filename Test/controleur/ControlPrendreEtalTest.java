package controleur;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;

class ControlPrendreEtalTest {

	private Village village;
	private ControlVerifierIdentite controlVerifierIdentite;
	private Gaulois asterix;
	private Gaulois obelix;
	private Chef abra;

	@BeforeEach
	public void initialiserSituationAfficherVillage() {
		village = new Village("le village cool", 5, 1);
		abra = new Chef("abra", 10, village);
		village.setChef(abra);

	}

	@Test
	void testResteEtals() {
		fail("Not yet implemented");
	}

	@Test
	void testPrendreEtal() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		ControlPrendreEtal controlPrendreEtal = new ControlPrendreEtal(controlVerifierIdentite, village);
		village.ajouterHabitant(abra);
		village.ajouterHabitant(obelix);
		assertEquals(controlPrendreEtal.prendreEtal("obelix", "voiture", 10), 0);

	}

	@Test
	void testVerifierIdentite() {
		fail("Not yet implemented");
	}

}
