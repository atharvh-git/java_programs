//Create a function that takes a list of numbers between 1 and 10 (excluding one number)
//and returns the missing number.
//input1 --> [1 2 3 4 6 7 8 9 10], output --> 5
//input2 --> [7 2 3 6 5 9 1 4 8], output --> 10

package Prepbytes;
import java.util.*;
 
class Problem34 
{
    public static int getMissingNumber(int[] arr)
    {
        // get the array's length
        int n = arr.length;
        // the actual size is 'n+1' since a number is missing from the array
        int m = n + 1;
        // get a sum of integers between 1 and 'n+1'
        int total = m * (m + 1) / 2;
        // get an actual sum of integers in the array
        int sum = Arrays.stream(arr).sum();
        // the missing number is the difference between 
        // the expected sum and the actual sum
        return total - sum;
    }
 
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < s; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(getMissingNumber(arr));
    }
}
