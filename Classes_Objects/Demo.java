// Write a program that would print the information (name, year of joining, salary, address)
// of three employees by creating a class named 'Employee'. The output should be as follows:

//    Name           Year of joining                Address
//  Rameshwar            1994            64-C, Ganesh Nagar, Bandra(W), Mumbai
//  Sarthak              2000            23-G, Mhada Colony, Warje, Pune
//  Jayesh               1999            56-D, Chandan Nagar, Sai City, Jalgaon


package Classes_Objects;

class Employee {

    private String name;
    private String address;
    private int join_year; 
    private int salary;

    public Employee(String n, int y, int s, String a){
        name = n;
        join_year = y;
        salary = s;
        address = a;
    }
    public String getName()
    {
        return name; 
    }
    public int getJoin_year()
    {
       return join_year;
    }
    public int getSalary()
    {
        return salary;
    }
    public String getAddress()
    {
        return address; 
    }
    
  public class Demo{
    public static void main(String[] args) {
    Employee e1 = new Employee("Rameshwar", 1994, 10000, "64-C, Ganesh Nagar, Bandra(W), Mumbai");
    Employee e2 = new Employee("Sarthak", 2000, 20000, "23-G, Mhada Colony, Warje, Pune");
    Employee e3 = new Employee("Jayesh", 1999, 10500, "56-D, Chandan Nagar, Sai City, Jalgaon");

        
        System.out.println("Name: " + e1.getName());
        System.out.println("Joining year: " + e1.getJoin_year());
        System.out.println("Salary: " + e1.getSalary());
        System.out.println("Address: " + e1.getAddress());

        
        System.out.println("Name: " + e2.getName());
        System.out.println("Joining year: " + e2.getJoin_year());
        System.out.println("Salary: " + e2.getSalary());
        System.out.println("Address: " + e2.getAddress());

        
        System.out.println("Name: " + e3.getName());
        System.out.println("Joining year: " + e3.getJoin_year());
        System.out.println("Salary: " + e3.getSalary());
        System.out.println("Address: " + e3.getAddress());
    }
  }
}