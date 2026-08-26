package Packages.Challenges.Challenge83.Abstraction;

public class Circle extends Shape{
    private double radius =5;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double calculateAre() {
        return Math.PI *(radius*radius);
    }
}