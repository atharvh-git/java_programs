/*Java progarm to find and print all the roots 
  of a quadratic equation */
package Conditional_Statements;

import java.util.Scanner;

public class Quadratic_eq_roots 
{
    public static void main(String[] args) {
    Scanner roots = new Scanner(System.in);
    //taking the co-efficients of quadratic equations as an input from the user/programmer 
    System.out.print("Enter the value of 'a' here: ");
    double a = roots.nextInt();
    System.out.print("Enter the value of 'b' here: ");
    double b = roots.nextInt();
    System.out.print("Enter the value of 'c' here: ");
    double c = roots.nextInt();
    //formula of discriminant d
    double d = Math.pow(b, 2)-4*a*c;
    if(d==0)
    {
      System.out.println("Roots are real and equal.");
      System.out.println("Root 1 = Root 2 = " + -b/(2*a));
    }
    else if(d>0)
    {
        System.out.println("Roots are real");
        System.out.println("Roots are " + (-b + Math.sqrt(d))/(2*a) + " and " + (-b - Math.sqrt(d))/(2*a));
    }
    else
    {
      System.out.println("No real roots");
      System.out.println("Roots are " + -b/(2*a) + "+i" + Math.sqrt(-d/(2*a)) + " and " 
                         + -b/(2*a) + "-i" + Math.sqrt(-d/2*a));
    }
    
    }

}
