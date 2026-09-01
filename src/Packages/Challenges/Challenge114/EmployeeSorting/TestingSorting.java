package Packages.Challenges.Challenge114.EmployeeSorting;

import java.util.List;

public class TestingSorting{
    static void main(String[] args) {
        List<Employees> employee = List.of(
                new Employees("Harsh",300000),
                new Employees("Ram" , 1000000),
                new Employees("BC" , 1),
                new Employees("Harsh",400000),
                new Employees("Ram" , 1000000000),
                new Employees("MC" , 1100)
        );

        employee.stream()
                .sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);
    }
}
