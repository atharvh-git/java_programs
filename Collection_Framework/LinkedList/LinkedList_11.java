// Write a Java program to display elements and their positions in a linked list.
package LinkedList;

import java.util.*;

public class LinkedList_11 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        //to append a specific element to the end of a linked-list, 
        //we use add() method of linkedlist class
        list1.add("Red");
        list1.add("Violet");
        list1.add("White");
        list1.add("Aqua");
        list1.add("Blue");
        //using get(index) method for displaying elements along with their index positions
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(i + "th element is " + list1.get(i));
        }

    }
}
