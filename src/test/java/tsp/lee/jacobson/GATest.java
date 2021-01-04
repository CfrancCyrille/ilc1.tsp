package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class GATest {

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	/**
	 * Given function evolvePopulation
	 * When the population is empty
	 * Then ArrayIndexOutOfBoundsException
	 */
	public void evolvePopulation_emptyPopulation_ArrayIndexOutOfBoundsException() {
		Population emptyPopulation = new Population(0, false);
		Population actual = GA.evolvePopulation(emptyPopulation);
	}

	@Test
	/**
	 * Given function evolvePopulation
	 * When the population is random and size 25
	 * Then the fitness improves
	 */
	public void evolvePopulation_randomPopulation_ImproveFitness() {
		Population pop = new Population(25, true);
		double fittest_fitness = pop.getFittest().getFitness();

		Population newPop = GA.evolvePopulation(pop);
		double newFittest_fitness = newPop.getFittest().getFitness();

		boolean expected = true;
		boolean actual = newFittest_fitness >= fittest_fitness;
		assertEquals(expected, actual);
	}

	@Test
	/**
	 * Given function evolvePopulation
	 * When the population is random and size 25
	 * Then we get the best fitness
	 */
	public void evolvePopulation_randomPopulation_BestFitness(){
		City A = new City(1,0);
		City B = new City(1,1);
		City C = new City(3,1);
		City D = new City(3,0);

		TourManager.addCity(A);
		TourManager.addCity(B);
		TourManager.addCity(C);
		TourManager.addCity(D);

		Population pop = new Population(4, true);

		pop = GA.evolvePopulation(pop);
		for (int i = 0; i < 50; i++) {
			pop = GA.evolvePopulation(pop);
		}
		int expected = 6; //Distance between A->B->C->D->A = 6
		int actual = pop.getFittest().getDistance();
		assertEquals(expected, actual);
	}

}
