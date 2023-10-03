// Write a Java program to remove all elements from a linked list.
package LinkedList;

import java.util.*;

public class LinkedList_14 {
     public static void main(String[] args) {
        //Linkedlist declaration
        LinkedList<String> list = new LinkedList<>();
        //to append a specific element to the end of a linked-list, 
        //we use add() method of linkedlist class
        list.add("Red");
        list.add("Green");
        list.add("Silver");
        list.add("White");
        list.add("Golden");
        //to remove all the elements from the linked-list, we use removeAll() method
        list.removeAll(list);
        System.out.println(list);
     }
}
