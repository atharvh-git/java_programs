//Given a number N, perform multiplication of all the digits of the number
//input1 -->  456, output1--> 120
//input2 --> 123, output--> 6

package Prepbytes;
import java.util.*;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here- ");
        int N = sc.nextInt();
        int rem;
        int mul = 1;
        while(N > 0){
            rem = N % 10; // breaking the number in single digits
            mul *= rem;   // multiplying them with each other and storing the result in mul
            N /= 10;      // reducing the length of given number
        }
        //printing the final result
        System.out.println(mul);
    }
}
