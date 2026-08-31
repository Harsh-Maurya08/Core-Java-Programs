package Packages.Challenges.Challenge108.LambdaFilter;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Filtering {
    static void main(String[] args) {
        List<String> list = List.of("I ","Am","The","Best","Understand it");
        String str = list.stream()
                .filter(s -> !(s.length()>=10))
                .reduce("",(a,b) -> a+" "+b);

        System.out.println(str);
    }
}
