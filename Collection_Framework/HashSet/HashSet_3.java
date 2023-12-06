// Write a Java program to get the number of elements in a hash set.
package HashSet;

import java.util.*;

public class HashSet_3 {
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
        //we use size() function to know how many elements are present in the hashset
        System.out.println(hr.size());
        
    }
}
