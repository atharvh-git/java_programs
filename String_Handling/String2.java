/*Given a string of even length, return the first half. 
So the string "CatDog" yields "Cat". If the string length is odd number 
then return null. */
package String_Handling;

public class String2 {
    public static void main(String[] args) {
        String s1 = "CatDog1";
        if(s1.length() % 2 == 0)
        {
            System.out.println(s1.substring(0,3));
        }
        else
        {
            System.out.println("null");
        }
    }
}
