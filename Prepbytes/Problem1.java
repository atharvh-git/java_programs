//Given a number x, you have to calculate the biggest digit present in the string
//input--> 2345, output--> 5
//input--> 222, output--> 2
package Prepbytes;
import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int copy = num;
        int rem;
        //PriorityQueue will store the elements present in the input integer
        //and it will show which is the biggest integer present in it 
        Queue<Integer> myQueue = new PriorityQueue<>(Comparator.reverseOrder());
        while(copy > 0){
           rem = copy % 10;
           myQueue.offer(rem);
           copy /= 10;
        }     
        System.out.println("Biggest integer present in " + num + " is "+ myQueue.poll());
    }
}
