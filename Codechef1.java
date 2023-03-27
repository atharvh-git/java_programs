/*Write a program to obtain a number (N) from the user and display 
  whether the number is a one digit number, 2 digit number, 3 digit number
  or more than 3 digit number */

package CodeChef_Problems;
import java.util.*;

class Codechef1
{
	public static void main (String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// taking input from user/coder

		int count = 0;
		// while loop checks how many digits are present 
		// in the number given by user/coder 
		while(n>0)
		{
		    n = n/10;
		    count++;
		}
		if(count==1)
		{
		    System.out.println("1");
		}
		else if(count==2)
		{
		    System.out.println("2");
		}
		else if(count==3)
		{
		    System.out.println("3");
		}
		else
		{
		    System.out.println("More than 3 digits");
		}
	}
}