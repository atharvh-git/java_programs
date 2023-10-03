// Write a Java program to retrieve, but not remove, the first and last element of a linked list.
package LinkedList;

import java.util.*;

public class LinkedList_20 {
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
        //to retrieve which element is the first in the linked list, we use peekFirst() of Linked-list class
        System.out.println(myList.peekFirst());
        //to retrieve which element is the last in the linked list, we use peekFirst() of Linked-list class
        System.out.println(myList.peekLast());
    }
}
