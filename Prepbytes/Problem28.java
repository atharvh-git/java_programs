//Given a string and a specified character, your task it to replace all the vowels in 
//string with a specified character.
//input1 --> the aardvark, output1 --> th* **rdv*rk
//input2 --> atharv, output2 --> *th*rv 

package Prepbytes;
import java.util.*;

public class Problem28 {

    static String validate(String str, char ch)
    {
        return str.replaceAll("[aeiouAEIOU]", "" + ch); 
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string here: ");
        String str = sc.nextLine();
        System.out.println("Original string is: " + str);
        System.out.println("After repalcing vowels, string is: " + validate(str, '*'));
    }
}
