/*Create a class “Room” which will hold the “height”, “width” and “breadth” 
  of the room in three fields(variables). This class also has a method “volume()” 
  to calculate the volume of this room. */

package Classes_Objects;

import java.util.Scanner;

class Room
{
  double height, width, breadth;
  void setDimensions(double x, double y, double z)
  {
      height = x; 
      width = y;
      breadth = z;
  }
     double Volume()
     {
        return height * width * breadth;
     }
}
public class Volume
{
    public static void main(String[] args) 
    {
        Scanner vol = new Scanner(System.in);
        System.out.println("Enter height of the room: ");
        double height = vol.nextDouble();
        System.out.println("Enter width of the room: ");
        double width = vol.nextDouble();
        System.out.println("Enter breadth of the room: ");
        double breadth = vol.nextDouble();
        Room r1 = new Room();
        r1.setDimensions(height, width, breadth);
        System.out.println("Volume of the room is " + r1.Volume());
        vol.close();

    }
}
