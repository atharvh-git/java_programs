/*Java Program to find the sum and product of all elements
  of an array */
  

package Array_Programs;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of numbers you want to input: ");
        int n = sc.nextInt();
        int sum = 0, pro=1;
        System.out.println("Enter the array elements: ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();

            sum = sum + arr[i];

            pro = pro * arr[i];
        }
        System.out.println("Result: ");
        System.out.println("Sum is "+ sum);
        System.out.println("Product is " + pro);

        sc.close();
    }
}
