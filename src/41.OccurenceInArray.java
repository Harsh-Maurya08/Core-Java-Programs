import java.util.Scanner;
class OccurenceInArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size=input.nextInt();
        int[] array = new int[size];
        int i=0;
        while(i<size){
            System.out.print("Enter the elements in array: ");
            array[i]=input.nextInt();
            i++;
        }
        System.out.print("Enter the number to check the occurence: ");
        int num = input.nextInt();
        int j=0;
        int count=0;
        while(j<size){
            if(array[j]==num)
                count++;
            j++;
        }
        System.out.print("The number occur in an array is: "+count);
    }
}