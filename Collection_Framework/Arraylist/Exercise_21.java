//Write a Java program to replace the second element of an ArrayList with the specified element.

package Arraylist;

import java.util.ArrayList;

public class Exercise_21 {
    public static void main(String[] args) {
        ArrayList<String> myList= new ArrayList<>(); 
        //adding the color names in the list called 'myList'
        myList.add("Red");
        myList.add("Blue");
        myList.add("Orange");
        myList.add("Golden");
        myList.add("Green");
        //replacing the second element with another color, for that we use set() method
        myList.set(1, "Silver");
        System.out.println(myList);
    }
}
