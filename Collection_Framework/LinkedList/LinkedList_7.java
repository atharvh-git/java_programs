//Write a Java program to insert the specified element at the front and at the end of a linked list.
package LinkedList;

import java.util.*;

public class LinkedList_7 {
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
        list.offerFirst("Violet");//inserts an element at the front of linkedlist
        list.offerLast("Black");//inserts an element at the end of linkedlist
        //printingg the updated linkedlist
        System.out.println(list);
    }
}
