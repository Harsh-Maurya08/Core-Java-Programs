import java.util.Scanner;
class CompoundInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the principle amount: ");
        float P = input.nextFloat();
        System.out.print("Enter the time(in years): ");
        float T = input.nextFloat();
        System.out.print("Enter the rate of interest: ");
        float R = input.nextFloat();
        System.out.println("The amount of interest obtain after compounding of interest is....");
        float Amount = P*T*(1+R/100);
        System.out.println("The interest obtain is: "+ Amount);
    }
}
