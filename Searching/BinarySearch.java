import java.util.*;
public class BinarySearch 
{
    static void BinSearch(int arr[], int n, int num) 
    {
        int found = 0;
        int beg = 0, end = n - 1;
        while (beg <= end) 
        {
            int mid = (beg + end) / 2;
            if (num == arr[mid]) 
            {
                System.out.println("Result:\n" + num + " found at index " + mid);
                found++;
                break;
            } 
            else if (num > arr[mid]) 
            {
                beg = mid + 1;
            } 
            else if (num < arr[mid]) 
            {
                end = mid - 1;
            }
        }
        if (found == 0) 
        {
            System.out.println("Result:\n" + num + " not found!");
        }
    }
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        // sorting the input array because it helps a lot 
        // in finding the element to be searched
        Arrays.sort(arr);
        System.out.println("Sorted array is: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the number to be searched: ");
        int num = sc.nextInt();
        BinSearch(arr, n, num);
    }
}
//time complexity of binary search is O(log n)
