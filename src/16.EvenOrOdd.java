import java.util.Scanner;
class EvenOrOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= input.nextInt();
        if(num%2==0)
            System.out.println("The number is EVEN.");
        else
            System.out.println("The number is ODD.1");
    }
}
