//Write a Java program to compare two array lists.

package Arraylist;

import java.util.ArrayList;

public class Exercise_13 {
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
        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        c2.add("Orange");
        //Storing the comparison output in ArrayList<String>
        ArrayList<String> c3 = new ArrayList<String>();
        for (String str : myList){
           c3.add(c2.contains(str) ? "Yes" : "No");
        }
        System.out.println(c3);
    }
}
