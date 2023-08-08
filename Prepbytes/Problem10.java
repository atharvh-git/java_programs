//Given an integer N, you have to find all the factors of N less than N
//input1 --> 6, output1 --> 1 2 3
//input2 --> 8, output2 --> 1 2 4

package Prepbytes;
import java.util.*;

public class Problem10 {
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number here: ");
      int num = sc.nextInt();  //taking the number from user as an input
      System.out.print("Factors of the number are ");
      for(int i=1; i<num; i++)
      {
        if(num % i == 0)   //this condition checks whether the value present in i divides num or not
        {                  
          System.out.print(i + " ");
        }
      }
    }
}
