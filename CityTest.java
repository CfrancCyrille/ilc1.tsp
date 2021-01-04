package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	@Test
	public void testdistanceToSameTrue() {
            City city = new City(60, 200);
            double distance = city.distanceTo(city);
            double expected = 0;
            assertEquals(expected, distance, 0.001);
	}
        
        @Test
	public void testdistanceToDifferentTrue() {
            City city = new City(60, 200);
            City city2 = new City(20, 40);
            double distance = city.distanceTo(city2);
            double expected = 164.92422502470643;
            assertEquals(expected, distance, 0.001);
	}

}
