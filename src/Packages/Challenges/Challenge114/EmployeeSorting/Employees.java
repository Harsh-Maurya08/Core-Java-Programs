package Packages.Challenges.Challenge114.EmployeeSorting;

public class Employees {
    private final String name;
    private final int salary;

    Employees(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employees{");
        sb.append("name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
