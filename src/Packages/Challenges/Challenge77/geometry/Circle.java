package Packages.Challenges.Challenge77.geometry;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        if(radius<=0){
            System.out.println("Invalid radius input...");
        }
        return radius;
    }
}