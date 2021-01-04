package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	@Test
	/**
	 * Given function distanceTo
	 * When two cities with the same coordinates
	 * Then distance is equal to 0
	 */
	public void distanceTo_SameCoordinates_0(){
		City A = new City(2,5);
		City B = new City(2,5);

		double actual = A.distanceTo(B);
		double expected = 0;

		assertEquals(actual, expected,0);
	}

	@Test
	/**
	 * Given function distanceTo
	 * When two cities are horizontally aligned
	 * Then distance is the difference between the X axis
	 */
	public void distanceTo_HorizontallyAligned_DiffXAxis(){
		City A = new City(2,5);
		City B = new City(5,5);

		double actual = A.distanceTo(B);
		double expected = 3;

		assertEquals(actual, expected,0);
	}

	@Test
	/**
	 * Given function distanceTo
	 * When two cities are Vertically aligned
	 * Then distance is the difference between the Y axis
	 */
	public void distanceTo_VerticallyAligned_DiffYAxis(){
		City A = new City(2,2);
		City B = new City(2,5);

		double actual = A.distanceTo(B);
		double expected = 3;

		assertEquals(actual, expected,0);
	}

	@Test
	/**
	 * Given function distanceTo
	 * When two cities are diagonal cities
	 * Then distance is the difference between the 2 cities is the segment length of city A and city B
	 */
	public void distanceTo_DiagonalCities_DiffYAxis(){
		City A = new City(3,3);
		City B = new City(2,2);

		double actual = A.distanceTo(B);
		double expected = Math.sqrt(2);

		assertEquals(actual, expected,0);
	}
}
