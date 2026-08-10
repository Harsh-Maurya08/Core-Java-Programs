import java.util.Scanner;

class GreatestOfTwoNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number as num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number as num2: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number as num3: ");
        int num3 = input.nextInt();
        if(num1>num2 && num1>num3)
            System.out.println("The num1 is greatest: "+ num1);
        else if (num2>num1 && num2>num3) {
            System.out.println("The num2 is greatest: "+ num2);
        }
        else
            System.out.println("The num3 is greatest: "+num3);
    }
}
