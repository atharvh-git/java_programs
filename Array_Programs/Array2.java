/* Take 5 inetger inputs from userand store them in an array
   Again ask user/coder to give a number. Now, tell user whether 
   that number is present in array or not */
 

package Array_Programs;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        //To take input of integers from user/coder we used Scanner class here
        Scanner scw = new Scanner(System.in);
        int arr1[] = new int[5];
        int check = 0;
        System.out.println("Enter the 5 integers here: ");
        for(int i=0; i<arr1.length; i++){
            arr1[i] = scw.nextInt();
        }
        //taking the number as an input user/coder wants 
        //to check whether it's present or not 
        System.out.println("Enter the number you want to check: ");
        int n = scw.nextInt();
        for(int i=0; i<arr1.length; i++){
            if(n == arr1[i]){
              check = 1;
              break; //If the value of n matches with any one element of array,
                     //then it will terminate the loop at the same instant
            }
        }
        System.out.println("Result: ");
        if(check == 1){
            System.out.println(n +" is present in the array.");
        }else{
            System.out.println(n +" is absent in the array.");
        }
        scw.close();
    }
}
