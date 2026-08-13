import java.util.Scanner;
class NumberIsPalindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check whether the number is palindrome or not: ");
        int num = input.nextInt();
        if(isPalindrome(num))
            System.out.println("The number is Palindrome");
        else
            System.out.println("The number is not palindrome");
    }

    public static boolean isPalindrome(int num){
        int temp;
        int num1=num;
        int result=0;
        while(num>0){
            temp=num%10;
            result=(result*10)+temp;
            num/=10;
        }
        return num1 == result;
    }
}