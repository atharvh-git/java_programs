//Given a string str, find out the count for the letter 'c' present in it.
//input1 --> ankit, output1 --> 0
//input2 --> camel, output2 --> 1

package Prepbytes;
import java.util.*;

public class Problem8 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the string here: ");
        String str = myScan.nextLine();
        //consider a counter variable which counts the total number of 'c's(small and capital both) 
        //present in string str
        int count = 0; 
        //checking for the letter 'c'(small and capital both) using for loop as follows
        for (int i = 0; i < str.length(); i++) 
        {
            if(str.charAt(i) == 'c' || str.charAt(i) == 'C') count++;
        }
        System.out.println(count);
        
        // myScan.close();
    }
}
