/* Java program to check even or odd integers */
package Basic_Programs;

import java.util.*;

public class Even_Odd {
    public static void main(String[] args) {
        //taking input from user
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = num.nextInt();
        if(a % 2 == 0){
            System.out.println(a + " is an even number.");
        }else{
            System.out.println(a + " is an odd number.");
        }
    }
}
