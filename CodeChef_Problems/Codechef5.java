/*Chef's son Chefu found some matches in the kitchen and he immediately starting playing with them.
The first thing Chefu wanted to do was to calculate the result of his homework — the sum of A and 
B, and write it using matches. Help Chefu and tell him the number of matches needed to write the result. */

package CodeChef_Problems;

import java.util.*;

public class Codechef5 
{
    public static void main (String[] args)
	{
	
		Scanner match = new Scanner(System.in);
        //creating an array of number of matches required to create numbers from 0 to 9
		int matches[] = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6}; 
        //taking two numbers as an input from user/coder 
            System.out.println("Enter the value of a: ");
		    int a = match.nextInt();
            System.out.println("Enter the value of b: ");
		    int b = match.nextInt();
        
            int sum = a + b; //printing the sum of a and b
            System.out.println("Their sum is: " + sum); 
            int matches_req = 0; //initially we haven't created any number using matches hence 0
            
            while(sum != 0)
            {
                int rem = sum % 10;
                matches_req = matches_req + matches[rem];
                sum = sum / 10;
            }
            System.out.println("Number of matches required to write the sum is: ");
            System.out.println(matches_req);
	}
    
}
