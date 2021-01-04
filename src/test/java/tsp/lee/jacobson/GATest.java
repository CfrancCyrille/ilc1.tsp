package tsp.lee.jacobson;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class GATest {

	@Test
	public void testEvolutionPopulation_EvolutionDeLaPopulationEn1Tour_RienNeChange() {
                ArrayList<City> cities = new ArrayList();
                cities.add(new City(2, 2));
                cities.add(new City(6, 2));
                Tour tour = new Tour(cities);
                
                Population pop = new Population(1,false);
                pop.saveTour(0, tour);
                Population resultat = GA.evolvePopulation(pop);

                assertEquals(resultat.getTour(0).getCity(0), cities.get(0));
                assertEquals(resultat.getTour(0).getCity(1), cities.get(1));
	}

        @Test
        public void testEvolutionPopulation_PopulationDeTaille1_PasDeChangement() {
            ArrayList<City> cities = new ArrayList();
            cities.add(new City(0, 0));
            cities.add(new City(2, 2));
            cities.add(new City(6, 2));
            Tour tour = new Tour(cities);

            Population pop = new Population(1, false);
            pop.saveTour(0, tour);
            Population popEvoluer = GA.evolvePopulation(pop);

            assertEquals(popEvoluer.getFittest(), pop.getFittest());
            assertEquals(1, pop.populationSize());
        }
        
        @Test
        public void testEvolutionPopulation_2Tour_AvecLeMielleurEnPremier() {
            ArrayList<City> cities = new ArrayList();
            cities.add(new City(0, 0));
            cities.add(new City(2, 2));
            cities.add(new City(6, 2));
            Tour bestTour = new Tour(cities);

            ArrayList<City> cities2 = new ArrayList<>(cities);
            cities2.add(new City(80, 60));
            Tour worstTour = new Tour(cities2);

            Population pop = new Population(2, false);
            pop.saveTour(0, worstTour);
            pop.saveTour(1, bestTour);
            Population popEvoluer = GA.evolvePopulation(pop);

            assertEquals(popEvoluer.getTour(0), bestTour);
        }
}
