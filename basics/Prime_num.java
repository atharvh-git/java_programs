/*Java program to display all prime 
 numbers till n */

package Basic_Programs;

import java.util.Scanner;

public class Prime_num {
    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);
        System.out.println("Enter number here: ");
        int num = prime.nextInt();
        int count = 0;
        for(int i=2; i<=num/2; i++){
            count = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i + " ");
            }
        }
        }

    }

