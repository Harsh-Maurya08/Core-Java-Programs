import java.util.Scanner;
class ReverseTheDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        int temp;
        int result=0;
        while(num>0){
            temp=num%10;
            result = (result*10)+temp;
            num/=10;
        }
        System.out.print("The reversal of the given Integer is "+result);
    }
}