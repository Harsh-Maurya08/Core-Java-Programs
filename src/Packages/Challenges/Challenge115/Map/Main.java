package Packages.Challenges.Challenge115.Map;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> number = List.of("1","2","3","4","5","6");
        number.stream()
                .map(str -> Integer.parseInt(str))
                .map((num) -> (int)Math.pow(num,2))
                .reduce((a,b)->a+b)
                .ifPresent(System.out::println);
     }
}