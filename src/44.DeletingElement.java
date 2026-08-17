import java.util.Scanner;
class DeletingElement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        int i=0;
        while(i<size){
            System.out.print("Enter the element for index "+i+": ");
            array[i]=input.nextInt();
            i++;
        }
        System.out.print("Enter the element to delete from array: ");
        int delete = input.nextInt();
        int[] newArray  = new int[size-1];
        i=0;
        int j=0;
        while(i<size){
                if(array[i]!=delete)
                    newArray[j++]=array[i];
                else {
                    newArray[j++] = array[i + 1];
                   i++;
                }
            i++;
        }
        System.out.println("The new Array is: ");
        j=0;
        while(j<size-1){
            System.out.println(newArray[j]);
            j++;
        }
    }
}