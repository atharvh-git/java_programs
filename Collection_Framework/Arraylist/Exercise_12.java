//Write a Java program to extract a portion of an array list.

package Arraylist;

import java.util.*;

public class Exercise_12 {
     public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("1");
        arrList.add("2");
        arrList.add("3");
        arrList.add("4");
        arrList.add("5");
        //creating new arraylist which will store the sub-part of the main arraylist, 'arrList'
        List<String> sub_List = arrList.subList(0, 2);
        //NOTE: the sub_List will store the elements starting from 0 to last_index - 1, for e.g.,
        //in this case 0-"1", 1-"2" and 2-"3", so the list will store only first two elements in the sub_List 
        System.out.println(sub_List);
     }
}
