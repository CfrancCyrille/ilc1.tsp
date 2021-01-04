package tsp.lee.jacobson;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TourTest {

	
	City ville1 = new City(0,0);
	City ville2 = new City(1,0);
	
	ArrayList<City> listTour = new ArrayList<City>();
	
	
	@Test
	public void testGetDistanceDifferentTrue() {
		listTour.add(ville1);
		listTour.add(ville2);
		
		Tour tour = new Tour(listTour);
		double dist = tour.getDistance();
		double expected = 2;
		assertEquals(expected, dist, 0);
	}
	
	@Test
	public void testGetDistanceSelfTrue() {
		listTour.add(ville1);
		listTour.add(ville1);
		
		Tour tour = new Tour(listTour);
		double dist = tour.getDistance();
		double expected = 0;
		assertEquals(expected, dist, 0);
	}

}
