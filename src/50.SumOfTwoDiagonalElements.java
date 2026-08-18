import java.util.Scanner;
class SumOfTwoDiagonalElements{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows of 2D array: ");
        int row = input.nextInt();
        System.out.print("Enter the columns of 2D array: ");
        int col = input.nextInt();
        if(row==col) {
            int[][] array = new int[row][col];
            int i = 0;
            while (i < row) {
                System.out.print("row:"+i);
                int j = 0;
                while (j < col) {
                    System.out.print("Enter the element at index " + i + ", " + j + ":-->");
                    array[i][j] = input.nextInt();
                    j++;
                }
                i++;
            }
            System.out.print("The sum of two Diagonal elements in 2D array is " + totalSum(array));
        }
        else
            System.out.print("Can't calculate diagonal sum because row and col are not equal...");
    }
    public static int sumOfLeftDiagonal(int[][] array){
        int sum=0;
        int i=0;
        while(i<array.length){
            sum+=array[i][i];
            i++;
        }
        return sum;
    }
    public static int sumOfRightDiagonal(int[][] array){
        int sum=0;
        int i=0;
        while(i<array.length){
            int j=0;
            while(j<array.length){
                if(i+j==array.length-1)
                    sum+=array[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static int totalSum(int[][] array){
        int leftSum = sumOfLeftDiagonal(array);
        int rightSum = sumOfRightDiagonal(array);
        int sum= leftSum+rightSum;
        int i=0;
        if(array.length%2!=0){
            int k=array.length/2;
            sum-=array[k][k];
        }
        return sum;
    }
}