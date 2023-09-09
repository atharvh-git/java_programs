//Write a Java program to iterate through all elements in an array list.

package Arraylist;

import java.util.ArrayList;

public class Exercise_2 {
    public static void main(String[] args) {
        ArrayList<String> myList= new ArrayList<>(); //ArrayList Declaration
        //adding the color names in the list called 'myList'
        myList.add("Red");
        myList.add("Blue");
        myList.add("Orange");
        myList.add("Golden");
        myList.add("Green");
        //iterating through the arraylist using for-each loop
        for (String color : myList) {
            System.out.print(color + " ");
        }
    }
}
