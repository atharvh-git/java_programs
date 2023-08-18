//Given a list and a number, add that number to the end of the list, then remove the first 
//element of the list, and print the updated list
//input1 --> [5,6,7,8,9] 1, output1 --> [6,7,8,9,1]

package Prepbytes;
import java.util.*;

public class Problem25 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter size of list: ");
        int size = sb.nextInt();
        int ele;
        List<Integer> myList = new ArrayList<>();
        System.out.println("Enter the list elements: ");
        for (int i = 0; i < size; i++) {
            ele = sb.nextInt();
            myList.add(ele);
        }
        System.out.print("Original arraylist --> " + myList +"\n");
        //inputting the number you want to add at the last
        System.out.println("Enter the number you want to add in the list: ");
        int num = sb.nextInt();
        //adding the number
        myList.add(num);
        //removing the number present at the starting index of the list
        myList.remove(0);
        //printing the updated arraylist
        System.out.print("Updated arraylist --> " + myList);
        
    }
}
