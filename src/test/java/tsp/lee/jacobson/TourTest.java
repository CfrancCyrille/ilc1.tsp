package tsp.lee.jacobson;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {
        City c1 = new City(0,0);
        
	@Test
	public void testGetDistance_GetDistanceDe4Villes_31() {
		City c2 = new City(2,2);
		City c3 = new City(6,2);
		City c4 = new City(12,10);
                ArrayList<City> liste = new ArrayList<>();
                liste.add(c1);
                liste.add(c2);
                liste.add(c3);
                liste.add(c4);
                Tour t = new Tour(liste);
                int expected = 31;
                int actual = t.getDistance();
                assertEquals(expected, actual);
	}
        
        @Test
	public void testGetDistance_GetDistanceDe4VillesAvecCoordonneeNegative_31() {
		City c2 = new City(-2,-2);
		City c3 = new City(-6,-2);
		City c4 = new City(-12,-10);
                ArrayList<City> liste = new ArrayList<>();
                liste.add(c1);
                liste.add(c2);
                liste.add(c3);
                liste.add(c4);
                Tour t = new Tour(liste);
                int expected = 31;
                int actual = t.getDistance();
                assertEquals(expected, actual);
	}
        
        @Test
	public void testGetDistance_GetDistanceDe1Ville_0() {
                ArrayList<City> liste = new ArrayList<>();
                liste.add(c1);
                Tour t = new Tour(liste);
                int expected = 0;
                int actual = t.getDistance();
                assertEquals(expected, actual);
	}

}
