package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class TourTest {

	@Test
	public void testGetDistanceTourNonVide_DifferentZero() {
		City ville1 = new City(2, 2);
		City ville2 = new City(2, 3);
		City ville3 = new City(2, 4);
		
		double expected = ville1.distanceTo(ville2);
		expected += ville2.distanceTo(ville3);
		expected += ville3.distanceTo(ville1);
		
		ArrayList<City> cityList = new ArrayList<City>();
		cityList.add(ville1);
		cityList.add(ville2);
		cityList.add(ville3);
		
		Tour tour = new Tour(cityList);
		double actual = tour.getDistance();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testGetDistanceTour1Ville_Zero() {
		City ville1 = new City(2, 2);
		
		double expected = ville1.distanceTo(ville1);
		
		ArrayList<City> cityList = new ArrayList<City>();
		cityList.add(ville1);
		
		Tour tour = new Tour(cityList);
		double actual = tour.getDistance();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testGetDistanceTourSansVille_Zero() {
		double expected = 0;
		
		Tour tour = new Tour();
		double actual = tour.getDistance();
		assertEquals(expected, actual, 0);
	}

}
