//Given an array of integers, find the mode of the numbers present in the array
//input1 --> [1 2 2 4 5], output1 --> 2
//input2 --> [1 1 4 4 4], output2 --> 4

package Prepbytes;
import java.util.*;

public class Problem22 
{
    static int findMode(int arr[], int n)
    {
        int maxCount = 0, maxValue = 0, count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) 
            {   //checking each number's frequency present in the array
                if(arr[i] == arr[j]) count++;
            }
            if(count > maxCount)
            {   //number with highest frequency is considered to be the the mode of given array
                maxCount = count;
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) 
    {
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int m = sd.nextInt();
        int mode[] = new int[m];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < m; i++) 
        {
            mode[i] = sd.nextInt();
        }
        System.out.println("Mode: " + findMode(mode, m));
    }
}
