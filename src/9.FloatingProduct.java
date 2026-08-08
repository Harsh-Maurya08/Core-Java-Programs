import java.util.Scanner;
class FloatingProduct {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first floating number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second floating number: ");
        double num2 = input.nextDouble();
        double result = num1*num2;
        System.out.println("The result of two floating number is: "+result);
    }
}