// Java Program to print a right angled triangle of '*' as shown below
// *
// **
// ***
// ****
// *****

package Patterns;

public class Right_Angled_Triangle {
    public static void main(String[] args)
    {
        int i, j;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print("*");
            }
                System.out.println();
        }
    }
    
}
