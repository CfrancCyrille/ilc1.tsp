package tsp.lee.jacobson;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class GATest {

	@Test
	public void test_EvolvePopulation_ModificationTour_true() {
       
            City ville1 = new City(2,2);
            City ville2 = new City(2,8);
            City ville3 = new City(2,4);
            City ville4 = new City(2,0);
            ArrayList<City> listeVille = new ArrayList<City>();
            listeVille.add(ville1);
            listeVille.add(ville2);

            Tour tour1 = new Tour(listeVille);
      
            ArrayList<City> listeVille2 = new ArrayList<City>();
            listeVille2.add(ville3);
            listeVille2.add(ville4);
            Tour tour2 = new Tour(listeVille2);
            
            Population populationOriginal = new Population(2,false);
            populationOriginal.saveTour(0, tour1);
            populationOriginal.saveTour(1, tour2);
               
            Population populationEvolue = GA.evolvePopulation(populationOriginal);
            double TourPO = populationOriginal.getTour(0).getDistance();
            double TourPE = populationEvolue.getTour(0).getDistance();
            
            boolean expected = true;
            boolean result = false;
            if (TourPO != TourPE){
                result = true;
            }
            assertEquals(expected,result);
	}

}
