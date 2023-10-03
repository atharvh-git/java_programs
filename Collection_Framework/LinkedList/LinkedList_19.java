// Write a Java program to remove and return the first element of a linked list.
package LinkedList;

import java.util.*;

public class LinkedList_19 {
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
        //removing the first element of linked-list using removeFirst() method of linkedlist class
        String ele = myList.removeFirst();
        //printing the removed element 
        System.out.println(ele);

    }
}
