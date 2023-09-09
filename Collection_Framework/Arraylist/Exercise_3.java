//Write a Java program to insert an element into the array list at the first position.

package Arraylist;
import java.util.*;

public class Exercise_3 {
    public static void main(String[] args) {
        ArrayList<String> myList= new ArrayList<>(); //ArrayList Declaration
        //adding the color names in the list called 'myList'
        myList.add("Red");
        myList.add("Blue");
        myList.add("Orange");
        myList.add("Golden");
        myList.add("Green");
        //inserting an element at position using add()(overloaded method of add()) method
        myList.add(0, "Pink");
        //updated arraylist
        System.out.println(myList);
        //NOTE: In arraylist too, the indexing starts from 0, just like arrays
    }
}
