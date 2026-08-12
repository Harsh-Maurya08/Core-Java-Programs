import java.util.Scanner;
class SumOfDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Integer: ");
        int num = input.nextInt();
        int sum=0;
        while(num>0){
            int d=num%10;
            sum+=d;
            num/=10;
        }
        System.out.println("The sum of digit of the integer is: "+sum);
    }
}