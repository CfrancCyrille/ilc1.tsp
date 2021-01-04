package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	// attributs utiles pour les tests
	City ville1 = new City(0, 0);
	City ville2 = new City(0, 2);
	City ville3 = new City(2, 0);

	@Test
	public void distanceTo_ville1FromVille1_0() {
		double expected = 0;
		double actual = ville1.distanceTo(ville1);
		assertEquals(expected, actual, 0.0);
	}

	// test de la premiere ville à la deuxième
	@Test
	public void distanceTo_ville2FromVille1_2(){
		double expected = 2;
		double actual = ville1.distanceTo(ville2);
		assertEquals(expected, actual, 0.0);
	}

	// test de la première à la troisième
	@Test
	public void distanceTo_ville3FromVille1_2(){
		double expected = 2;
		double actual = ville1.distanceTo(ville3);
		assertEquals(expected, actual, 0.0);
	}

	// test du calcule avec une ville qui a des coordonnées négatives
	@Test
	public void distanceTo_NegativeFromVille1_2(){
		City negative = new City(-2,0);
		double expected = 2;
		double actual = ville1.distanceTo(negative);
		assertEquals(expected, actual, 0.0);
	}


	// test si l'argument donné est nul
	@Test(expected=NullPointerException.class)
	public void distanceTo_Null_NullPointerException() {
		double actual = ville1.distanceTo(null);
	}

}
