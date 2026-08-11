import java.util.Scanner;
class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int i=num-1;
        while(i>=1){
            num=num*i;
            i--;
        }
        System.out.println("The factorial of the given number is: "+ num);
    }
}
