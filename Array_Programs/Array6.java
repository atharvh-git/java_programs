/* Java program to find largest and smallest elements of an array */

package Array_Programs;

import java.util.Scanner;

public class Array6 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the nuber of elements: ");
       int n = sc.nextInt();
       int arr[] = new int[n];
       System.out.print("Enter the array elements: ");
       for(int i=0; i<n; i++)
       {
           arr[i] = sc.nextInt();
       }
       
        int large = arr[0];
        int small = arr[0];

        for(int i=0; i<arr.length; i++)
        {
           if(arr[i]>large){
            large = arr[i];
           }
           if(arr[i]<small){
            small = arr[i];
           }
        }
        System.out.println("Largest number is " + large);
        System.out.println("Smallest number is " + small);

    }
}
