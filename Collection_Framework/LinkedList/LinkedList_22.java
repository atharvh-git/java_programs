// Write a Java program to convert a linked list to an array list.
package LinkedList;

import java.util.*;

public class LinkedList_22 {
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
        //converting the linked-list to an arraylist
        List<String> arr = new ArrayList<>(myList);
        //printing the arraylist
        System.err.println(arr);

        
    }
}
