import java.util.Scanner;
class LeapYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year to check whether it is leap year or not: ");
        int year = input.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0)
            System.out.println("The year is Leap Year which is "+year);
        else
            System.out.println("The year is not leap year.");
    }
}
