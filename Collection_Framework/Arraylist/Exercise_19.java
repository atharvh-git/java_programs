//Write a Java program for trimming the capacity of an array list.

package Arraylist;

import java.util.ArrayList;

public class Exercise_19 {
    public static void main(String[] args) {
         ArrayList<String> myList= new ArrayList<>(); 
        //adding the color names in the list called 'myList'
        myList.add("Red");
        myList.add("Blue");
        myList.add("Orange");
        myList.add("Golden");
        myList.add("Green");
        //to trim the arraylist to its original size, we use trimToSize() method
        myList.trimToSize();
        System.out.println(myList); 
    }
}
