//Write a Java program to iterate through all elements in a 
//linked list starting at the specified position.
package LinkedList;
import java.util.*;

public class LinkedList_3 
{
    public static void main(String[] args) 
    {
        LinkedList<String> list = new LinkedList<>();
        //to append a specific element to the end of a linked-list, 
        //we use add() method of linkedlist class
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Golden");
        // set Iterator at specified index
        Iterator<String> point = list.listIterator(2);
        // print list from second position
          while (point.hasNext()) 
          {
              System.out.println(point.next());
          }
    }
}
