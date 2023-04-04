/*Program to find the number of integers with exactly 9 divisors:
  Given a number N, we need to find the total number of integers with
  exactly 9 divisors within the given range N. */

package Basic_Programs;


import java.io.*;
import java.util.Scanner;
import java.util.*;

public class Divisors
{
    static void check_factors(int n){
    int c = 0;
    for (int i = 1; i <= n; i++)
    {
       if (no_of_divisors(i) == 9)
       {
         System.out.print(i);
         System.out.print(" ");
         c = c + 1;
       }
    }
       System.out.println("\nTotal = "+ c);
    }

   static int no_of_divisors(int n1)
   {
    
     int count = 0;
     for (int i = 1; i <= n1; i++)
     {
       if (n1 % i == 0)
       count = count + 1;
     }
       return count;
   }

 public static void main (String[] args)
    {
    System.out.print("Enter the number :");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print("The number(s) which has exactly 9 divisors : ");
    check_factors(n);
    
    }
}

