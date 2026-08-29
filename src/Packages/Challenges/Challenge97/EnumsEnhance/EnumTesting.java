package Packages.Challenges.Challenge97.EnumsEnhance;

public class EnumTesting {
    public static void main(String[] args) {
        for (WeekDays days : WeekDays.values()) {
            System.out.println(days+" ");
        }
        System.out.println();

        for (WeekDays days : WeekDays.values()) {
            System.out.printf("%s : %s\n", days , days.getType());
        }
    }
}
