package tsp.lee.jacobson;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe Tour, un Tour est constitué d'un ensemble de ville
 */
public class Tour{

    // Tableau des villes qui composent le Tour
    private ArrayList<City> tour = new ArrayList<City>();
    // valeur de fitness du Tour
    private double fitness = 0;
    // distance totale entre les villes du Tour
    private int distance = 0;

    /**
     * Construit un Tour vierge
     */
    public Tour(){
        for (int i = 0; i < TourManager.numberOfCities(); i++) {
            tour.add(null);
        }
    }

    /**
     * Construit un Tour à partir d'un autre déjà défni
     * @param tour Tour que l'on recupère en paramètre pour instanccier ce nouveau
     */
    public Tour(ArrayList<City> tour){
        this.tour = tour;
    }

    /**
     * Genère aléatoirement un individu
     */
    public void generateIndividual() {
        // Loop through all our destination cities and add them to our tour
        for (int cityIndex = 0; cityIndex < TourManager.numberOfCities(); cityIndex++) {
          setCity(cityIndex, TourManager.getCity(cityIndex));
        }
        // Randomly reorder the tour
        Collections.shuffle(tour);
    }

    /**
     * Recuère une ville du Tour
     * @param tourPosition Index de la ville que l'on souhaite récupèrer
     * @return la ville souhaitée
     */
    public City getCity(int tourPosition) {
        return (City)tour.get(tourPosition);
    }

    /**
     * Affecte une ville à une certaine position dans le Tour
     * @param tourPosition la position dans le Tour
     * @param city la ville que l'on souhiate affectée
     */
    public void setCity(int tourPosition, City city) {
        tour.set(tourPosition, city);
        // If the tours been altered we need to reset the fitness and distance
        fitness = 0;
        distance = 0;
    }

    /**
     * Retourne la valeur de fitness du Tour
     * @return la valeur de fitness du Tour
     */
    public double getFitness() {
        if (fitness == 0) {
            fitness = 1/(double)getDistance();
        }
        return fitness;
    }

    /**
     * Retourne la distance totale du Tour
     * @return distance totale du Tour
     */
    public int getDistance(){
        if (distance == 0) {
            int tourDistance = 0;
            // Loop through our tour's cities
            for (int cityIndex=0; cityIndex < tourSize(); cityIndex++) {
                // Get city we're travelling from
                City fromCity = getCity(cityIndex);
                // City we're travelling to
                City destinationCity;
                // Check we're not on our tour's last city, if we are set our
                // tour's final destination city to our starting city
                if(cityIndex+1 < tourSize()){
                    destinationCity = getCity(cityIndex+1);
                }
                else{
                    destinationCity = getCity(0);
                }
                // Get the distance between the two cities
                tourDistance += fromCity.distanceTo(destinationCity);
            }
            distance = tourDistance;
        }
        return distance;
    }

    /**
     * Retourne le nombre de ville du Tour
     * @return Nombre de ville du Tour
     */
    public int tourSize() {
        return tour.size();
    }

    /**
     * Verifie si le Tour contient une certaine ville
     * @param city Ville que l'on souhaite vérifiée
     * @return true si la ville est dans le Tour, false sinon
     */
    public boolean containsCity(City city){
        return tour.contains(city);
    }

    /**
     * Decrire le Tour
     * @return description du Tour
     */
    @Override
    public String toString() {
        String geneString = "|";
        for (int i = 0; i < tourSize(); i++) {
            geneString += getCity(i)+"|";
        }
        return geneString;
    }
}
