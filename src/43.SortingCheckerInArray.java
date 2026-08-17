import java.util.Scanner;
class SortingCheckerInArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        int i=0;
        while(i<size){
            System.out.print("Enter the elements of an array: ");
            array[i]=input.nextInt();
            i++;
        }
        System.out.println("The Array is " + (isSorted(array) ? "Sorted"
                                                            : "Unsorted"));
    }
    public static boolean isSorted(int[] array){
        int i=0;
        while(i<array.length-1){
            if(array[i]>array[i+1])
                return false;
            i++;
        }
        return true;
    }
}