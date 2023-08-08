//Given a natural number x, you have to find which number is just greater than its square root
//input--> 16, output--> 5

package Prepbytes;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number here: ");
        int number = sc.nextInt();
        //using explicit type-casting as we want a natural number instead 
        //a float or double value
        int myNum = (int) Math.sqrt(number);
        //the number just greater than myNum is given by
        myNum += 1;
        System.out.println(myNum);
    }
}
