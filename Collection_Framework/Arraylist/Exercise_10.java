//Write a Java program to shuffle elements in an array list.

package Arraylist;

import java.util.*;

public class Exercise_10 {
    public static void main(String[] args) {
        ArrayList<String> myList= new ArrayList<>(); 
        //adding the color names in the list called 'myList'
        myList.add("Red");
        myList.add("Blue");
        myList.add("Orange");
        myList.add("Golden");
        myList.add("Green");
        //to shuffle elements in the arraylist, we use shuffle() method of Collections class
        Collections.shuffle(myList);
        //shuffled arraylist is
        System.out.println(myList);
    }
}
