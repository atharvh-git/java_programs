// Java program to add two Binary Strings

package Basic_Programs;

import java.util.Scanner;

public class BinaryStrings
{
    
    static String addBinaryNum(String m, String n)
    {
        //converting binary string into integer using parseInt method
        int num1 = Integer.parseInt(m,2);
        int num2 = Integer.parseInt(n,2);
        
        int sum = num1 + num2; //Adding those two decimal numbers or integers and storing in sum
       
        String result = Integer.toBinaryString(sum); //Converting that resultant decimal into binary string
        
        return result;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in); //taking two binary strings as inputs from the coder/user
        System.out.println("Enter the first binary string here:");
        String m = input.next();
        System.out.println("Enter the second binary string here:");
        String n = input.next();
        System.out.println("Addition is: " + addBinaryNum(m, n));
        input.close();
    }
}

