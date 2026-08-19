import java.util.Scanner;
class OddEvenTernary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        OddEvenTernary object = new OddEvenTernary();
        object.evenOdd(num);
    }
    public void evenOdd(int num){
        System.out.println(num%2==0 ? "Even" : "Odd");
    }
}