//Given an array with an integer k, you have to find how many elements are present in an array that is 
//completely divisible by k.
//input1 --> {12, 35, 36, 9}, 3 output1 --> 3
//input2 --> {6, 2, 8, 4, 5}, 4 output2 --> 2

package Prepbytes;

import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sb.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sb.nextInt();
        }
        int count = 0; //counter variable that counts the number of array elements that are divisible by k
        System.out.println("Enter the integer k: ");
        //inputting the integer k 
        int k = sb.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % k == 0) count++; 
        }
        System.out.println(count);
    }
}
