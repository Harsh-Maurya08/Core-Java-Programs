import java.util.Scanner;
class ArmStrong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check if it is armstrong or not: ");
        int num = input.nextInt();
        int num1=num;
        int num2=num;
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        int temp;
        int sum=0;
        while(num1>0){
            temp=num1%10;
            int i=1;
            int n=temp;
            while(i<count){
                n=n*temp;
                i++;
            }
            sum+=n;
            num1/=10;
        }
        if(num2==sum)
            System.out.println("The number is armstrong number.");
        else
            System.out.println("The number is not armstrong number.");
    }
}