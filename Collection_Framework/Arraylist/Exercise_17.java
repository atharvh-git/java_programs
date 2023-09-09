//Write a Java program to empty an array list.

package Arraylist;

import java.util.ArrayList;

public class Exercise_17 {
    public static void main(String[] args) {
        ArrayList<String> myList= new ArrayList<>(); 
        //adding the color names in the list called 'myList'
        myList.add("Red");
        myList.add("Blue");
        myList.add("Orange");
        myList.add("Golden");
        myList.add("Green");
        //to make an arraylist empty, we use removeAll() method of arraylist class
        myList.removeAll(myList);
        //arraylist is emptied
        System.out.println("Empty arraylist: " + myList);
    }
}
