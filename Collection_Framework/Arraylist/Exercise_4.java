 //Write a Java program to retrieve an element (at a specified index) from a given array list.

package Arraylist;

import java.util.*;

public class Exercise_4 {
    public static void main(String[] args) {
        //ArrayList Declaration
        ArrayList<String> myList= new ArrayList<>(); 
        //adding the color names in the list called 'myList'
        myList.add("Red");
        myList.add("Blue");
        myList.add("Orange");
        myList.add("Golden");
        myList.add("Green");
        //to access an element present at a particular index, we use get() method
        System.out.println(myList.get(2));
    }
}
