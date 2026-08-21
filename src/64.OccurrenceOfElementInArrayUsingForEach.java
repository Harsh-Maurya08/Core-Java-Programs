import java.util.Scanner;
class OccurrenceOfElementInArrayUsingForEach {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check the occurrence in array: ");
        int num = input.nextInt();
        int[] array = {2,2,2,2,2,2, 3, 4, 5,5,5,5,5, 10, 9, 8, 7};
        OccurrenceOfElementInArrayUsingForEach ob = new OccurrenceOfElementInArrayUsingForEach();
        System.out.println("The number occurrence of number in array is " + ob.occurred(array,num));
    }
    public int occurred(int[] array,int num){
        int occur=0;
        for(int element : array){
            if(num==element)
                occur++;
        }
        return occur;
    }
}