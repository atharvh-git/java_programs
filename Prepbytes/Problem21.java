//Given an array of integers, print the smallest number present in the array
//input1 --> [6, 2, 8, 32], output1 --> 2
//input1 --> [4, 1, 6, 12, 56], output1 --> 1
package Prepbytes;
import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sd.nextInt();
        //Array declaration
        int myArr[] = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            myArr[i] = sd.nextInt();
        }
        //currently, assuming the first element of array to be smallest
        int min = myArr[0];
        for (int i = 0; i < myArr.length; i++) {
            //if any other element which is smaller than the min(myArr[0]) is present 
            //then ot will be assigned to the variable min
            if(myArr[i] < min) min = myArr[i];
        }
        System.out.println(min);
    }
}
