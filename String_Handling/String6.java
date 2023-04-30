/*Write a program that takes your full name as input and displays the abbreviations of 
  the first and middle names except the last name which is displayed as it is. For example, 
  if your name is Robert Brett Roser, then the output should be R. B. Roser. */

package String_Handling;

import java.util.*;


public class String6 
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        // taking full name as an input from the coder/user
        System.out.println("Enter your full name here: ");
        String name = s1.nextLine();
        String str = ""; //an empty string to store required answer
        str = (str + name.charAt(0)).toUpperCase(); //Abbreviating first name using its first character
        str = str + ". ";
        for (int i = 0; i<name.length(); i++)
        {
          if(name.charAt(i) == ' ' && name.charAt(i+1) != ' ' && i+1 < name.length())
          {
            str = (str + name.charAt(i+1)).toUpperCase();
            str = str + ". "; //Abbreviating second name using its first character
          }
        }
        // to get surname...
        String surname = "";
        for(int i=name.length()-1; i>=0; i--)
        {
          if(name.charAt(i) == ' ')
          {
            surname = name.substring(i+2);
            break;
          }
        }
        str = str.substring(0, str.length()-2);
        str = str + surname;
        System.out.println(str);
    }
}