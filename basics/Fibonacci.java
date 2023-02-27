/*Java program to  find 
fibonacci series upto n */

package Basic_Programs;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, k=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here : ");
        int num = sc.nextInt();
        System.out.println("Your fibonacci series is as follows...");
        System.out.print("0 1 ");
        while(k < num){
            k = a + b;
            System.out.print(k + " ");
            a = b;
            b = k;
        }
        
    }
}
