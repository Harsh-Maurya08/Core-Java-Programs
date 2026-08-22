import java.util.Scanner;
class UseOfContinue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=5;i++){
            System.out.print("Enter the "+i+" number: ");
            int num = input.nextInt();
            if(num<0)
                continue;
            sum+=num;
        }
        System.out.print("The sum of all positive integers is: "+sum);
    }
}