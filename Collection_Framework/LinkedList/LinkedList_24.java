// Write a Java program to check if a linked list is empty or not.
package LinkedList;

import java.util.*;

public class LinkedList_24 {
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

        if (myList.isEmpty()) {
            System.out.println("myList is empty!!");
        } else {
            System.out.println("myList isn't empty!!");
        }
    }
}
