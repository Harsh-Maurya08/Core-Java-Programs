package Packages.Challenges.Challenge111.FactorialByFunctionalPrograming;
import java.util.Scanner;
import java.util.stream.IntStream;

public class UsingLambda {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for factorial count: ");
        int number = input.nextInt();
        //Functional Method
        System.out.println("Functional Method...");
        IntStream.rangeClosed(2, number)
                .reduce((a, b) -> a * b)
                .ifPresent(System.out::println);


        System.out.println("Printed by Normal method...");
        System.out.println(factorial(number));
    }

    //Procedural method
    public static int factorial(int num){
        if(num==1)
            return 1;
        return num*factorial(num-1);
    }
}
