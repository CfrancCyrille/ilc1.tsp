package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class GATest {

	@Test
	/**
	 * On verifie que la population évolue
	 */
	public void evolvePopulation_Evolution_True() {
		Population origine = new Population(50, true);
		Population resultat = GA.evolvePopulation(origine);

		assertNotEquals(origine, resultat);

	}

	@Test
	/**
	 * On verifie que l'on obtient bien la valeure optimale
	 */
	public void evolvePopulation_solution_5(){
		City v1 = new City(0, 0);
		City v2 = new City(1, 0);
		City v3 = new City(0, 1);
		City v4 = new City(0, 2);
		City v5 = new City(1, 1);

		TourManager.addCity(v1);
		TourManager.addCity(v2);
		TourManager.addCity(v3);
		TourManager.addCity(v4);
		TourManager.addCity(v5);

		Population pop = new Population(6, true);
		

		int i = 0;
		while (i < 50) {
			i++;
			pop = GA.evolvePopulation(pop);
		}
		int attendu = 5;
		int resultat  = pop.getFittest().getDistance();

		assertEquals(attendu, resultat,0);

	}

}
