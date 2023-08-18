//Given any non-negative number and print it with its digits in descending order, Descending order 
//is when you sort from the highest  to the lowest
//input1 -> 73065, output1 -> 76530

package Prepbytes;
import java.util.*;

public class Problem26 {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scan.nextLong();

        //Count the number of digits in the input number
        long temp = number;
        int numDigits = 0;
        while(temp > 0) 
        {
            temp /= 10;
            numDigits++;
        }

        //Create an array to store the digits
        int[] digits = new int[numDigits];

        //Extract and store the digits in the array
        temp = number;
        for (int i = 0; i < numDigits; i++) 
        {
            digits[i] = (int) (temp % 10);
            temp /= 10;
        }

        //Sort the digits array in descending order using bubble sort
        for (int i = 0; i < numDigits - 1; i++) 
        {
            for (int j = 0; j < numDigits - i - 1; j++) 
            {
                if (digits[j] < digits[j + 1]) 
                {
                    int tempValue = digits[j];
                    digits[j] = digits[j + 1];
                    digits[j + 1] = tempValue;
                }
            }
        }

        //Print the sorted digits
        System.out.print("The required number is: ");
        for (int i = 0; i < numDigits; i++) 
        {
            System.out.print(digits[i]);
        }
        
    }
}
