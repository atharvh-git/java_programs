//Write a Java program to join two array lists.

package Arraylist;
import java.util.*;

public class Exercise_15 {
    public static void main(String[] args) {
        //Arraylist 1
        ArrayList<String> myList= new ArrayList<>(); 
        //adding the color names in the list called 'myList'
        myList.add("Red");
        myList.add("Blue");
        myList.add("Orange");
        myList.add("Golden");
        myList.add("Green");
        //Arraylist 2
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("1");
        arrList.add("2");
        arrList.add("3");
        arrList.add("4");
        arrList.add("5");
        //combined/joined arraylist of above two arraylists is done using addAll() method of arraylist class
        ArrayList<String> new_list = new ArrayList<>();
        new_list.addAll(arrList);
        new_list.addAll(myList);
        //printing the joined arraylist
        System.out.println(new_list);
    }
}
