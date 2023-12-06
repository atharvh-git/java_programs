// Write a Java program to clone a hash set to another hash set.
package HashSet;

import java.util.*;

public class HashSet_6 {
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

        HashSet<String> hr1 = new HashSet<>();
        //to copy one hashset to another hashset, we use clone() function 
        hr1 = (HashSet) hr.clone();
        //printing the new hashset
        System.out.println(hr1);
    }
}
