// Write a Java program to compare two HashSets.
package HashSet;

import java.util.*;

public class HashSet_10 {
    public static void main(String[] args) {
        //HashSet 1 declaration
        Set<String> set1 = new HashSet<>();
        set1.add("Martin");
        set1.add("Sohel");
        set1.add("Dinesh");
        set1.add("Eshaan");
        set1.add("Ganpat");
        //HashSet 2 declaration
        Set<String> set2 = new HashSet<>();
        set2.add("Rishab");
        set2.add("Sohel");
        set2.add("Dipak");
        set2.add("Eshaan");
        set2.add("Chandan");
        //comparing the hashsets set1 and set2 using for-each loop and contains() method present in HashSet class
        for (String element : set1){
            System.out.println(set2.contains(element) ? "Yes" : "No");
         }
    }
}
