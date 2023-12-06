// Write a Java program to convert a hash set to an array.
package HashSet;

import java.util.*;

public class HashSet_7 {
    public static void main(String[] args) {
        // HashSet declaration
        HashSet<String> hr = new HashSet<>();
        // to add a specified element at the end of the
        // hashset then we use add() function of hashset class
        hr.add("Green");
        hr.add("Black");
        hr.add("Yellow");
        hr.add("Aqua");
        hr.add("Violet");
        String new_arr[] = new String[hr.size()];
        hr.toArray(new_arr);
        // Displaying Array elements
        System.out.println("Array elements: ");
        for (String element : new_arr) {
            System.out.println(element);
        }

    }
}
