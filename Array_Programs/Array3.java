/* Write a java program totake 20 integer inputs from 
   user/coder and print the following:
   i) number of +ve numbers 
   ii) number of -ve numbers 
   iii) number of 0s numbers 
   iv) number of even numbers 
   v) number of odd numbers 
*/


package Array_Programs;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr2[] = new int[20];
        int pos = 0;
        int neg = 0;
        int odd = 0;
        int even = 0;
        int zeroes = 0;
        System.out.print("Enter the 20 integers here: ");
        for(int i=0; i<arr2.length; i++){
            arr2[i] = input.nextInt();
            //checking whether the element is positive, 
            //negative or equal to zero
            if(arr2[i]>0){
                pos++;
            }
            else if(arr2[i]<0){
                neg++;
            }else{
                zeroes++;
            }
            //checking whether the element of array is even or odd
            if(arr2[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("The count of positive numbers is " + pos);
        System.out.println("The count of negative numbers is " + neg);
        System.out.println("The count of zeroes numbers is " + zeroes);
        System.out.println("The count of even numbers is " + even);
        System.out.println("The count of odd numbers is " + odd);

        input.close();
    }
}
