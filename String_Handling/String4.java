/*Given a string, return a version without the first and last char, 
so "Wipro" yields "ipr". The string length will be at least 2. */
package String_Handling;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a string here: ");
            String str = input.next();
            //The first and last character will get removed 
            str = str.substring(1,str.length()-1);
            System.out.println(str);
        }
    }

