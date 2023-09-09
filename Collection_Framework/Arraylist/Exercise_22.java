//Write a Java program to print all the elements of an ArrayList using the elements' position.

package Arraylist;
import java.util.*;

public class Exercise_22 {
    public static void main(String[] args) {
        ArrayList<String> myList= new ArrayList<>(); 
        //adding the color names in the list called 'myList'
        myList.add("Red");
        myList.add("Blue");
        myList.add("Orange");
        myList.add("Golden");
        myList.add("Green");
        //to calculate arraylist size we generally use size() method of arraylist class 
        int list_size = myList.size();
        //printing the arraylist elements using for loop
        for (int i = 0; i < list_size; i++) {
            System.out.println(myList.get(i));
        }
    }
}
