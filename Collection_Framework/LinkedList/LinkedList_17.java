// Write a Java program to join two linked lists.
package LinkedList;

import java.util.*;

public class LinkedList_17 {
     public static void main(String[] args) {
          //Linkedlist 1 declaration
          LinkedList<String> myList = new LinkedList<>();
          //to append a specific element to the end of a linked-list, 
          //we use add() method of linkedlist class
          myList.add("Red");
          myList.add("Green");
          myList.add("Black");
          myList.add("White");
          myList.add("Golden");
          //Linkedlist 2 declaration
          LinkedList<String> List2 = new LinkedList<>();
          List2.add("2");
          List2.add("3");
          List2.add("5");
          List2.add("7");
          List2.add("11");
          //creating a third linked-list to add the above linked-lists
          LinkedList<String> list = new LinkedList<>();
          list.addAll(myList);
          list.addAll(List2);
          //printing the list
          System.out.println(list);
          
     }
}
