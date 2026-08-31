package Packages.Challenges.Challenge109.LambdaOddFilter;

import java.util.List;

public class OddFilter {
    static void main(String[] args) {
        List<Integer> number = List.of(1,2,3,4,5,6,7,8);
        number.stream()
                .filter(n -> n%2!=0)
                .forEach(System.out::println);
    }
}
