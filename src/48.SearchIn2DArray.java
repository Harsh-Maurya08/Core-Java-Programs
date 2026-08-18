import java.util.Scanner;
class SearchIn2DArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of rows in array: ");
        int row = input.nextInt();
        System.out.print("Enter the size of colomn in array: ");
        int col = input.nextInt();
        int[][] array = new int[row][col];
        int i=0;
        while(i<row){
            int j=0;
            System.out.println("*");
            while(j<col){
                System.out.print("Enter element at index row:"+ i +", col:"+j+"-->");
                array[i][j]=input.nextInt();
                j++;
            }
        i++;
        }
        System.out.print("Enter the element to search: ");
        int num = input.nextInt();
        i=0;
        while(i<row){
            int j=0;
            while(j<col){
                if(array[i][j]==num)
                    System.out.println("Element is found in array at index "+i+","+j);
                j++;
            }
            i++;
        }
    }
}