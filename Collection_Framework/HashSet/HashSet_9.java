// Write a Java program to convert a hash set to a List/ArrayList.
package HashSet;

import java.util.*;

public class HashSet_9 {
    public static void main(String[] args) {
        // HashSet declaration
        Set<String> hr = new HashSet<>();
        // to add a specified element at the end of the
        // hashset then we use add() function of hashset class
        hr.add("Green");
        hr.add("Black");
        hr.add("Yellow");
        hr.add("Purple");
        hr.add("Violet");
        
        //Conversion of HashSet to ArrayList
        List<String> arr = new ArrayList<>(hr);
        System.out.println("ArrayList is- " + arr);

    }
}
