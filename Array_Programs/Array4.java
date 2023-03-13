/* Java program to take 6 integer inputs from user and store them in an array.
   Now, copy all the elements in an another array but in reverse order */
 

package Array_Programs;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner arr1 = new Scanner(System.in);
        int x[] = new int[6];
        int y[] = new int[6];
        System.out.print("Enter 6 elements in the array named 'x': ");
        for(int i=0; i<x.length; i++){
            x[i] = arr1.nextInt();
        }
        int j = 0;
        for(int i=y.length-1; i>=0; i--){
            y[i] = x[j];
            j = j + 1;
        }
        System.out.println("Result: ");
        for(int i=0; i<y.length; i++){
           System.out.println(y[i]);
        }
        arr1.close();
    }
}
