//Given a string along with the string which contains a single character x. You have to remove
//the character x from the given string. Write a function to remove all occurences of the x character
//from the given string.
//input1 --> welcome to the game, e , output1 --> wlcom to th gam
//input2 --> hii atharv, a , output2 --> hii thrv

package Prepbytes;
import java.util.*;

public class Problem36 
{
    static String removeChar(String s, char c)
    {
        String myStr = "";
        for (int i = 0; i < s.length(); i++) 
        {
            char ch1 = s.charAt(i);
            if (ch1 == c) continue;
            else myStr = myStr + ch1;
        }
        return myStr;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string here: ");
        //taking string input 
        String str = sc.nextLine().toLowerCase();
        System.out.println("Enter the character to be removed: ");
        //taking the character input from the user which is to be removed
        char ch = sc.next().charAt(0);
        System.out.println(removeChar(str, ch));
        
    }
}
