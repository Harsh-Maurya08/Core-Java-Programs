import java.util.Scanner;
class MonthsOfYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of month: ");
        int month = input.nextInt();
        MonthsOfYear object = new MonthsOfYear();
        object.months(month);
    }
    public void months(int month){
        String monthName = switch(month){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid input please check Again";
        };
        System.out.print("The month according to the number is: " + monthName);
    }
}