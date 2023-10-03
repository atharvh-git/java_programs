// Write a Java program to check if a particular element exists in a linked list.
package LinkedList;

import java.util.*;

public class LinkedList_21 {
    public static void main(String[] args) {
        // Linkedlist 1 declaration
        LinkedList<String> myList = new LinkedList<>();
        // to append a specific element to the end of a linked-list,
        // we use add() method of linkedlist class
        myList.add("Red");
        myList.add("Green");
        myList.add("Black");
        myList.add("White");
        myList.add("Golden");
        //to check whether any element is present or not, we use contains() function
        System.out.println(myList.contains("Green"));
        
    }
}
