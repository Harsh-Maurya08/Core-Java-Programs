import java.util.Scanner;
class SumOfAllOddNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range to add all odd numbers: ");
        int range = input.nextInt();
        int sum=0;
        int i= 1;
        while(i<=range){
            sum+=i;
            i+=2;
        }
        System.out.println("The sum of all odd number from 1 to given range is: "+sum);
    }
}