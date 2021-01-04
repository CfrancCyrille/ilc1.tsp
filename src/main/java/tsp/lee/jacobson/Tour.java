package tsp.lee.jacobson;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Une classe ayant comme champs une liste de ville, une valeur de fitness (algo génétique) et une distance
 * @author Bilo
 *
 */
public class Tour{

    // Holds our tour of cities
    private ArrayList<City> tour = new ArrayList<City>();
    // Cache
    private double fitness = 0;
    private int distance = 0;
    
    // Constructs a blank tour
    public Tour(){
        for (int i = 0; i < TourManager.numberOfCities(); i++) {
            tour.add(null);
        }
    }
    
    /**
     * Permet l'assignation du champs tour avec la variable donnée en paramètre
     * @param tour une liste de ville
     */
    public Tour(ArrayList<City> tour){
        this.tour = tour;
    }

    // Creates a random individual
    /**
     * Génère un individu selon le principe des algo génétiques
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
     * Permet, à partir d'un numéro de ville dans la liste, de renvoyer la ville correspondante
     * @param tourPosition le numéro de la ville de la liste qu'on souhaite renvoyer
     * @return la ville de la liste qu'on souhaite renvoyer
     */
    // Gets a city from the tour
    public City getCity(int tourPosition) {
        return (City)tour.get(tourPosition);
    }

    /**
     * 
     * @param tourPosition met la ville souhaitée à la position souhaitée de la liste
     * @param city la ville que l'on souhaite placer
     */
    // Sets a city in a certain position within a tour
    public void setCity(int tourPosition, City city) {
        tour.set(tourPosition, city);
        // If the tours been altered we need to reset the fitness and distance
        fitness = 0;
        distance = 0;
    }
    
    /**
     * un getter du champs fitness
     * @return fitness
     */
    // Gets the tours fitness
    public double getFitness() {
        if (fitness == 0) {
            fitness = 1/(double)getDistance();
        }
        return fitness;
    }
    
    /**
     * Renvoie la distance totale qu'il faudra parcourir pour effectuer tout le voyage
     * @return une valeur correspondante à la distance nécessaire au voyage
     */
    // Gets the total distance of the tour
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
     * Renvoie le nombre de ville dans le voyage
     * @return le nombre de ville dans le voyage
     */
    // Get number of cities on our tour
    public int tourSize() {
        return tour.size();
    }
    
    /**
     * vérification de la présence d'une ville dans le voyage
     * @param city la ville dont on veut vérifier la présence
     * @return true ou false en fonction du résultat
     */
    // Check if the tour contains a city
    public boolean containsCity(City city){
        return tour.contains(city);
    }
    
    /**
     * Un affichage propre du voyage
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
