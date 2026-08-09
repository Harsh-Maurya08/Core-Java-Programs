import java.util.Scanner;
class PositiveOrNegative {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        float num = input.nextFloat();
        if(num>0)
            System.out.print("the number is positive.");
        else if (num==0) {
            System.out.println("The number is ZERO");
        } else
            System.out.println("The number is negative.");
    }
}