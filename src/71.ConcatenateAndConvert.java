import java.util.Scanner;

class ConcatenateAndConvert {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st String: ");
        String str1 = input.nextLine();
        System.out.print("Enter the 2nd String: ");
        String str2 = input.nextLine();
        ConcatenateAndConvert ob = new ConcatenateAndConvert();
        ob.concateAndInvert(str1 , str2);
    }

    public void concateAndInvert(String str1 , String str2){
        String newStr = str1 +" "+ str2;
        System.out.print(newStr.toUpperCase());
    }
}