package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	@Test
	/**
	 * Test si les villes sont au meme endroit
	 */
	public void distanceTo_memeCoordonnes_0() {
		double attendue = 0;

		City v1 = new City(0,0);


		double actuelle = v1.distanceTo(v1);

		assertEquals(attendue, actuelle,0);
	}

	@Test
	/**
	 * Test si les villes sont en diagonal cela permet de tester aussi la focntion en vertical et horizontal
	 */
	public void distanceTo_villeEnDiagonale_racineDe2() {
		double attendue = Math.sqrt(2);

		City v1 = new City(1,1);
		City v2 = new City(0,0);

		double actuelle = v2.distanceTo(v1);

		assertEquals(attendue, actuelle,0);
	}

}
