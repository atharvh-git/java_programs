//Write a Java program to sort a given array list.

package Arraylist;

import java.util.*;

public class Exercise_8 {
    public static void main(String[] args) {
         //ArrayList Declaration
        ArrayList<String> myList= new ArrayList<>(); 
        //adding the color names in the list called 'myList'
        myList.add("Red");
        myList.add("Blue");
        myList.add("Orange");
        myList.add("Golden");
        myList.add("Green");
        myList.sort(Comparator.naturalOrder());
        //OR
        Collections.sort(myList);
        //printing the sorted arraylist
        System.out.println(myList);
    }
}
