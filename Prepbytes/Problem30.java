//Given a number n, check whether the number is an Automorphic number or not.
//Note- A number is said to be Automorphic number if and only if square ends in the same digits as the number itself.
//input1 --> 5, output1 --> Automorphic
//input2 --> 5, output2 --> Not Automorphic

package Prepbytes;
import java.util.*;

public class Problem30 
{
    public static void main(String[] args) 
    {
        Scanner auto = new Scanner(System.in);
        System.out.println("Enter a number here: ");
        int n = auto.nextInt();
        int sqr = (int) Math.pow(n, 2);
        //printing the square of number n
        System.out.println("Square of the number is: " + sqr);
        //taking the last digit into consideration to check whether it matches the number n or not
        int rem = sqr % 10; 
        if(rem == n)
        { 
            System.out.println("Automorphic");
        }
        else
        {
            System.out.println("Not Automorphic");
        }
    }
}
