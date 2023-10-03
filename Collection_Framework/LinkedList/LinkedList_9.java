// Write a Java program to insert some elements at the specified position into a linked list.
package LinkedList;

import java.util.*;

public class LinkedList_9 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        //to append a specific element to the end of a linked-list, 
        //we use add() method of linkedlist class
        list1.add("Red");
        list1.add("Violet");
        list1.add("White");
        list1.add("Aqua");
        list1.add("Blue");
        //to insert some elements at some specified index, we use set() method of linked-list
        list1.set(2, "Orange");
        list1.set(1, "Green");
        System.out.println(list1);
    }
}
