package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	City ville1 = new City(0,0);

	@Test
	public void distanceTo_SameCity_Zero() {
        double expected = 0.0d;
        double actual = ville1.distanceTo(ville1);
        assertEquals(expected, actual, 0);
	}

    @Test
	public void distanceTo_2DifferentsCity_Zero() {
        City ville2 = new City(2,0);
        double expected = 2.0d;
        double actual = ville1.distanceTo(ville2);
        assertEquals(expected, actual, 0);
	}

}
