//Write a Java program to iterate through all elements in a linked list.

package LinkedList;

import java.util.*;

public class LinkedList_2 {
    public static void main(String[] args) {
        //Linkedlist declaration
        LinkedList<String> myList = new LinkedList<>();
        //to append a specific element to the end of a linked-list, 
        //we use add() method of linkedlist class
          myList.add("Red");
          myList.add("Green");
          myList.add("Black");
          myList.add("White");
          myList.add("Golden");
          //iterating through the linked list using for loop
          for (int i = 0; i < myList.size(); i++) 
          {
             System.out.println(myList.get(i));
          }
    }
}
