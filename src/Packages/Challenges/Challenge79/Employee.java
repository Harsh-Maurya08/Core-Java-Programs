package Packages.Challenges.Challenge79;

public class Employee {
    private String name;
    private int age;
    private float salary;

    public Employee(String name,int age,float salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String setName(String name){
        return this.name = name;
    }

    public int getAge(){
        return age;
    }

    public int setAge(int age){
        return this.age=age;
    }

    public float getSalary(){
        return salary;
    }

    public float setSalary(float salary){
        return this.salary=salary;
    }

    void displayEmployeeDetails(){
        System.out.println("Details of Employee...");
        System.out.println("Name of employee: "+getName());
        System.out.println("Age of Employee: "+getAge());
        System.out.println("Salary of Employee: "+getSalary());
        System.out.println();
    }
}