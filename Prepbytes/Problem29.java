//Given a natural number n you have to find the sum of the 
//squares of the first n natural numbers.
//input1 --> n=5, output1 --> 55
//input2 --> n=3, output2 --> 14

package Prepbytes;
import java.util.*;

public class Problem29 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int num = sc.nextInt();
        int sqr_sum = 0;
        for (int i = 1; i <= num; i++) 
        {
            //variable sqr_sum will store the sum of squares of all numbers ranging from 1 to the number 'num'
            sqr_sum += (int) Math.pow(i, 2); //using explicit type-casting 
        }
        System.out.println(sqr_sum);
    }
}
