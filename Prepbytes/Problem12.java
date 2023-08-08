//Given two arrays, you have to find the sum of the largest elements in both the arrays
//input1 - arr1--> {2 4 5 7 8 9}, arr2--> {10 11 13 15 16}, output1- 25
//input2 - arr1--> {1 3 5 7 8}, arr2--> {9 10 11 22 25}, output2- 33

package Prepbytes;
import java.util.*;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking arr1 from user
        System.out.println("Enter size of array-1");
        int s1 = sc.nextInt();
        int arr1[] = new int[s1];
        System.out.println("Enter array-1 elements: ");
        for (int i = 0; i < s1; i++) 
        {
            arr1[i] = sc.nextInt();
        }
        //taking arr2 from user
        System.out.println("Enter size of array-2");
        int s2 = sc.nextInt();
        int arr2[] = new int[s2];
        System.out.println("Enter array-2 elements: ");
        for (int i = 0; i < s2; i++) 
        {
            arr2[i] = sc.nextInt();
        }
        //finding largest element in arr1
        int max1 = arr1[0];
        for (int i = 0; i < arr1.length; i++) 
        {
            if(arr1[i] > max1) max1 = arr1[i];
        }
        //finding largest element in arr2
        int max2 = arr2[0];
        for (int i = 0; i < arr2.length; i++) 
        {
            if(arr2[i] > max2) max2 = arr2[i];
        }
        //adding the largest numbers from both the arrays
        System.out.println(max1 + max2);
    }
}
