//Write a Java program to remove the third element from an array list.

package Arraylist;

import java.util.*;

public class Exercise_6 {
    public static void main(String[] args) {
        //ArrayList Declaration
        ArrayList<String> myList= new ArrayList<>(); 
        //adding the color names in the list called 'myList'
        myList.add("Red");
        myList.add("Blue");
        myList.add("Orange");
        myList.add("Golden");
        myList.add("Green");
        //to remove any element from the list, we use remove method
        myList.remove(2);
        //updated arraylist
        System.out.println(myList);
    }
}
