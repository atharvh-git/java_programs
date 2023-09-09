//Write a Java program to test whether an array list is empty or not.

package Arraylist;
import java.util.*;

public class Exercise_18 {
    public static void main(String[] args) {
        ArrayList<String> myList= new ArrayList<>(); 
        //adding the color names in the list called 'myList'
        myList.add("Red");
        myList.add("Blue");
        myList.add("Orange");
        myList.add("Golden");
        myList.add("Green");
        // myList.removeAll(myList);
        //to check whether an arraylist is empty or not, we use isEmpty() method of arraylist class
        boolean check = myList.isEmpty();
        if(check == true){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
