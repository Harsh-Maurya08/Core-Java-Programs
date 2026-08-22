import java.util.Scanner;
class PrintEvenUsingContinue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range of the numbers: ");
        int range = input.nextInt();
        for(int i=1;i<=range;i++){
            if(i%2!=0)
                continue;
            System.out.println(i);
        }
    }
}