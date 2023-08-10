//Given the shortest side of a 30° by 60° by 90° triangle, find out the other two sides. Return the longest
//side and medium-length side in that order.
//input1 - 1, output1 - (2, 1.73)
//input2 - 2, output2 - (4, 3.46) 

package Prepbytes;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class Problem18 {
    //using the DecimalFormat for rounding the medium side upto 2 decimal places
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) 
    {
        Scanner tri = new Scanner(System.in);
        System.out.print("Length of shortest side is- ");
        int shortest_side = tri.nextInt();
        //In this triangle, the longest side is twice the shortest_side
        int longest_side = 2 * shortest_side;
        //and the medium-length side is given by shortest_side * sqrt(3)
        double med_side = shortest_side * Math.sqrt(3);
        df.setRoundingMode(RoundingMode.DOWN); //setting RoundingMode.DOWN 
        System.out.println("("+ longest_side + ", " + df.format(med_side) + ")") ;
    }
}
