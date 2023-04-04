/* Java program to find the frequency of characters present in the given string */

package Basic_Programs;

import java.util.*;

public class FrequencyOfCharacters
{
public static void main(String args[]){
    
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the string here: ");
     String s1 = sc.nextLine();
     s1 = s1.toLowerCase();
     int c = 0;
     char ch;
     int length = s1.length();
     
     System.out.println("Character\tFrequency");
     // applying a for loop to count frequency of each letter
     for(ch ='a'; ch<='z'; ch++){
        c = 0;
        for(int i=0; i<length; i++)
        {
            if(ch == s1.charAt(i))
            {
                c++;
            }
        }
        if(c != 0)
        {
            System.out.println(ch + "\t\t" + c);
        }
     }
     
   }
}
