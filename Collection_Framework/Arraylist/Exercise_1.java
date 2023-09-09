//Write a Java program to create an array list, add some 
//colors (strings) and print out the collection.

package Arraylist;
import java.util.*;
public class Exercise_1 {
    public static void main(String[] args) {
        ArrayList<String> myList= new ArrayList<>(); //ArrayList Declaration
        //adding the color names in the list called 'myList'
        myList.add("Red");
        myList.add("Blue");
        myList.add("Orange");
        myList.add("Golden");
        myList.add("Green");
        //printing the arraylist
        System.out.println(myList);
    }
}
