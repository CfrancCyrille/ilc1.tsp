package tsp.lee.jacobson;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TourTest {

	@Test
	/**
	 * Test si il n'y a pas de ville
	 */
	public void getDistance_PasDeVille_0() {
		int attendue = 0;
		Tour tour = new Tour();
		int resultat = tour.getDistance();

		assertEquals(attendue, resultat,0);

	}

	@Test
	/**
	 * Test si il n'y a qu'une ville
	 */
	public void getDistance_UneVille_0() {
		int attendue = 0;
		ArrayList<City> tableauVille = new ArrayList<City>();
		City v1 = new City(1, 1);
		tableauVille.add(v1);
		Tour tour = new Tour(tableauVille);
		int resultat = tour.getDistance();

		assertEquals(attendue, resultat,0);

	}

	@Test
	/**
	 * Test si il y a plusieurs villes
	 */
	public void getDistance_3Villes_4() {
		int attendue = 4;
		ArrayList<City> tableauVille = new ArrayList<City>();
		City v1 = new City(0, 0);
		City v2 = new City(1, 1);
		City v3 = new City(2,2 );
		tableauVille.add(v1);
		tableauVille.add(v2);
		tableauVille.add(v3);
		Tour tour = new Tour(tableauVille);
		int resultat = tour.getDistance();

		assertEquals(attendue, resultat,0);

	}

}
