import java.util.Scanner;
class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter the num2: ");
        int num2 = input.nextInt();
        System.out.print("Enter the operator: ");
        String operator  = input.next();
        Calculator object = new Calculator();
        System.out.print("The result is: "+object.calculator(num1,num2,operator));

    }
    public int calculator(int num1,int num2, String operator){
        int result = switch(operator){
          case "+" -> num1+num2;
          case "-" -> num1-num2;
          case "*" -> num1*num2;
          case "/" -> num1/num2;
          case "%" -> num1%num2;
          default -> -1;
        };
        return result;
    }
}