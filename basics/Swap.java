/* Java program to swap two numbers */
package Basic_Programs;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //before swap
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        int temp;
        //swapping 
        temp = a;
        a = b;
        b = temp;
        //after swap
        System.out.println("After swap...");
        System.out.println("a = " + a);
        System.out.println("b = " + b); 
    }
}
