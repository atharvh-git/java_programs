//Write a Java program to increase an array list size.
package Arraylist;
import java.util.*;

public class Exercise_20 {
    public static void main(String[] args) {
        ArrayList<String> myList= new ArrayList<>(); 
        //adding the color names in the list called 'myList'
        myList.add("Red");
        myList.add("Blue");
        myList.add("Orange");
        myList.add("Golden");
        myList.add("Green");
        //to increase the size of arraylist, we use ensureCapacity() method arraylist class
        myList.ensureCapacity(8);
        System.out.println(myList);
    }
}
