/*Write a Program to Remove brackets from an algebraic expression. Get an algebraic expression 
  as input from the user and then remove all the brackets in that. */

package String_Handling;

import java.util.Scanner;
public class String8 {
      public static void main(String[] args) 
      {
           Scanner sc = new Scanner(System.in);
           //taking string input
           System.out.print("Enter algebraic expression: ");
           String str = sc.nextLine();
           //using replaceAll method to remove brackets
           String str2 = str.replaceAll("[(){}]","");
           System.out.println("Expression without brackets : "+ str2);
      }
}
