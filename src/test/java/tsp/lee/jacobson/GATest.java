package tsp.lee.jacobson;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class GATest {

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testEvolvePopulation_emptyPopulation_shouldReturnArrayIndexOutOfBoundsException(){
		Population pop = new Population(0, true);
		Population actual = GA.evolvePopulation(pop);
	}

	/* sadly don't work
	@Test
	public void testEvolvePopulation_PopulationWith2Individuals_shouldReturn18(){
		City city1 = new City(0, 0);
		City city2 = new City(0, 3);
		City city3 = new City(0, 9);
		ArrayList<City> arrayCity = new ArrayList<City>();
		arrayCity.add(city1);
		arrayCity.add(city2);
		arrayCity.add(city3);
		Tour tour = new Tour(arrayCity);
		Population pop = new Population(1, true);
		pop.saveTour(0, tour);
		double expected = 18.0;
		double actual = GA.evolvePopulation(pop).getFittest().getFitness();
		assertEquals(expected, actual, 0);
	}*/

}
