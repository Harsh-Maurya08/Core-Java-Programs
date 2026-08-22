import java.util.Scanner;
class ArrayPalindromeUsingOneArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        int i=0;
        while(i<size){
            System.out.print("Enter the elements for index "+i+":");
            array[i]=input.nextInt();
            i++;
        }
        System.out.println("The array is "+(isPalindrome(array) ? "Palindrome"
                                                                : "Not Palindrome"));
    }
    public static boolean isPalindrome(int[] array){
        int i=0;
        while(i<array.length/2){
            if(array[i]!=array[array.length-1-i])
                return false;
            i++;
        }
        return true;
    }
}