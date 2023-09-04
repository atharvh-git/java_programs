//time complexity of Linear Search is O(n)
import java.util.*;

public class LinearSearch 
{
    static void LinSear(int arr[], int n, int num)
    {
        int found = 0;
        System.out.println("Result: ");
        for(int i=0; i<n; i++)
        {
            if(arr[i] == num)
            {
                found++;
                System.out.println(num + " found at index " + i);
                // break;
                // if you want to count all the occurences of the searched number
                // then do not use the break keyword 
            }
        }
        System.out.println(num + " found " + found + " times in the array.");
        if(found == 0)
        {
            System.out.println(num + " not found!");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        //Array Declaration
        int arr[] = new int[n]; 
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched: ");
        int num = sc.nextInt();
        //calling the function to search the required number in the above array
        LinSear(arr, n, num);
        
        
    }
}
