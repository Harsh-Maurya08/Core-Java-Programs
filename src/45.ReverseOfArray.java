import java.util.Scanner;
class ReverseOfArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        int[] newArray = new int[size];
        int i=0;
        while(i<size){
            System.out.print("Enter the element in index "+i+": ");
            array[i]=input.nextInt();
            i++;
        }
        i=0;
        int j=size-1;
        while(i<size){
            newArray[j--]=array[i];
            i++;
        }
        System.out.print("The reverse array is: ");
        i=0;
        while(i<size){
            System.out.print(newArray[i]+" ");
            i++;
        }
    }
}