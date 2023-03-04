/*Java program to take input month number from user
  and print the number of days in that month */ 
 
package Conditional_Statements;

import java.util.Scanner;

public class Monthanddays {
    public static void main(String[] args) {
        Scanner mon_day = new Scanner(System.in);
        System.out.print("Enter the month number here: ");//taking month number as an input from user
        int mon = mon_day.nextInt();
        if(mon==1 || mon==3 || mon==5 || mon==7 || mon==8 || mon==10 || mon==12)
        {
          System.out.println("Number of days is 31.");
        }
        else if(mon==2)
        {
          System.out.println("Number of days is 28.");
        }
        else
        {
            System.out.println("Number of days is 30.");
        }
    }
}
