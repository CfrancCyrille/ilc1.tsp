package tsp.lee.jacobson;

public class Population {

    // tableau qui contient les Tours de la population
    Tour[] tours;

    /**
     * Construit une population
     * @param populationSize taille souhaitée pour la population
     * @param initialise true si on souhaite l'initialiser avec des individus genérés aléatoirement
     */
    public Population(int populationSize, boolean initialise) {
        tours = new Tour[populationSize];
        // If we need to initialise a population of tours do so
        if (initialise) {
            // Loop and create individuals
            for (int i = 0; i < populationSize(); i++) {
                Tour newTour = new Tour();
                newTour.generateIndividual();
                saveTour(i, newTour);
            }
        }
    }

    /**
     * Enregistre le Tour à l'index souhaité dans le tableau "tours", attribut de la classe population
     * @param index index auquel on souhiate enregistrer le Tour
     * @param tour Tour que l'on souhaite enregistrer
     */
    public void saveTour(int index, Tour tour) {
        tours[index] = tour;
    }

    /**
     * Recupère le Tour à l'index indiqué
     * @param index index du Tour à récuperer
     * @return Tour à l'index indiqué
     */
    public Tour getTour(int index) {
        return tours[index];
    }

    /**
     * Recupère le meilleur Tour de la population
     * @return meilleur Tour de la population
     */
    public Tour getFittest() {
        Tour fittest = tours[0];
        // Loop through individuals to find fittest
        for (int i = 1; i < populationSize(); i++) {
            if (fittest.getFitness() <= getTour(i).getFitness()) {
                fittest = getTour(i);
            }
        }
        return fittest;
    }

    /**
     * Rtourne la taille de la population
     * @return retourne le nombre de Tour de la population
     */
    public int populationSize() {
        return tours.length;
    }
}
