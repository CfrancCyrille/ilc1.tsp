package tsp.lee.jacobson;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TourTest {

	City city1 = new City(0,0);
	City city2 = new City(10,0);
	
	
	ArrayList citiesList = new ArrayList();
	Tour tour = new Tour();
	
	@Test
	public void getDistance_noCities_0() {
		int expected = 0;
		int dist = tour.getDistance();
		assertEquals(expected, dist);
	}
	
	@Test
	public void getDistance_singleCity_0() {
		citiesList.add(city1);
		tour = new Tour(citiesList);
		int expected = 0;
		int dist = tour.getDistance();
		assertEquals(expected, dist);
	}

	@Test
	public void getDistance_2Cities_20() {
		citiesList.add(city1);
		citiesList.add(city2);
		tour = new Tour(citiesList);
		int expected = 20;
		int dist = tour.getDistance();
		assertEquals(expected, dist);
	}

}
