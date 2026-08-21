import java.util.Scanner;
class PrimeOrNotUsingFor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        PrimeOrNotUsingFor ob = new PrimeOrNotUsingFor();
        System.out.println("The number is " + (ob.isPrime(num)? "Prime" : "Not Prime"));
    }
    public boolean isPrime(int num){
        for(int i=2;i<num;i++)
            if(num%i==0)
                return false;
        return true;
    }
}