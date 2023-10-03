// Write a Java program to remove the first and last elements from a linked list.
package LinkedList;

import java.util.*;

public class LinkedList_13 {
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
        //to remove first and last elements from the linked list, we use following methods
        list.removeFirst();
        list.removeLast();
        //printing the updated list
        System.out.println(list);

     }
}
