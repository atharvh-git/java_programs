//Given a list of +ve and -ve numbers. Print a list where the first element as the count of
//+ve numbers and the 2nd element as the sum of -ve numbers.
//input1 --> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], output1 --> [10, -65]
//input2 --> [91, -4, 80, -73, -28], output2 --> [2, -105]

package Prepbytes;
import java.util.*;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int element;
        int count = 0; // counter variable which counts the number of +ve numbers present in the list
        int sum = 0; //variable which stores the sum of -ve numbers present in the list
    	List<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter the size of list: ");
    	int n = sc.nextInt();
        System.out.println("Enter the list elements: "); 
    		for(int j=0; j<n; j++)
            {
    		    element = sc.nextInt();
    		    list.add(element);
            }
        for(int j=0; j<n; j++)
        {
            if(list.get(j) > 0){
                count++;
            }
            if(list.get(j) < 0){
                sum = sum + list.get(j);
            }
        }
        //creating a new list for storing the above results
        List<Integer> new_list = new ArrayList<Integer>();
            new_list.add(count);
            new_list.add(sum);
        System.out.println(new_list);
    }
}
