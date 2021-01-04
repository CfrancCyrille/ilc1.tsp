package tsp.lee.jacobson;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	@Test
	public void testgetDistanceSameTrue() {
            City city = new City(60, 200);
            ArrayList<City> listCities = new ArrayList<City>();
            listCities.add(city);
            Tour tour = new Tour(listCities);
            double distance = tour.getDistance();
            double expected = 0;
            assertEquals(expected, distance, 0.001);    
	}
        
        @Test
	public void testgetDistanceDifferentTrue() {
            City city = new City(60, 200);
            City city2 = new City(20, 40);
            ArrayList<City> listCities = new ArrayList<City>();
            listCities.add(city);
            listCities.add(city2);
            Tour tour = new Tour(listCities);
            double distance = tour.getDistance();
            double expected = 328;
            assertEquals(expected, distance, 0.001);    
	}

}
