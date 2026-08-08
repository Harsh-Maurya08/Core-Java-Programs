import java.util.Scanner;
class PerimeterOfRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the length of rectangle: ");
        float length = input.nextFloat();
        System.out.print("please Enter the breadth of rectangle: ");
        float width = input.nextFloat();
        double result = 2*(length+width);
        System.out.println("The perimeter of Rectangle is: "+result);
    }
}
