package Packages.Challenges.Challenge82;

public class TestArray {
    static void main() {
        ArrayOperation ob = new ArrayOperation();
        ArrayOperation.Statistics stat = new ArrayOperation.Statistics();
        System.out.println(stat.mean(ob.array));
        System.out.println(stat.median(ob.array));
    }
}
