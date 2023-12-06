// Write a Java program to append the specified element to the end of a hash set.
package HashSet;

import java.util.*;

public class HashSet_1 {
    public static void main(String[] args) {
        //HashSet declaration
        Set<String> hr = new HashSet<>();
        //to add a specified element at the end of the
        //hashset then we use add() function of hashset class
        hr.add("Green");
        hr.add("Black");
        hr.add("Yellow");
        hr.add("Aqua");
        hr.add("Blue");
        //printing the hashset
        System.out.println(hr);

    }
}
