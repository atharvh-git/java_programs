import java.util.*;
class Person{
    private int age;

    public int getAge(){
        return age;
    }
    void setAge(int age){
        this.age = age;
    }
}
class First{
    public static void main(String[] args){
        Person p1 =  new Person();
        p1.setAge(34);
        System.out.println("My age is : " + p1.getAge());
    }
}