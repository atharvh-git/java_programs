//Write a Java program to update an array element by the given element.

package Arraylist;

import java.util.ArrayList;

public class Exercise_5 {
    public static void main(String[] args) {
        ArrayList<String> myList= new ArrayList<>(); 
        //adding the color names in the list called 'myList'
        myList.add("Red");
        myList.add("Blue");
        myList.add("Orange");
        myList.add("Golden");
        myList.add("Green");
        //to update an array element, we use set() method
        myList.set(2, "White");
        //updated arraylist is 
        System.out.println(myList);
    } 
}
