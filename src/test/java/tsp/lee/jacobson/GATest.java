package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class GATest {

	
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testEvolvePopulationNullArrayIndexOutOfBoundsException() {
        Population nullPopulation = new Population(0, true);
        Population newPopulation = GA.evolvePopulation(nullPopulation);
    }
	
	@Test
	public void testEvolvePopulation() {
		
		
	}

}
