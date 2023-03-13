/*Take 10 integer inputs from user and store 
  them in an array and print them on the output screen */
 
package Array_Programs;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        //To take input of integers from user/coder we used Scanner class here
        Scanner scarr = new Scanner(System.in);
        int array[] = new int[10];
        System.out.print("Enter 10 integers here: ");
        //Used a for loop to take input of 10 integers from the user
        for(int i=0; i<array.length; i++){
            array[i] = scarr.nextInt();
        }
        //Using a for loop to iterate through each element present in the 
        //array and print them on the output screen
        System.out.println("Your array is... ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }
        scarr.close();
    }
}
