/*Java program to take a three digit number as an input from user and 
  to check whether it is an Armstrong Number or not */

package Basic_Programs;

import java.util.Scanner;

public class Armstrong_Number
{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a three digit number here: ");
    int num = sc.nextInt(); //taking a 3 digit number from user as an input

    //extracting the digit present at unit's place
    int a = num % 10; //*this value will be used in the formula*

    //extracting the digit present at ten's place
    int b = num / 10;
    int c = b % 10;  //*this value will be used in the formula*

    //extracting the digit present at hundrerd's place
    int d = b / 10; //*this value will be used in the formula*

    int Armstrong = a*a*a + c*c*c + d*d*d; //formula to check an Armstrong Number

    if(Armstrong == num){
      System.out.println("Result: " + num + " is an Armstrong Number");
    }else{
      System.out.println("Result: " + num + " is not an Armstrong Number");
    }
    
   }
}