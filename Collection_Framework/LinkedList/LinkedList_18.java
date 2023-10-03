//  Write a Java program to copy a linked list to another linked list.
package LinkedList;

import java.util.*;

public class LinkedList_18 {
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
        //linkedlist 2 declaration
        LinkedList<String> List2 = new LinkedList<>();
        List2 = (LinkedList) myList.clone();
        //printing the list
        System.out.println(List2);

    }
}
