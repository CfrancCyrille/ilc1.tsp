package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class GATest {

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void evolvePopulation_noPopulation_ArrayIndexOutOfBoundsException() {
		Population emptyPopulation = new Population(0, true);
		Population pop = GA.evolvePopulation(emptyPopulation);
	}

	@Test
	public void evolvePopulation_BestFitness_26(){
		City city1 = new City(0,0);
		City city2 = new City(0,5);
		City city3 = new City(0,10);

		TourManager.addCity(city1);
		TourManager.addCity(city2);
		TourManager.addCity(city3);

		Population pop = new Population(10, true);

		pop = GA.evolvePopulation(pop);
		for (int i = 0; i < 100; i++) {
			pop = GA.evolvePopulation(pop);
		}
		int expected = 20; //5+5+10
		int actual = pop.getFittest().getDistance();
		System.out.print(actual);
		assertEquals(expected, actual);
	}
	
	@Test
	public void evolvePopulation_EvolvedPopVSNonEvolvedPop_True() {
		Population pop = new Population(50, true);
		double fittest_pop = pop.getFittest().getFitness();

		Population evolvedPop = GA.evolvePopulation(pop);
		double fittest_evolvedPop = evolvedPop.getFittest().getFitness();

		boolean expected = true;
		boolean actual = fittest_evolvedPop == fittest_pop;
		assertEquals(expected, actual);		
	}
}
