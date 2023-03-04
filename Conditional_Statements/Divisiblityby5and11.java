/*Java program to check whether a given 
number is divisible by 5 and 11 or not */

package Conditional_Statements;

import java.util.Scanner;

public class Divisiblityby5and11
{
    public static void main(String[] args) 
    {
      Scanner neon = new Scanner(System.in);
      System.out.println("Enter the number here: ");
      int num = neon.nextInt();
      if(num%5==0 && num%11==0)
      {
        System.out.println(num + " is divisible by both 5 and 11.");
      }
      else if(num%5==0)
      {
        System.out.println(num + " is divisible by 5 and not by 11.");
      }
      else if(num%11==0)
      {
        System.out.println(num + " is divisible by 11 and not by 5.");
      }
      else
      {
        System.out.println(num + " is neither divisible by 5 nor by 11.");
      }
    }
}
