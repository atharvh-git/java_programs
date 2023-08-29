//Given an array, rotate the array by one position in clock-wise direction.
//Input1: N = 5, A[] = {1, 2, 3, 4, 5}, Output1: {5, 1, 2, 3, 4}
//Input2: N = 8, A[] = {9, 8, 7, 6, 4, 2, 1, 3}, Output2: {3, 9, 8, 7, 6, 4, 2, 1}

package Prepbytes;
import java.util.*;

public class Problem37 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) 
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 1; i++) 
        {
            int j, last;
            last = arr[N - 1];
            for (j = N - 1; j > 0; j--) 
            {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        System.out.println("The clockwise rotated array is ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }

    }
}
