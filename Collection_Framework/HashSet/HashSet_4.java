// Write a Java program to empty an hash set.
package HashSet;

import java.util.*;

public class HashSet_4 {
    public static void main(String[] args) {
        //HashSet declaration
        HashSet<String> hr = new HashSet<>();
        //to add a specified element at the end of the
        //hashset then we use add() function of hashset class
        hr.add("Green");
        hr.add("Black");
        hr.add("Yellow");
        hr.add("Aqua");
        hr.add("Violet");
        //to empty a hashset, we use removeAll() function
        hr.removeAll(hr);
        //printing the size of hashset
        System.out.println(hr.size());
    }
}
