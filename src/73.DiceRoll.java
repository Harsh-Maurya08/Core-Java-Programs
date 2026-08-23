import java.util.Scanner;

class DiceRoll {
    public static void main(String[] args){
        boolean i=true;
        while(i){
            System.out.println("1.Roll");
            System.out.println("2.Exit");
            System.out.print("Enter your choice: ");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("The roll of dice gives: "+rollDice());
                    break;
                case 2:
                    i=false;
                    break;
            };
        }
    }
    public static int rollDice(){
        return (int)Math.ceil(Math.random()*6);
    }
}