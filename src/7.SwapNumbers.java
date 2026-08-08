import java.util.Scanner;
class SwapNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the first Number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter the Second Number: ");
        int num2 = input.nextInt();
        System.out.println("First number is: "+num1+" Second number is: "+num2);
        System.out.println("After the swap function output will be...");
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("First number is: "+num1+" Second number is: "+num2);
    }
}
