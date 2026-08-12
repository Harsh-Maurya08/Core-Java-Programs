import java.util.Scanner;
class PrimeOrNot{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.println(isPrime(num)?"The number " +num+ " is Prime Number." :
                                        "The number "+num+" is not Prime Number.");
    }
    //boolean function to check number is prime or not and then ternary operator is used above
    public static boolean isPrime(int num){
        int i=2;
        while(i<num){
            if(num%i==0)
                return false;
            i++;
        }
        return true;
    }
}