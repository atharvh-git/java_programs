// Create a class that captures planets. Each planet has a name, a 
// distance from the sun, and its gravity relative to Earth’s gravity. 
// For distance and gravity, use the type double which captures real numbers. 
// Make objects for Earth and your favorite non-earth planet.


package Classes_Objects;

public class Planet 
{
    private String planet_name;
    private double distance_fs; // distance from sun
    private double gravity; // gravity relative to earth's gravity

    public Planet(String n, double d, double g)
    {
        planet_name = n;
        distance_fs = d;
        gravity = g;
    }
     public String getPlanet_name()
     {
         return planet_name;
     }
     public double getDistance_fs()
     {
         return distance_fs;
     }
     public double getGravity()
     {
         return gravity;
     }

     public static void main(String[] args) 
     {
        Planet p1 = new Planet("Earth", 150, 9.807); //object of planet EARTH
        //Printing the required details of planet Earth
        System.out.println("Name of the planet: " + p1.getPlanet_name());
        System.out.println("Distance of the planet from sun(in million kms): " + p1.getDistance_fs());
        System.out.println("Gravity relative to earth's gravity: " + p1.getGravity());

        System.out.println();

        Planet p2 = new Planet("Venus", 107.76, 8.87); //object of planet VENUS
        //Printing the required details of planet Venus
        System.out.println("Name of the planet: " + p2.getPlanet_name());
        System.out.println("Distance of the planet from sun(in million kms): " + p2.getDistance_fs());
        System.out.println("Gravity relative to earth's gravity: " + p2.getGravity());
     }
}
