package tsp.lee.jacobson;

/**
 * 
 * @author Bilo
 *Classe city prenant comme élement de construction une coordonnée x et une coordonnée y
 */
public class City {
    int x;
    int y;
    
    // Constructs a randomly placed city
    /**
     * Le constructeur sans paramètre de city qui initialise des coordonnées aléatoires 
     */
    public City(){
        this.x = (int)(Math.random()*200);
        this.y = (int)(Math.random()*200);
    }
    
    /**
     * Le constructeur de city prenant en pamamètre les deux champs x et y 
     * @param x la coordonnée x de la ville
     * @param y la coordonnée y de la ville
     */
    // Constructs a city at chosen x, y location
    public City(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    /**
     * Le getter de la coordonnée x
     * @return x
     */
    // Gets city's x coordinate
    public int getX(){
        return this.x;
    }
    
    /**
     * le getter de la coordonnée y
     * @return y
     */
    // Gets city's y coordinate
    public int getY(){
        return this.y;
    }
    
    /**
     * Calcul la distance entre les deux villes , avec une donnée en paramètre grâce à la formule mathématique correspondante
     * @param city une ville avec laquelle on veut la distance
     * @return un nombre correspondant à la distance entre les deux villes
     */
    // Gets the distance to given city
    public double distanceTo(City city){
        int xDistance = Math.abs(getX() - city.getX());
        int yDistance = Math.abs(getY() - city.getY());
        double distance = Math.sqrt( (xDistance*xDistance) + (yDistance*yDistance) );
        
        return distance;
    }
    
    /**
     * Permet l'affichage correcte des coordonnées de la ville
     */
    @Override
    public String toString(){
        return getX()+", "+getY();
    }
}