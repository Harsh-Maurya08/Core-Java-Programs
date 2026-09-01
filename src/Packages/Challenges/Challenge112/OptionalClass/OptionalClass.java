package Packages.Challenges.Challenge112.OptionalClass;

import java.util.Optional;
import java.util.Scanner;

public class OptionalClass {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(upperMaker(null));
        System.out.println(upperMaker(""));
        System.out.println(upperMaker("Harsh"));
    }

    public static Optional<String> upperMaker(String str) {
        if (str == null || str.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }
}
