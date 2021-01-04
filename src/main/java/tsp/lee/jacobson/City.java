package tsp.lee.jacobson;

/**
 * Classe représentant une ville
 * Une ville possède des coordonnées 2D: x, y
 */
public class City {
    int x;
    int y;

    /**
     * Construit une ville placée aléatoirement
     */
    public City(){
        this.x = (int)(Math.random()*200);
        this.y = (int)(Math.random()*200);
    }

    /**
     * Construit une ville avec des coordonnées précises
     * @param x coordonnée x qu'on souhaite donner à notre ville
     * @param y coordonnée y qu'on souhaite donner à notre ville
     */
    public City(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Retourne la coordonnée x de la ville
     * @return coordonnée x de la ville
     */
    public int getX(){
        return this.x;
    }

    /**
     * Retourne la coordonnée y de la ville
     * @return coordonnée y de la ville
     */
    public int getY(){
        return this.y;
    }

    /**
     * Calcule la distance jusqu'à une autre ville donnée
     * @param city deuxième ville dont on souhaite calculer la distance par rapport à celle-ci
     * @return distance calculée entre la ville et celle placé en paramètre
     */
    public double distanceTo(City city){
        int xDistance = Math.abs(getX() - city.getX());
        int yDistance = Math.abs(getY() - city.getY());
        double distance = Math.sqrt( (xDistance*xDistance) + (yDistance*yDistance) );
        
        return distance;
    }

    /**
     * Renvoie une description de notre ville, la description contient les coordonnées de la ville
     * @return description de la ville sous forme d'un String
     */
    @Override
    public String toString(){
        return getX()+", "+getY();
    }
}