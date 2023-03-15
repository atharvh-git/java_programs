/* Write a program to print the area of a rectangle by creating a class
   named 'Area' having 2 methods. First method named as 'setDim' takes length and breadth
   of rectangle as parameters and the second method named as getArea returns the area of the triangle.
   Length and breadth are entered through keyboard. */
 
package Classes_Objects;

import java.util.Scanner;

 class Area {
    int length, breadth;
    void setDim(int x, int y)
    {
        length = x; 
        breadth = y;
    }
    int getArea()
    {
        return length * breadth;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length here: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth here: ");
        int breadth = sc.nextInt();
        Area rect = new Area();
        rect.setDim(length, breadth);
        System.out.println("Area of the rectangle is " + rect.getArea());
        sc.close();
    }
}
