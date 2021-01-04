package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	City city = new City();
	City city1 = new City(0, 0);
	City city2 = new City(0, 2);

	@Test
	public void testDistanceTo_theSameCity_shouldReturn0d(){
		double expected = 0.0;
		double actual = city.distanceTo(city);
		assertEquals(expected, actual, 0);
	}

	@Test
	public void testDistanceTo_city2FromCity1_shouldReturn2d(){
		double expected = 2.0;
		double actual = city1.distanceTo(city2);
		assertEquals(expected, actual, 0);
	}
}
