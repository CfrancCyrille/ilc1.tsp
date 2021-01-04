package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class GATest {

	
	@Test
	public void evolvePopulation_ZeroPopulation_False() {
		Population pop0 = new Population(0,true);
		boolean expected = false;
	}

}
