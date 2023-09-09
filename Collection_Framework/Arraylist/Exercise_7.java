//Write a Java program to search for an element in an array list.

package Arraylist;

import java.util.*;

public class Exercise_7 {
    public static void main(String[] args) {
        //ArrayList Declaration
        ArrayList<String> myList= new ArrayList<>(); 
        //adding the color names in the list called 'myList'
        myList.add("Red");
        myList.add("Blue");
        myList.add("Orange");
        myList.add("Golden");
        myList.add("Green");
        //to search any element in the list, we use contains() method
        System.out.println(myList.contains("Red")); 
        //NOTE - contains() method gives boolean result (either true or false)

    }
}
