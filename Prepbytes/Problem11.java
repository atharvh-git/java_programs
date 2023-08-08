//Given a string s, you have to calculate the number of consonants present in it.
//input1 - prepbytes, output1 - 7
//input2 - Instagram, output2 - 6

package Prepbytes;
import java.util.*;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string here: ");
        String s = sc.next();
        int count = 0; //this count variable counts the number of vowels present in the string
        for(int m=0; m<s.length(); m++)
        {
            if(s.charAt(m)=='A' || s.charAt(m)=='a' || s.charAt(m)=='E' || s.charAt(m)=='e' 
            || s.charAt(m)=='I' || s.charAt(m)=='i' || s.charAt(m)=='O' || s.charAt(m)=='o' 
            || s.charAt(m)=='U' || s.charAt(m)=='u') count++;
        }
    //the count of consonants will be given by subtracting the count of vowels from the string length
        System.out.println("Number of consonants"+ (s.length() - count));
    }
}
