package Packages.Challenges.Challenge79;
public class TestAccess {
    public static void main(String[] args){
        Employee ob = new Employee("Harsh",19,3600000);
        ob.displayEmployeeDetails();
        ob.setSalary(4000000);
        ob.displayEmployeeDetails();
    }
}