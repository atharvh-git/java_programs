//A group of friends have decided to start a secret society. The name will be the first letter of
//each of their names, sorted in alphabetical order.
//input1 --> [Adam, Sara, Michael], output1 --> AMS

package Prepbytes;

import java.util.*;

public class Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        String new_str = "";
        System.out.println("Enter array elements: ");
        String arr[] = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next();
            //adding the first letter of each string in the following variable new_str
            new_str = new_str + arr[i].charAt(0);
        }
        //converting the string in a character array 
        char myArr[] = new_str.toCharArray();
        //sorting the letters in the alphabetical order
        Arrays.sort(myArr);
        //printing the required format 
        System.out.println(myArr);
    }
}
