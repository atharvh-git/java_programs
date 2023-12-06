// Write a Java program to iterate through all elements in a hash list.
package HashSet;

import java.util.*;

public class HashSet_2 {
    public static void main(String[] args) {
        //HashSet declaration
        Set<String> hr = new HashSet<>();
        //to add a specified element at the end of the
        //hashset then we use add() function of hashset class
        hr.add("Green");
        hr.add("Black");
        hr.add("Yellow");
        hr.add("Aqua");
        hr.add("Violet");
        //using for-each loop to iterate through the hashset
        for (String str : hr) {
            System.out.print(str + " ");
        }
    }
}
