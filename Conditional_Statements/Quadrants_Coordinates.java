/*Java program to check in which quadrant 
  the point lies and print it. */

package Conditional_Statements;

import java.util.Scanner;

public class Quadrants_Coordinates 
{
    public static void main(String[] args) 
    {
        Scanner quad = new Scanner(System.in);
        //taking the co-ordinates as an input from user/programmer
        System.out.println("Enter the x co-ordinate: ");
        int x = quad.nextInt();
        System.out.println("Enter the y co-ordinate: ");
        int y = quad.nextInt();
        if(x>0 && y>0)
        {
            System.out.println("("+ x + "," + y + ")" +" point lies in the 1st quadrant.");
        }
        else if(x<0 && y>0)
        {
            System.out.println("("+ x + "," + y + ")" +" point lies in the 2nd quadrant.");
        }
        else if(x<0 && y<0)
        {
            System.out.println("("+ x + "," + y + ")" +" point lies in the 3rd quadrant.");
        }
        else if(x>0 && y<0)
        {
            System.out.println("("+ x + "," + y + ")" +" point lies in the 4th quadrant.");
        }
        else if(x==0 && y==0)
        {
            System.out.println("("+ x + "," + y + ")" +" point lies at origin.");
        }
        else if(x==0 && y>0 || y<0)
        {
            System.out.println("("+ x + "," + y + ")" +" point lies on the Y-axis.");
        }
        else if(y==0 && x>0 || x<0)
        {
            System.out.println("("+ x + "," + y + ")" +" point lies on the X-axis.");
        }

    }
}
