import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UniqueChar {
    public static void main() {
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = input.nextLine();

        for (char c : str.toCharArray()) {
            unique.add(c);
        }
        System.out.print("The unique characters in the string are: ");
        System.out.println(unique);
        System.out.printf("The total number of characters are: %d",unique.size());
    }
}
