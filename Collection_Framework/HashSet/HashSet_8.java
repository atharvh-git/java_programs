// Write a Java program to convert a hash set to a tree set.
package HashSet;

import java.util.*;

public class HashSet_8 {
    public static void main(String[] args) {
        // HashSet declaration
        HashSet<String> hr = new HashSet<>();
        // to add a specified element at the end of the
        // hashset then we use add() function of hashset class
        hr.add("Green");
        hr.add("Black");
        hr.add("Yellow");
        hr.add("Purple");
        hr.add("Violet");

        // Creat a TreeSet of HashSet elements
        Set<String> tree_set = new TreeSet<String>(hr);

        // Display TreeSet elements
        System.out.println("TreeSet elements: ");
        for (String element : tree_set) {
            System.out.println(element);
        }
    }
}
