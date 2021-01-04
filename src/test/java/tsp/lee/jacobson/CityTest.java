package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {
        City Ville1 = new City(2,2);
        City Ville2 = new City(2,3);
        
	@Test
	public void Test_getDistanceTo_VilleIdentique_true() {           
            double expected = 0;
            double result = Ville1.distanceTo(Ville1);
            assertEquals(expected,result,0);
	}

        @Test
	public void Test_getDistanceTo_VilleDifferente_true() {       
            double expected = 1;
            double result = Ville1.distanceTo(Ville2);
            assertEquals(expected,result,0);
	}
}
