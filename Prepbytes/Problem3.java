//Given an array of integers, you have to find if any number in the array is divisible by 5 or not
//input1--> {10, 2, 3, 4, 5}, output--> Yes
//input2--> {2, 3, 4, 6, 7, 8}, output--> No

package Prepbytes;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner arr = new Scanner(System.in);
        boolean flag = false;
        System.out.print("Enter the size of array: ");
        int n = arr.nextInt();
        //Array declaration
        int myArr[] = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            myArr[i] = arr.nextInt();
        }
        for(int i=0; i<n; i++){
            //condition which checks whether the array contains 
            //any number divisible by 5 or not 
           if(myArr[i] % 5 == 0)
              flag = true;
        }
        if(flag == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
