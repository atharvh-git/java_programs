/*The most popular feature on snapchat is Snapchat Streak. A streak is maintained between two people 
  if both of them send at least one snap to each other daily. If, on any day, either person forgets to 
  send at least one snap, the streak breaks and the streak count is set to 0. Chef and Chefina like 
  maintaining their snapchat streak. You observed the snap count of both of them for N consecutive days.
  On the ith day, Chef sent Ai snaps to Chefina and Chefina sent Bi snaps to Chef. 
  Find the maximum streak count they achieved in those N days. */
package CodeChef_Problems;

import java.util.*;
public class Codechef3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int n = sc.nextInt();
		    int a[] = new int[n];
		    int b[] = new int[n];
		    int count = 0; // counts the number of days
            System.out.println("Enter the number of snaps sent by chef to chefina: ");
		    for(int i=0; i<n; i++){
		       a[i] = sc.nextInt();
		    }
            System.out.println("Enter the number of snaps sent by chefina to chef: ");
		    for(int i=0; i<n; i++){
		       b[i] = sc.nextInt();
		    }
		    int mx = 0;
		    for(int i=0; i<n; i++){
		        if(a[i]>0 && b[i]>0){
		            count++;
		            mx = Math.max(mx,count);
		        }
		        else{
		           count = 0;
		        }
		    }
            System.out.println("Streak: ");
		    System.out.println(mx);
		   
    }
}
