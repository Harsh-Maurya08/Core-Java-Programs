import java.util.Scanner;
class NumberGuessingGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        NumberGuessingGame ob = new NumberGuessingGame();
        int num;
        do{
            System.out.print("Guess the DOB (between 2000-2010): ");
            num = input.nextInt();
        }while(!ob.numberChecker(num)); //inverting the result of the boolean function to make the loop working
        System.out.println("Your guess is correct\nThe DOB is "+ num);
        System.out.println("You won the game...");
    }

    public boolean numberChecker(int num){
        int actualNumber = 2006;
        return num==actualNumber;
    }
}