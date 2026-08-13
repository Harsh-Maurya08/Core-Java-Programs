import java.util.Scanner;
class SumAndAvgOfArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int size=input.nextInt();
        int[] array = new int[size];
        int i=0;
        while(i<size){
            System.out.print("Enter element in array: ");
            array[i]=input.nextInt();
            i++;
        }
        //Sum
        int sum=0;
        int j=0;
        while(j<size){
            sum=sum+array[j];
            j++;
        }
        System.out.println("Sum is: "+ sum);
        //Average
        int avg = sum/array.length;
        System.out.println("Average is: "+ avg);
    }
}