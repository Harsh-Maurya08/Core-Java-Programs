import java.util.Scanner;
class PalindromeArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        int[] newArray = new int[size];
        int i=0;
        while(i<size){
            System.out.print("Enter the elements for index "+i+":");
            array[i]=input.nextInt();
            i++;
        }
        i=0;
        int j=size-1;
        while(i<size){
            newArray[j--]=array[i];
            i++;
        }
        System.out.println("The array is "+ (isPalindrome(newArray,array) ? "Palindrome"
                                                                          : "Not Palindrome"));
    }
    public static boolean isPalindrome(int[] newArray,int[] array){
        int i=0;
        while(i<array.length){
            if(newArray[i]!=array[i])
                return false;
            i++;
        }
        return true;
    }
}