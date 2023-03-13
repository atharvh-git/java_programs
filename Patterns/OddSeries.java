
/*Java program to print the following pattern
   1
   222
   33333
   4444444 
*/
  
package Patterns;

public class OddSeries {
    public static void main(String[] args) {
        int i, j;
        for(i=1; i<=4; i++){
            for(j=1; j<=2*i-1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
