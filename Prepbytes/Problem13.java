//In this example, you will have to: 
//Take a list of names. Add "Hello" to every name. Make one big string with all greetings. The solution 
//should be one string with a comma in between every "Hello (name)".
//input1- ["Abhishek", "Mayuri"], output1- Hello Abhishek, Hello Mayuri

package Prepbytes;


import java.util.*;

public class Problem13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
		String ele;
    	List<String> a = new ArrayList<String>();
        System.out.println("Enter the size of list: ");
    	int n = read.nextInt();
        System.out.println("Enter the list elements: "); 
    		for(int j=0; j<n; j++)
            {
    		    ele = read.next();
    		    a.add(ele);
            }
        for(int i=0; i<a.size(); i++){
            System.out.print("Hello " + a.get(i) +", ");
        }
    }
}
