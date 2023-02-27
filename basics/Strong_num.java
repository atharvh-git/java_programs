package Basic_Programs;

import java.util.Scanner;

public class Strong_num {
    public static void main(String[] args) {
        Scanner strong = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = strong.nextInt();
        int fact = 1, sum = 0;
        int c = num;
        if(num == 0){
            sum = sum + fact;
        }else{
            while(c > 0)
            {
                fact = 1;
                int rem = c % 10;
                for(int i=1; i<=rem; i++)
                    fact = fact * i;
                    sum = sum + fact;
                    c = c / 10;
            
            }
        }
        
            if(sum == num){
                System.out.println(num + " is a strong number.");
            }else{
                System.out.println(num + " is not a strong number");
            }
        
    }
}
