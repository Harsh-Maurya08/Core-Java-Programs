package Packages.Challenges.Challenge107.LambdaStream;

import java.util.ArrayList;
import java.util.List;

public class StringToStream {
    static void main(String[] args) {
        List<String> list = List.of("I ","Am","The","Best");
        list.stream()
                .forEach(System.out::println);
    }
}
