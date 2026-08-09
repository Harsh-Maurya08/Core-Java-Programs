import java.util.Scanner;
class AreaOfTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the magnitude of base of triangle: ");
        float base = input.nextFloat();
        System.out.print("Enter the height of the triangle: ");
        float height = input.nextFloat();
        System.out.println("Area of triangle...");
        double result = 0.5*(base*height);
        System.out.println("The area of triangle is: "+result);
    }
}
