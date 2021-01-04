package tsp.lee.jacobson;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class GATest {

	@Test
	public void testEvolvePopulationBetterTrue() {
            Population pop = new Population(2, false);
            ArrayList<City> listCities = new ArrayList<City>();
            ArrayList<City> listCities2 = new ArrayList<City>();
            City city = new City(60, 200);
            City city2 = new City(10, 20);
            City city3 = new City(40, 60);
            City city4 = new City(10, 30);
            listCities.add(city);
            listCities.add(city3);
            listCities2.add(city2);
            listCities2.add(city4);
            Tour tour1 = new Tour(listCities);
            Tour tour2 = new Tour(listCities2);
            pop.saveTour(0, tour1);
            pop.saveTour(1, tour2);
            
            Population newPop = GA.evolvePopulation(pop);
            
           Tour expected = tour2;
          
           Tour tour3 = newPop.getTour(0);
           
           assertEquals(expected, tour3);
	}

}
