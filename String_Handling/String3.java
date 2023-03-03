/*Given 2 strings, a and b, return a string of the form short+long+short, 
with the shorter string on the outside and the longer string on the inside. 
The strings will not be the same length, but they may be empty (length 0). 
If input is "hi" and "hello", then output will be "hihellohi". */
package String_Handling;

import java.util.*;

public class String3 {
    public static void main(String[] args) {
        Scanner sdf = new Scanner(System.in);
        System.out.print("Enter the string here:");
        String s = sdf.next();
        if(s.charAt(0) == 'x' && s.charAt(s.length()-1) == 'x')
        {
            String s2 = s.substring(1, s.length()-1);
            System.out.println(s2);
        }
        else
        {
            System.out.println(s);
        }
    }
}
