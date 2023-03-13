// Given two strings, a and b, create a bigger string made of the 
// first char of a, the first char of b, the second char of a, the 
// second char of b, and so on. Any leftover chars go at the end of 
// the result. If the inputs are "Hello" and "World", then the output is "HWeolrllod".

package String_Handling;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //taking input of two strings
        System.out.print("Enter 1st string here: ");
        String a = sc.next();
        System.out.print("Enter 2nd string here: ");
        String b = sc.next();
        String big = a.length()>b.length()? a : b;
        String small = a.length()<b.length()? a : b;

        StringBuffer sb = new StringBuffer(); //creating an object of StringBuffer class 
                                              //as we have to use append() function for required output

        for(int i=0; i<small.length(); i++){
            sb.append(a.charAt(i)).append(b.charAt(i)); //appending characters of both strings one by one
        }
        sb.append(big.substring(small.length(), big.length()));//appending the reamaining characters 
                                                               //from the bigger string
        
        System.out.println(sb);
    }
}
