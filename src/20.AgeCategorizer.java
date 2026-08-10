import java.util.Scanner;
class AgeCategorizer {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age of the person: ");
        int age = input.nextInt();
        if(age>60)
            System.out.println("The person is senior citizen.");
        else if(age<13)
            System.out.println("The person is child.");
        else if(age<20)
            System.out.println("The person is Teenager.");
        else if(age<=60)
            System.out.println("The person is Adult.");
    }
}
