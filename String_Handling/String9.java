/*Write a Program to Count the sum of numbers in a string. Get a string from the user 
  and find the sum of numbers in the string. */


package String_Handling;

import java.util.Scanner;

public class String9
{
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str1 = sc.nextLine();

        int sum=0;
     for (int i = 0; i < str1.length(); i++) {
        if(Character.isDigit(str1.charAt(i)))
            sum = sum + Character.getNumericValue(str1.charAt(i));
        }
        System.out.println("Sum is: " + sum);
    }
}

