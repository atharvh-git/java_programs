// Write a Java program to test if a hash set is empty or not.
package HashSet;

import java.util.*;

public class HashSet_5 {
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
        
        if(hr.isEmpty()) {
            System.out.println("This is an empty hashset!");
        } else {
            System.out.println("This isn't an empty hashset!");
        }
    }
}
