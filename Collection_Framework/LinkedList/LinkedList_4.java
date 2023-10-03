//Write a Java program to iterate a linked list in reverse order.
package LinkedList;

import java.util.*;

public class LinkedList_4 {
    public static void main(String[] args) {
        //Linkedlist declaration
        LinkedList<String> list = new LinkedList<>();
        //to append a specific element to the end of a linked-list, 
        //we use add() method of linkedlist class
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Golden");
        //reverse() method of Collections class can be used to reverse a linkedlist
        Collections.reverse(list);
        //reversed linked list is as follows
        System.out.println(list);
        
    }
}
