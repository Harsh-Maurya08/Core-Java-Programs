package Packages.Challenges.Challenge87.ExceptionHandling;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        try{
            int result = num1/num2;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("The exception is this:"+e.getMessage()+" Which is not allowed in coding");
        }finally{
            System.out.println("Code execute completed");
        }
    }
}
