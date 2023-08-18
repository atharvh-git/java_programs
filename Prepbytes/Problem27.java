//Given a string i.e. (person's first and last name) and your task is to update 
//the string with the first and last name swapped
//input1 --> Arushi Goyal, output1 --> Goyal Arushi
//input2 --> Donald Trump, output2 --> Trump Donald

package Prepbytes;
import java.util.*;

public class Problem27 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name(name and surname): ");
        String name = sc.nextLine();
        String mySurname = "",  myName = "";
        for (int i = 0; i < name.length(); i++) 
        {
          //first name starts from index 0 and goes upto the space that is present between first 
          //name and your surname and from that space we take your surname using substring method
            if(name.charAt(i) == ' ') myName = name.substring(0, i);
            if(name.charAt(i) == ' ') mySurname = name.substring(i+1, name.length());
        }
        System.out.println(mySurname +  " " + myName);
        
    }
}
