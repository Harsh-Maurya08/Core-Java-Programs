import java.util.Scanner;
class InputName {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Good morning "+name);
    }
}
