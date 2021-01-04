package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {
        City c1 = new City(0,0);
        
	@Test
        public void testDistanceTo_DistanceSurMemeVille_0() {      
                double expected = 0.0d;
                double actual = c1.distanceTo(c1);
                assertEquals(expected, actual,0.1);
        }
        
        @Test
        public void testDistanceTo_DistanceEntre2Villes_2() {
                City c1 = new City(2,2);    
                City c2 = new City(8,2);
                double expected = 6.0d;
                double actual = c1.distanceTo(c2);
                assertEquals(expected, actual,0.1);
        }
        
        @Test
        public void testDistanceTo_DistanceTo_MemeDistanceDansLesDeuxSens() {
            City c2 = new City(6,2);
            assertEquals(c2.distanceTo(c1), c1.distanceTo(c2), 0.1);
        }
        
        @Test(expected=NullPointerException.class)
        public void testDistanceTo_Null_NullPointerException() {
            City ville = new City(2, 3);
            double result = ville.distanceTo(null);
        }
}
