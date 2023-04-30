import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first String:");
        String a = scan.next();
        System.out.println("Enter second String:");
        String b = scan.next();
        
        
        String A = a.toLowerCase();
        String B = b.toLowerCase();
        
        if(A.length() == B.length())
        {

            //convert strings to charArray

            char [] char1 = A.toCharArray();
            char [] char2 = B.toCharArray();

            //sort the char array
            Arrays.sort(char1);
            Arrays.sort(char2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(char1, char2);
           

            if(result)
            {

                System.out.println(A + " and " + B + " are anagrams.");
            }
            else {
                System.out.println(A + " and " + B + " are not anagrams.");
            }
            }
            else {
                System.out.println(A + " and " + B + " are not anagrams.");
            }
            
    }
}