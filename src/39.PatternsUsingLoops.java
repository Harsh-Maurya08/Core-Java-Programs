import java.util.Scanner;
class PatternUsingLoops{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows for patterns: ");
        int row = input.nextInt();
        //patern 1
        int i=1;
        while(i<=row){
            int j=1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        //pattern 2
        i=row;
        while(i>=1){
            int k=i;
            while(k>=1){
                System.out.print("* ");
                k--;
            }
            System.out.println();
            i--;
        }
        System.out.println();
        //pattern 3
        i=row;
        while(i>=1){
            int h=i-1;
            int count=0;
            while(h>=1){
                System.out.print("  ");
                count++;
                h--;
            }
            int d=1;
            while(d<=row-count){
                System.out.print("* ");
                d++;
            }
            System.out.println();
            i--;
        }
    }
}