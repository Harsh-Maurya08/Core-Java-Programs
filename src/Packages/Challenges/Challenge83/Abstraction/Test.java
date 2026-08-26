package Packages.Challenges.Challenge83.Abstraction;

public class Test {
    public static void main(String[] args){
        Circle cir = new Circle(5);
        Square sq = new Square(10);

        System.out.printf("Area of Circle is %.2f\n" ,cir.calculateAre());
        System.out.printf("Area of Square id %.2f" ,sq.calculateAre());
    }
}
