package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class TourTest {


	// attributs utiles pour les tests
	City ville1 = new City(3,1);
	City ville2 = new City(1,1);
	ArrayList listeVille = new ArrayList();

	/**
	 * Test la méthode getDistance de la classe Tour
	 * When le Tour ne compte pas de ville, le Tour est vide
	 * Then 0
	 */
	@Test
	public void getDistance_aucuneVille_0() {
		Tour tour = new Tour();
		int expected = 0;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}


	/**
	 * Test la méthode getDistance de la classe Tour
	 * When le Tour compte qu'une seule ville
	 * Then 0 la distance entre la ville et elle même
	 */
	@Test
	public void getDistance_uneVille_0() {
		listeVille.add(ville1);
		Tour tour = new Tour(listeVille);
		int expected = 0;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}

	/**
	 * Test la méthode getDistance de la classe Tour
	 * When le Tour compte deux villes
	 * Then 4 (2+2) distance entre les deux villes (2) puis retour à la première ville (2)
	 */
	@Test
	public void getDistance_ville1ToVille2_4() {
		listeVille.add(ville1);
		listeVille.add(ville2);
		Tour tour = new Tour(listeVille);
		int expected = 4;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}


}
