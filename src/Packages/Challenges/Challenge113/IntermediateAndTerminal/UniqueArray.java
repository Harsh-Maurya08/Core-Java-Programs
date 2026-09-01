package Packages.Challenges.Challenge113.IntermediateAndTerminal;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueArray {
    static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,4,5,6,2,4,3,2,1,3,3);
        List<Integer> uniqueArray = number.stream()
                .distinct()
                //.sorted()
                .toList();
        System.out.println(number);
        System.out.println(uniqueArray);
    }
}
