package tsp.lee.jacobson;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	City city1 = new City(0, 0);
	City city2 = new City(0, 3);
	City city3 = new City(0, 9);



	@Test
	public void testGetDistance_with3CityInline_shouldReturn18(){
		ArrayList<City> arrayCity = new ArrayList<City>();
		arrayCity.add(city1);
		arrayCity.add(city2);
		arrayCity.add(city3);
		Tour tour = new Tour(arrayCity);
		int expected = 18;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDistance_empty_shouldReturn0(){
		ArrayList<City> emptyArray = new ArrayList<City>();
		Tour tour = new Tour(emptyArray);
		int expected = 0;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}

}
