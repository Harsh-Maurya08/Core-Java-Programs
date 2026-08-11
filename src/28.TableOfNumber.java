import java.util.Scanner;
class TableOfNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to fnid the table of that number: ");
        int num = input.nextInt();
        System.out.println("The table of the given number is...");
        int i = 1;
        while(i<=10){
            System.out.println(num*i);
            i++;
        }
    }
}