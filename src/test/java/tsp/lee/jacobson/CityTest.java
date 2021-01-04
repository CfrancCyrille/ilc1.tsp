package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	City city1 = new City(0,0);
	City city2 = new City(10,0);
	City city3 = new City(-10,0);
	
	@Test
	public void DistanceTo_City1ToCity1_0() {
		double expected = 0;
		double dist = city1.distanceTo(city1);
		assertEquals(expected, dist, 0.0);		
	}

	@Test
	public void DistanceTo_City1ToCity2_10() {
		double expected = 10;
		double dist = city1.distanceTo(city2);
		assertEquals(expected, dist, 0.0);		
	}

	@Test
	public void DistanceTo_City2ToCity1_10() {
		double expected = 10;
		double dist = city2.distanceTo(city1);
		assertEquals(expected, dist, 0.0);		
	}

	@Test
	public void distanceTo_City1ToCity3_10(){ //City with a negative coordinate
		double expected = 10;
		double dist = city1.distanceTo(city3);
		assertEquals(expected, dist, 0.0);
	}

	@Test(expected=NullPointerException.class)
	public void distanceTo_City1ToNull_NullPointerException() {
		double dist = city1.distanceTo(null);
	}
}
