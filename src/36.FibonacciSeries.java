import java.util.Scanner;
class FibonacciSeries {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range for series: ");
        int range = input.nextInt();
        int a=0;
        int b=1;
        int c=0;
        while(c<=range){
            System.out.print(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}