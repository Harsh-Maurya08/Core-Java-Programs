package Packages.Challenges.Challenge85.Overloading;

public class Test extends Calculator{
    public static void main(String[] args){
        Calculator cal = new Calculator();
        System.out.println(cal.add(5,10));
        System.out.println(cal.add(4,7,6));
        System.out.println(cal.add(4.4,2.3));
    }
}
