/* Write a java program to check whether the given string is a palindrome or not */

package String_Handling;
import java.util.Scanner;

public class String7{
static boolean isPalindrome(String str)
{
   int i = 0;
   int j = str.length()-1;

   while (i < j)
    {
       if (str.charAt(i) == str.charAt(j))//checking whether the characters at these indexes are same or not 
        return true;
        i++;
        j--;
    }
        return false;
}
     public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter a string: ");
           String str = sc.nextLine();
           if (isPalindrome(str))
              System.out.print("Palindrome");
           else
              System.out.print("Not a palindrome");
    }
}

































    //     System.out.println("Enter the length of binary string: ");
    //     int n = sc.nextInt();
    //     System.out.println("Enter the number of operations to be performed: ");
    //     int k = sc.nextInt();
    //     System.out.println("Enter the binary string: ");
    //     String str = sc.next();
        
    //     StringBuffer sb = new StringBuffer(str);
    //     if(str.charAt(0)=='0'){
    //         k--;
    //         sb.setCharAt(0, '1');
    //     }
    //     while(k-- > 0){
    //         sb.append('0');
    //     }
    //     System.out.println("RESULT: "+ sb.toString());
    // }
	// public static void main (String[] args) 
	// {
	// 	Scanner sc = new Scanner(System.in);
	// 	   function(sc);
	
