//Write a Java program to append the specified element to the end of a linked list.

package LinkedList;

import java.util.*;

public class LinkedList_1 {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        //to append a specific element to the end of a linked-list, 
        //we use add() method of linkedlist class
          myList.add("Red");
          myList.add("Green");
          myList.add("Black");
          myList.add("White");
          myList.add("Golden");
          //printing the linkedlist
          System.out.println(myList);
    }
}
