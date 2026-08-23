import java.util.Scanner;
class NumberGuessingGameBot {
    public static void main(String[] args){
        System.out.println("Guess the number between 1 to 10, If the guess is correct you win.");
        int guessNumber = (int)Math.ceil(Math.random()*10);
        while(true){
            System.out.print("Enter the number: ");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            if(guessNumber==number) {
                System.out.println("Your guess is correct and you win...");
                break;
            }
            else
                System.out.println("Guess is wrong...\nTry again");
        }
    }
}
