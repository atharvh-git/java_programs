//Given an integer, you have to calculate how many number of 1 is present in its binary form
//input--> 3, output--> 2
//input--> 8, output--> 1

package Prepbytes;

import java.util.*;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int a = sc.nextInt();
        int temp = a;
        int setBits = 0;
        while (a > 0) 
        {
            if ((a & 1) == 1) 
            {
                setBits++;
            }
            a = a >> 1;
        }
        System.out.println("Number of Set bits in " + temp + " is " + setBits);
    }
}
