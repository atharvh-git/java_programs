//Write a Java program to insert the specified element at the specified position in the linked list.
package LinkedList;

import java.util.*;

public class LinkedList_5 {
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
        //to insert an element at a particular index, we use add() (overloaded) method
        list.add(2, "Purple");
        //updated linkedlist is
        System.out.println(list);
    }
}
