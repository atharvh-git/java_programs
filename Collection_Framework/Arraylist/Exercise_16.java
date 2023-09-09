//Write a Java program to clone an array list to another array list.

package Arraylist;
import java.util.*;

public class Exercise_16 {
    public static void main(String[] args) {
        ArrayList<String> myList= new ArrayList<>(); 
        //adding the color names in the list called 'myList'
        myList.add("Red");
        myList.add("Blue");
        myList.add("Orange");
        myList.add("Golden");
        myList.add("Green");
        //to clone original arraylist in a new list, we use clone() method of arraylist class
        ArrayList<String> newlist = new ArrayList<>();
        newlist = (ArrayList) myList.clone();
        System.out.println("Cloned array list: " + newlist); 
    }
}
