package Packages.Challenges.Challenge106.FunctionalProgramming;

import java.util.function.BinaryOperator;

public class Multiplication {
    static void main(String[] args){
        BinaryOperator<Integer> multi = (a,b) -> a*b;
        int result = multi.apply(5,9);
        System.out.println(result);
     }
}
