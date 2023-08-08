//Given a function that will return an integer number corresponding to the amount
//of digits in the given number
//input1 --> 1000, output1 --> 4
//input2 --> 0, output2 --> 1

package Prepbytes;

import java.util.*;

public class Problem16 {

    static int countDigits(int n)
    {
        int rem, count = 0;
        if(n == 0) count = 1;
        while(n > 0)
        {
          rem = n % 10;
          count++;
          n /= 10;
        }
       return count;
    }
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sd.nextInt();
        System.out.println(countDigits(num));
    }
}
