// Write a Java program to insert the specified element at the end of a linked list.
package LinkedList;

import java.util.*;

public class LinkedList_8 {
     public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        //to append a specific element to the end of a linked-list, 
        //we use add() method of linkedlist class
        list1.add("Red");
        list1.add("Violet");
        list1.add("White");
        list1.add("Aqua");
        list1.add("Blue");
        // to insert an element at the end of a linked-list, we use offerLast() method
        list1.offerLast("Black");
        //printing the linked-list
        System.out.println(list1);


     }
}
