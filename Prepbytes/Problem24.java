//Given a string, print the string with its letters in alphabetical order
//input1 - hello, output1 - ehllo
//input2 - hacker, output2 - acehkr 

package Prepbytes;
import java.util.*;

public class Problem24 {
    public static void main(String[] args) {
        Scanner alpha = new Scanner(System.in);
        System.out.println("Enter the string here: ");
        String str = alpha.next().toLowerCase();
        //converting the string str in a character array
        char myArr[] = str.toCharArray();
        //sorting the array using Arrays.sort()
        Arrays.sort(myArr);
        //converting the array to a string
        System.out.println(myArr);
    }
}
