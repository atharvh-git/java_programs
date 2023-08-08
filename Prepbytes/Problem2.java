//Two strings are given, you have to find which one is the longest
//Input1--> ankit mazumdar, output--> mazumdar
//Input2--> Ram Shyam, Output--> Shyam

package Prepbytes;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.next();
        System.out.println("Enter second string: ");
        String str2 = sc.next();
        //length of string 1
        int len1 = str1.length();
        //length of string 2
        int len2 = str2.length();
        //comparing their lengths using if-else
        System.out.print("String with highest length is: ");
        if(len1 > len2){
            System.out.println(str1);
        }else if(len1 < len2){
            System.out.println(str2);
        }else{
            System.out.println("Both strings are of equal length!");
        }
    }
}
