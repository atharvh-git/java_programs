// Write a Java program that swaps two elements in a linked list.
package LinkedList;

import java.util.*;

public class LinkedList_15 {
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
        
        //to swap two linked list element, we use swap() method of Collections class
        Collections.swap(list, 0, 2);
        //printing the updated list 
        System.out.println(list);
    }
}
