/* It's the soccer match finals in Chefland and as always it has reached the penalty shotouts. 
Each team is given  5 shots to make and the team scoring a goal on the maximum number of shots 
wins the game. If both the teams' scores are equal, then the game is considered a draw and we 
would have 2 champions. Given ten integers, where the odd indexed integers represent the outcome 
of the shots made by team 1 and even indexed integers represent the outcome of the shots made by team 2,
Determine the winner or find if the game ends in a draw. (where 0 indicates a miss and 1 indicates a goal) */

package CodeChef_Problems;
import java.util.*;
class Codechef2
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner show = new Scanner(System.in);
		System.out.print("Enter the goals and miss here: ");
		int []shot = new int [10];
        int sum1=0, sum2=0;
           
           for (int j=0; j<shot.length;j++){
                shot[j]=show.nextInt();
           }
           for (int j=0;j<(shot.length/2);j++){
               sum1 = shot[2*j]+sum1;
           }
           for (int j=0;j<(shot.length/2);j++){
               sum2 = shot[(2*j)+1]+sum2;
           }
             if(sum1>sum2)
           {
                System.out.println("Team 1 wins");
           } else if (sum1<sum2) 
           {
                System.out.println("Team 2 wins");
           }
            else 
            {
                System.out.println("It's a draw!!");
            }
		    
		}
	}

