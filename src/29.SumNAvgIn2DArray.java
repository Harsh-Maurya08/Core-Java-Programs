import java.util.Scanner;
class SumNAvgIn2DArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of row: ");
        int row = input.nextInt();
        System.out.print("Enter the size of col: ");
        int col = input.nextInt();
        int[][] array = new int[row][col];
        int i=0;
        while(i<row){
            System.out.println("Row: "+i);
            int j=0;
            while(j<col){
                System.out.print("Enter the element at index "+i+","+j+":"+"-->");
                array[i][j]=input.nextInt();
                j++;
            }
            i++;
        }
        float sum=0;
        i=0;
        while(i<row){
            int j=0;
            while(j<col){
                sum+=array[i][j];
                j++;
            }
            i++;
        }
        System.out.println("The sum of all elements in 2D array is: "+sum);
        System.out.print("The avg of all elements is "+sum/((float) col*(float)row));
    }
}