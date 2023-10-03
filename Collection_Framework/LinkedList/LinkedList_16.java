// Write a Java program to shuffle elements in a linked list.
package LinkedList;

import java.util.*;

public class LinkedList_16 {
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
        //to shuffle the elements in the linked list, we use shuffle() method of Collections class
        Collections.shuffle(list);
        System.out.println(list);
     }
}
