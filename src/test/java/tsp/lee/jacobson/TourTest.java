package tsp.lee.jacobson;

import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;

public class TourTest {

	@Test
	/**
	 * Given function getDistance
	 * When 0 cities are added
	 * Then distance is equal to 0
	 */
	public void getDistance_0Cities_0(){
		Tour tour = new Tour();

		double actual = tour.getDistance();
		double expected = 0;

		assertEquals(expected, actual, 0);
	}

	@Test
	/**
	 * Given function getDistance
	 * When 1 city is added
	 * Then distance is equal to 0
	 */
	public void getDistance_1Cities_0(){
		ArrayList<City> path = new ArrayList<>();
		City A = new City(1,1);
		path.add(A);

		Tour tour = new Tour(path);

		double actual = tour.getDistance();
		double expected = 0;

		assertEquals(expected, actual, 0);
	}

	@Test
	/**
	 * Given function getDistance
	 * When multiple cities are added
	 * Then distance is equal to the sum of distances between the cities
	 */
	public void getDistance_MultipleCities_SumOfDistances(){
		ArrayList<City> path = new ArrayList<>();
		City A = new City(1,1);
		City B = new City(1,2);
		City C = new City(1,4);
		path.add(A);
		path.add(B);
		path.add(C);


		Tour tour = new Tour(path);

		double actual = tour.getDistance();
		//Distance between A and B is equal to 1
		//Distance between B and C is equal to 2
		//Distance between C and A is equal to 3
		//The sum of the distances is 1+2+3=6
		double expected = 6;

		assertEquals(expected, actual, 0);
	}

}
