//Create a function that takes a string as an argument and returns a coded version of the string.
//Note: In order to work properly, the function should replace all 'a's with 4, 'e's with 3, 'i's
//with 1, 'o's with 0 and 's's with 5.
//input1 --> java is cool, output1 --> j4v4 15 c00l
//input2 --> program is running, output2 --> pr0gr4m 15 runn1ng

package Prepbytes;
import java.util.*;

public class Problem33 {

    static String codedString(String s){
        for (int i = 0; i < s.length(); i++) 
        {
            switch(s.charAt(i)) 
            {
                case 'a':
                    s = s.replaceAll("a", "4");
                    break;
                case 'e':
                    s = s.replaceAll("e", "3"); 
                    break;
                case 'i':
                    s = s.replaceAll("i", "1");
                    break;
                case 'o':
                    s = s.replaceAll("o", "0");
                    break;            
                case 's':
                    s = s.replaceAll("s", "5");
            }
        }
        return s;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: "); //taking a string input
        String str = sc.nextLine();
        System.out.println(codedString(str));
    }
}
