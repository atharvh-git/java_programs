// Write a Java program to replace an element in a linked list.
package LinkedList;

import java.util.*;

public class LinkedList_25 {
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
        //to replace any element, we use set() method of linked-list element
        myList.set(3, "Blue");
        // printing the linked-list
        System.out.println(myList);
        
        
    }
}
