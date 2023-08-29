//Given the first term (a), common difference (d) and an integer N of the AP series,
//the task is to find the Nth Term of the series.
//input1 --> 2 1 5, output1 --> 6
//input2 --> 5 2 10, output2 --> 23

package Prepbytes;
import java.util.*;

public class Problem31 
{
    public static void main(String[] args) 
    {
        Scanner ap = new Scanner(System.in);
        System.out.print("Enter the first term(a): ");
        int a = ap.nextInt();
        System.out.print("Enter the common difference(d): ");
        int d = ap.nextInt();
        System.out.print("Enter the number of terms present in the AP: ");
        int N = ap.nextInt();
        //AP Formula
        int tn = a + (N - 1) * d;
        //printing the Nth term of AP
        System.out.println("Nth term is " + tn);

    }
}
