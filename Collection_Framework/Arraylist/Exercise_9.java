//Write a Java program to copy one array list into another.

package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise_9 {
    public static void main(String[] args) {
        //ArrayList Declaration
        ArrayList<String> myList= new ArrayList<>(); 
        //adding the color names in the list called 'myList'
        myList.add("Red");
        myList.add("Blue");
        myList.add("Orange");
        myList.add("Golden");
        myList.add("Green");
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("1");
        arrList.add("2");
        arrList.add("3");
        arrList.add("4");
        arrList.add("5");
        //to copy arrList to myList, we use copy() method of Collections class
        //NOTE: both lists should be of same datatype
        Collections.copy(myList, arrList);

        System.out.println("List1: " + myList);
        System.out.println("List2: " + arrList);

    }
}
