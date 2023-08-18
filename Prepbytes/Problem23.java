//Given a list, return 'true' if there are more odd numbers than 
//even numbers, otherwise return 'false'
//input1 --> [1,2,3,4,5,6,7,8,9], output1 --> true


package Prepbytes;
import java.util.*;

public class Problem23 {
    public static void main(String[] args)
    {
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter the size of list: ");
        int num = sd.nextInt();
        int ele;
        boolean flag = false;
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter list elements: ");
        for (int i = 0; i < num; i++) 
        {
            ele = sd.nextInt();
            list.add(ele);
        }
        int even = 0, odd = 0;
        for (int i = 0; i < list.size(); i++) 
        {
            if(list.get(i) % 2 == 0) even++;
            else odd++;
        }
        if(odd > even)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        System.out.println(flag);
    }
}
