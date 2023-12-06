// Write a Java program to remove all elements from a hash set.
package HashSet;

import java.util.*;

public class HashSet_12 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<String>();
          // Use add() method to add values in the hash set
          set1.add("Red");
          set1.add("Green");
          set1.add("Black");
          set1.add("White");
          System.out.println("HashSet content: " + set1);
          // To remove all elements from the set1 hashset, we'll use clear() method
          set1.clear();
          System.out.println(set1);
    }
}
