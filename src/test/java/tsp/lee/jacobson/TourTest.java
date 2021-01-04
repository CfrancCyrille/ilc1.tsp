package tsp.lee.jacobson;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	@Test
	public void test_GetDistance_DistanceTourNonNul_true() {
            City ville1 = new City(2,2);
            City ville2 = new City(2,3);
            City ville3 = new City(2,4);
            
            double expected = ville1.distanceTo(ville2);
            expected += ville2.distanceTo(ville3);
            expected += ville3.distanceTo(ville1);
            
            ArrayList<City> listeVille = new ArrayList<City>();
            listeVille.add(ville1);
            listeVille.add(ville2);
            listeVille.add(ville3);
            
            Tour tour = new Tour(listeVille);
            double result = tour.getDistance();
            assertEquals(expected,result,0);
	}
        
        @Test
	public void test_GetDistance_DistanceTourNul_true() {
            City ville1 = new City(2,2);
            
            double expected = ville1.distanceTo(ville1);
            
            ArrayList<City> listeVille = new ArrayList<City>();
            listeVille.add(ville1);
            
            Tour tour = new Tour(listeVille);
            double result = tour.getDistance();
            assertEquals(expected,result,0);
	}
        
        @Test
	public void test_GetDistance_TourVide_true() {
            
            double expected = 0;
         
            Tour tour = new Tour();
            double result = tour.getDistance();
            assertEquals(expected,result,0);
	}

}
