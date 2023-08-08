//Given an array of integers, find the mean of the numbers present in the array
//input1--> 1 2 3 4 5, output1--> 3
//input2--> 1 1 1 1 1, output--> 1

package Prepbytes;

import java.util.*;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt(); 
        int num_arr[] = new int[size];
        int sum = 0;
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            num_arr[i] = sc.nextInt();
            //storing the sum of all array elements in the variable 'sum'
            sum = sum + num_arr[i];
        }
        //mean is nothing but the average of all numbers present in the array
        int mean = sum/size;
        System.out.println(mean);

    }
}
