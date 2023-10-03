//Write a Java program to insert elements into the linked list at the first and last positions.
package LinkedList;

import java.util.*;

public class LinkedList_6 {
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
        //to add elements at the first and last positions respectively, we use following methods
        list.addFirst("Black");
        //adds this element at the beginning of linkedlist
        list.addLast("Orange");
        //adds this element at the end of the linkedlist
        
        //printing the updated linkedlist
        System.out.println(list);
    }
}
