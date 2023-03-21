/* Write a program to implement a class “student” with the following members:
   1) Name of the student.
   2) Marks of the student obtained in three subjects. 
   Function to assign initial values. Function to compute total average. 
   Function to display the student’s name and the total marks. Write an appropriate 
   main() function to demonstrate the functioning of the above. */


package Classes_Objects;

class Student
{
    private String  s_name;
    private int marks1;
    private int marks2;
    private int marks3;
    
  // using getters and setters here to set the marks and name of the student
   public String getS_name(){
      return s_name;
   }
   public void setS_name(String n){
      s_name = n;
   }
   public int getMarks1(){
      return marks1;
   }
   public void setMarks1(int m1){
      marks1 = m1;
   }
   public int getMarks2(){
      return marks2;
   }
   public void setMarks2(int m2){
      marks2 = m2;
   }
   public int getMarks3(){
      return marks3;
   }
   public void setMarks3(int m3){
      marks3 = m3;
   }
   public int total_avg(){
    return (marks1 + marks2 + marks3)/3;
   }
}

public class Student1 {
   public static void main(String[] args) {
      Student stu = new Student(); //created a student object 'stu'
      stu.setS_name("Prashant Nikumbh");
      stu.setMarks1(78);
      stu.setMarks2(82);
      stu.setMarks3(93);
      
      System.out.println("Name of the student is " + stu.getS_name());
      System.out.println("Marks in Physics: " + stu.getMarks1());
      System.out.println("Marks in Chemistry: " + stu.getMarks2());
      System.out.println("Marks in Biology: " + stu.getMarks3());
      System.out.println("Average marks: " + stu.total_avg());

      System.out.println();

      Student stu1 = new Student(); //created a student object 'stu1'
      stu1.setS_name("Vishakha Deshpande");
      stu1.setMarks1(87);
      stu1.setMarks2(75);
      stu1.setMarks3(97);
      stu1.total_avg();
      System.out.println("Name of the student is " + stu1.getS_name());
      System.out.println("Marks in Physics: " + stu1.getMarks1());
      System.out.println("Marks in Chemistry: " + stu1.getMarks2());
      System.out.println("Marks in Biology: " + stu1.getMarks3());
      System.out.println("Average marks: " + stu1.total_avg());
   } 
}
