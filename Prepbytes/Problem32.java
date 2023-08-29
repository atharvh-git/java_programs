//Given two strings, find the number of characters that differ between two strings.
//input1 --> abcbba abcbda, output1 --> 1
//input2 --> abcde bcdef, output2 --> 2

package Prepbytes;
import java.util.*;

public class Problem32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.next();
        System.out.println("Enter second string: ");
        String s2 = sc.next();
        int count = 0;
        if(s1.length() == s2.length())
        {
            for (int i = 0; i < s1.length(); i++) 
            {
                boolean flag = false;
                for (int j = 0; j < s2.length(); j++) 
                {
                  if(s1.charAt(i)==s2.charAt(j)) flag = true;
                }
                if(flag == false) count++;
            }
            for (int index = 0; index < s2.length(); index++) 
            {
                boolean flag = false;
                for (int j = 0; j < s1.length(); j++) 
                {
                    if(s2.charAt(index) == s1.charAt(j)) flag = true;
                }
                if(flag == false) count++;
            }
            System.out.println("Number of different characters in strings is : " + count);
        }
        else
        {
            System.out.println("Strings have different lengths! Can't determine!");
        }
        
    }
        
}

