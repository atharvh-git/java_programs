package String_Handling;

import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        String S1 = "Mark";
        String S2 = "Kate";
        String S3;
        if(S1.charAt(S1.length()-1) == S2.toLowerCase().charAt(0))
        {
            S3 = S1 + S2.substring(1);
        }
        else
        {
            S3 = S1 + S2;
            
        }
        System.out.println(S3);
    }
}
