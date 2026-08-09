import java.util.Scanner;
class SimpleInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle amount of loan: ");
        int  P = input.nextInt();
        System.out.print("Enter the rate of interest of loan: ");
        float R = input.nextFloat();
        System.out.print("Enter the time(in years) of loan: ");
        float T = input.nextFloat();
        System.out.println("Simple Interest...");
        double SI = (P*R*T)/100;
        System.out.println("The final amount of the Simple Interest is: "+ SI);
    }
}