import java.util.Scanner;
class GuessingGame {
    int guessNumber;
    GuessingGame(){
        this.guessNumber = (int)(Math.ceil(Math.random()*100));
    }
    public static void main(String[] args){
        System.out.println("Guess the number between 1 to 100");
        Scanner input = new Scanner(System.in);
        GuessingGame ob = new GuessingGame();
        while(true) {
            System.out.print("Enter the number: ");
            int number = input.nextInt();
            if (number == ob.guessNumber) {
                System.out.println("Your guess is correct\nYou WIN....");
                break;
            } else if (number > ob.guessNumber)
                System.out.println("Guess lower");
            else
                System.out.println("Guess higher");
        }
    }
}