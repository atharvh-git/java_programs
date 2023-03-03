/*Given 2 strings, a and b, return a string of the form short+long+short, with the 
shorter string on the outside and the longer string on the inside. The strings will 
not be the same length, but they may be empty (length 0). If input is "hi" 
and "hello", then output will be "hihellohi". */
package String_Handling;

import java.util.Scanner;

public class String5 {
    public static void main(String[] args) 
    {
        Scanner sdf = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = sdf.next();
        System.out.println("Enter the second string: ");
        String s2 = sdf.next();
        String c = s1 + s2 + s1;
        System.out.println("The new string is " + c);


    }
}
