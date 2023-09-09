//Write a Java program to reverse elements in an array list.

package Arraylist;

import java.util.*;

public class Exercise_11 {
    public static void main(String[] args) {
        ArrayList<String> myList= new ArrayList<>(); 
        //adding the color names in the list called 'myList'
        myList.add("Red");
        myList.add("Blue");
        myList.add("Orange");
        myList.add("Golden");
        myList.add("Green");
        //to reverse the arraylist, we use reverse() method of Collections class
        Collections.reverse(myList);
        //reversed arraylist is
        System.out.println(myList);
    }
}
