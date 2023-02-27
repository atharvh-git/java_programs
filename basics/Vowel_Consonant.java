/* Java program to check whether given character 
is a vowel or a consonant*/
package Basic_Programs;

import java.util.Scanner;

public class Vowel_Consonant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character here :");
        char ch = sc.next().charAt(0);
        
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
           || ch=='A' || ch=='E' || ch=='O' || ch=='I' || ch=='U'){
             
            System.out.println(ch + " is a vowel.");

        }else if((ch>='A' &&  ch<='Z') || (ch>='a' && ch<='z')){
            
             System.out.println(ch + " is a consonant.");

        }else{
            
            System.out.println(ch + " is an invalid character.");
        }
 
    }

}

