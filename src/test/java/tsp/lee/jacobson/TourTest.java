package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class TourTest {


	// attributs utiles pour les tests
	City ville1 = new City(3,1);
	City ville2 = new City(1,1);
	ArrayList listeVille = new ArrayList();


	// test si le Tour ne compte pas de ville, le Tour est vide
	@Test
	public void getDistance_aucuneVille_0() {
		Tour tour = new Tour();
		int expected = 0;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}

	// test si le Tour ne contient qu'une seule ville
	@Test
	public void getDistance_uneVille_0() {
		listeVille.add(ville1);
		Tour tour = new Tour(listeVille);
		int expected = 0;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}

	// test si le Tour contient 2 villes
	@Test
	public void getDistance_ville1ToVille2_16() {
		listeVille.add(ville1);
		listeVille.add(ville2);
		Tour tour = new Tour(listeVille);
		int expected = 4;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}


}
