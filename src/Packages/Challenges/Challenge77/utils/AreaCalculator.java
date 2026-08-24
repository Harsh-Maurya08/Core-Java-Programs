package Packages.Challenges.Challenge77.utils;
import Packages.Challenges.Challenge77.geometry.Circle;
import Packages.Challenges.Challenge77.geometry.Rectangel;
import java.util.Scanner;
public class AreaCalculator {
    double Area;
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double rad = input.nextDouble();
        Circle circle = new Circle(rad);
        AreaCalculator ob = new AreaCalculator();
        ob.Area = Math.PI* (Math.pow(circle.getRadius(),2));
        System.out.println("The Area of circle is: "+(float)ob.Area);
        System.out.print("Enter the length: ");
        float len = input.nextFloat();
        System.out.print("Enter the breadth: ");
        float bred = input.nextFloat();
        Rectangel rectangle = new Rectangel(len,bred);
        ob.Area = rectangle.getBreadth()*rectangle.getLength();
        System.out.println("Area of rectangle is: "+(float)ob.Area);
    }
}
