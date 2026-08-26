package Packages.Challenges.Challenge83.Abstraction;

public class Square extends Shape{

    private double side = 10;

    Square(double side){
        this.side = side;
    }

    @Override
    double calculateAre() {
        return side*side;
    }
}
