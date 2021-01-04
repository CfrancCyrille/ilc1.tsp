package tsp.lee.jacobson;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TourTest {

	City ville1= new City(0,0);
    City ville2= new City(2,0);

	@Test
	public void test_getDistance_4() {
		ArrayList<City> cityList1 = new ArrayList<City>();
	    cityList1.add(ville1);
	    cityList1.add(ville2);
	    Tour tour1 = new Tour(cityList1);
		double expected = 4.0d;
        double actual = tour1.getDistance();
        assertEquals(expected, actual, 0);
	}

    @Test
	public void test_getDistance_Zero() {
    	ArrayList<City> cityList2 = new ArrayList<City>();
        cityList2.add(ville2);
        Tour tour2 = new Tour(cityList2);
		double expected = 0.0d;
        double actual = tour2.getDistance();
        assertEquals(expected, actual, 0);
	}

}
