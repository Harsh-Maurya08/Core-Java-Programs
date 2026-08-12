import java.util.Scanner;
class LCM {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number as num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number as num2: ");
        int num2 =input.nextInt();
        int great;
        if(num1<num2)
            great=num2;
        else
            great=num1;
        int i=great;
        while(i>=great){
            if(i%num1==0 && i%num2==0) {
                System.out.print("The LCM of the two number is " + i);
                break;
            }
            i++;
        }
    }
}