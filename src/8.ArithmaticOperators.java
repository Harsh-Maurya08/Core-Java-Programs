import java.util.Scanner;
class ArithmaticOperators {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the first Number: ");
        int num1 = input.nextInt();
        System.out.print("Please Enter the Second Number: ");
        int num2 = input.nextInt();
        System.out.println();
        System.out.println("Addition...");
        int sum=num1+num2;
        System.out.println("The sum of these two number is: "+ sum);
        System.out.println();
        System.out.println("Subtraction...");
        int subs=num1-num2;
        System.out.println("The subtraction of two number is: "+subs);
        System.out.println();
        System.out.println("Multiplication...");
        int result = num1*num2;
        System.out.println("The multiplication of two number is: "+result);
        System.out.println();
        System.out.println("Divide...");
        int divide = num1/num2;
        System.out.println("The division of two number is: "+divide);
        System.out.println();
    }
}
