import java.util.Scanner;
class FibonacciSeriesUsingRecursion {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = input.nextInt();
        for(int i=1;i<=range;i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int position) {
        if (position == 1)
            return 0;
        if (position == 2)
            return 1;
        return  fibonacci(position - 2) + fibonacci(position - 1);
    }
}