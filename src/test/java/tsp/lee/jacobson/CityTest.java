package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;


public class CityTest {
	
	
	City ville1 = new City(0,0);
	City ville2 = new City(1,0);
	
	@Test
	public void testDistanceToSelfTrue() {
		double expected = 0.0d;
		double dist = ville1.distanceTo(ville1);
		assertEquals(expected, dist, 0);
	
	}
	
	public void testDistanceToDifferentTrue() {
		double expected = 1.0d;
		double dist = ville1.distanceTo(ville2);
		assertEquals(expected, dist, 0);
	}

}
