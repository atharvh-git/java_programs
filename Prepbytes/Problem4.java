//Given a binary number, you have to remove all the zero present in the number
//input--> 10101, output-->111
//input--> 1001, output-->11

package Prepbytes;
import java.util.*;

public class Problem4 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //taking a binary string as an input
        System.out.println("Enter binary string: ");
        String str = sc.next();
        //we can use default method replace() to remove all the zeroes
        // String s2 = str.replace("0", "");
        String newStr = "";
        //Or we can use following method for the same purpose
        for (int i=0; i<str.length(); i++) 
        {
            if(str.charAt(i)=='1'){
                newStr = newStr + str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
