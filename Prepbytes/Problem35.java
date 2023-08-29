//Given a two digit number, return true if the number contains
//one even and one odd digit.
//input1 --> 12, output --> true
//input2 --> 55, output --> false
package Prepbytes;
import java.util.*;

public class Problem35 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two digit number: ");
        int num = sc.nextInt();
        boolean count = false;
        //taking the number present at the unit's place
        int rem1 = num % 10;
        //taking the number present at the ten's place
        num /= 10;
        //checking whether the condtion is getting followed or not
        if((rem1 % 2 == 0 && num % 2 != 0) || (rem1 % 2 != 0 && num % 2 == 0))
        {
            count = true;
        }
        else
        {
            count = false;
        }

        if(count == true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
