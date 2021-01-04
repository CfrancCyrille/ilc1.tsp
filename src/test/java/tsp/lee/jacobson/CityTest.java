package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {
	

	@Test
	
	public void testDistanceToDifferentZero() {
		City ville1 = new City(0, 0);
		City ville2 = new City(2, 0);
		double expected = 2;
		double actual = ville2.distanceTo(ville1);
		assertEquals(expected, actual, 0);
	}
	
	@Test
	
	public void testDistanceToZero() {
		City ville1 = new City(0, 0);
		double expected = 0;
		double actual = ville1.distanceTo(ville1);
		assertEquals(expected, actual, 0);
	}

}
