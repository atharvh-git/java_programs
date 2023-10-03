// Write a Java program to remove a specified element from a linked list.
package LinkedList;

import java.util.*;

public class LinkedList_12 {
     public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        //to append a specific element to the end of a linked-list, 
        //we use add() method of linkedlist class
        list1.add("Red");
        list1.add("Violet");
        list1.add("White");
        list1.add("Aqua");
        list1.add("Blue");
        //to remove a specified element, we use remove() method of linked-list class
        list1.remove("White");
        System.out.println(list1); //prints the updated linkedlist
     }
}
