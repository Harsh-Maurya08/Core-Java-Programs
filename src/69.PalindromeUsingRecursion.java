import java.util.Scanner;
class PalindromeUsingRecursin{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.next();
        System.out.print("Your String is " +
                (isPalindrome(str) ? "Palindrome"
                                   : "Not Palindrome") );
    }

    public static boolean isPalindrome(String str){
        int len = str.length()-1;
        if(len <= 0)
            return true;
        if(str.charAt(0)!=str.charAt(len))
            return false;
        String newStr = str.substring(1,len);
        return isPalindrome(newStr);
    }
}