//GCD stands for Greatest Common Divisor
import java.util.Scanner;
class GCD {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number as num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number as num2: ");
        int num2 =input.nextInt();
        int small;
        if(num1<num2)
            small=num1;
        else
            small=num2;
        int i=small;
        while(i>=1){
            if(num1%i==0 && num2%i==0){
                System.out.print("The GCD of two numbers is: "+i);
                break;
            }
            i--;
        }
    }
}