//Write a Java program that swaps two elements in an array list.
package Arraylist;
import java.util.*;

public class Exercise_14 {
    public static void main(String[] args) {
        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        c2.add("Orange");
        //to swap 2 elements in an arraylist, we use swap() method of Collections class
        Collections.swap(c2, 1, 4);
        //arraylist after swapping is
        System.out.println(c2);
    }
}
