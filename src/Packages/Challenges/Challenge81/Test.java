package Packages.Challenges.Challenge81;
public class Test {
    static void main() {
        Person ob = new Person("Harsh",19);
        Person ob2 = new Person("chotu",20);
        Person ob3 = new Person("Harsh",19);
        System.out.println(ob.equals(ob2));
        System.out.println(ob.equals(ob3));//after defining override in the person class
        System.out.println(ob.getAge()==ob3.getAge());//Directly getting value from the main class data
        System.out.println(ob.getName().equals(ob3.getName()));//Directly getting data from main classes
    }
}