/*Java program to check whether a triangle 
 is equlilateral, isosceles or scalene triangle */

package Conditional_Statements;

import java.util.Scanner;

public class TriangleCheck 
{
    public static void main(String[] args) 
    {
        Scanner tri = new Scanner(System.in);//taking length of all three sides as an input from user
        System.out.print("Enter the length of first side: "); 
        int fs = tri.nextInt(); 
        System.out.print("Enter the length of second side: ");
        int ss = tri.nextInt();  
        System.out.print("Enter the length of third side: ");
        int ts = tri.nextInt(); 
        if(fs==ss && ss==ts && fs==ts)
        {
            System.out.println("This is an equilateral triangle.");
        }

        else if(fs==ss || ss==ts || fs==ts)
        {
            System.out.println("This is an isosceles triangle.");
        }
        else
        {
            System.out.println("This is a scalene triangle.");
        }
    }
}
