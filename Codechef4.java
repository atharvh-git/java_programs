/*In a season, each player has three statistics: runs, wickets, and catches. Given the season 
  stats of two players A and B, denoted by R, W and C respectively, the person who is better 
  than the other in the most statistics is regarded as the better overall player. Tell who is 
  better amongst A and B. It is known that in each statistic, the players have different values. */

package CodeChef_Problems;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef4
{
	public static void main (String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		//taking two arrays, each of length 3
		    int a[] = new int[3];
		    int b[] = new int[3];
            System.out.println("Enter the statistics of first player: ");
		    for(int i=0; i<3; i++){
		        a[i] = sc.nextInt();
		    }
            System.out.println("Enter the statistics of second player: ");
		    for(int i=0; i<3; i++){
		        b[i] = sc.nextInt();
		    }
		    int c1 = 0;
		    int c2 = 0;
		    for(int i=0; i<3; i++){
		        if(a[i] > b[i]){
		          c1++;
		        }else{
		          c2++;
		        }
		    }
            System.out.println("Result: ");
		    if(c1>c2){
		        System.out.println("Better player is A");
            }else{
                System.out.println("Better player is B");
            }
		}
	}
