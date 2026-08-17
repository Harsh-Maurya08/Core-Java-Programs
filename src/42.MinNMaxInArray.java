import java.util.Scanner;
class MinNMaxInArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        int i=0;
        while(i<size){
            System.out.print("Enter the elements of array: ");
            array[i]=input.nextInt();
            i++;
        }
        //min
        i=1;
        int min = array[0];
        while(i<size){
            if(array[i]<min)
                min=array[i];
            i++;
        }
        //max
        i=1;
        int max=array[0];
        while(i<size){
            if(array[i]>max)
                max=array[i];
            i++;
        }
        System.out.println("Max Element in array is: "+max);
        System.out.println("Min Element in array is: "+ min);
    }
}