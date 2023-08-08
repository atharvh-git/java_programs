//Given an array, you have to find the greatest even number present in it.
//Input1--> {12, 10, 100, 32},  Output1--> 100
//Input2--> {1, 3, 5, 7, 8, 9},  Output2--> 8

package Prepbytes;
import java.util.*;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scc.nextInt();
        }
        //sorting the array in order to traverse easily through it
        Arrays.sort(arr);
        int max = arr[0];
        for(int i=0; i<n; i++)
        {
            //checking whether the number is even and largest as well or not
            if(arr[i] > max && arr[i] % 2 == 0) max = arr[i];
        }
        System.out.println(max);
        
    }
}
