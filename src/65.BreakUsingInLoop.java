import java.util.Scanner;
class BreakUsingInLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter the String: ");
            String string = input.nextLine();
            if(string.equalsIgnoreCase("exit"))
                break;
        }
    }
}
