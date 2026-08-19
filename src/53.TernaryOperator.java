import java.util.Scanner;
class TernaryOperator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        TernaryOperator min = new TernaryOperator();// defining object of the class to access non-static method
        System.out.print("The minimum number is: "+min.minimum(num1,num2));
    }
    public int minimum(int num1, int num2){
        int num = num1<num2 ? num1 : num2;
        return num;
    }
}