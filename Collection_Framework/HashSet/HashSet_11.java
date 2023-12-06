// Write a Java program to compare two sets and retain elements that are the same.
package HashSet;

import java.util.*;

public class HashSet_11 {
    public static void main(String[] args) {
          HashSet<String> set1 = new HashSet<String>();
          // use add() method to add values in the hash set
          set1.add("Red");
          set1.add("Green");
          set1.add("Black");
          set1.add("White");
          System.out.println("First HashSet content: " + set1);

          HashSet<String> set2 = new HashSet<String>();
          // use add() method to add values in the hash set
          set2.add("Red");
          set2.add("Pink");
          set2.add("Black");
          set2.add("Orange");
          System.out.println("Second HashSet content: " + set2);
          //same elements can be retained using the retainAll() method
          set1.retainAll(set2);
          System.out.println(set1);
    }
}
