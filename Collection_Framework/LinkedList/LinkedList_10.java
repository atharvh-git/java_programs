// Write a Java program to get the first and last occurrence of the specified elements in a linked list.
package LinkedList;

import java.util.*;

public class LinkedList_10 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        //to append a specific element to the end of a linked-list, 
        //we use add() method of linkedlist class
        list1.add("Red");
        list1.add("Violet");
        list1.add("White");
        list1.add("Aqua");
        list1.add("Blue");
        
        // Find first element of the List
        String first_element = list1.getFirst();
        System.out.println("First Element is: "+ first_element);
        
        // Find last element of the List
        String last_element = list1.getLast();
        System.out.println("Last Element is: "+ last_element);
    }
}
