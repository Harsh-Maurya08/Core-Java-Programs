import java.util.Scanner;
class AreaAndCircumferenceOfCircle {
    double radiusInMM;

    AreaAndCircumferenceOfCircle(double radius){
        this.radiusInMM = radius;
    }

    double getArea(double radiusInMM){
        return Math.PI* Math.pow(radiusInMM,2);
    }

    double getCircumference(double radiusInMM){
        return 2*Math.PI*radiusInMM;
    }

    @Override
    public String toString() {
        return "Radius of circle is: "+ radiusInMM +
                "\nArea of circle: " + getArea(radiusInMM) +
                "\nCircumference of circle: "+ getCircumference(radiusInMM);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        AreaAndCircumferenceOfCircle ob = new AreaAndCircumferenceOfCircle(radius);
        System.out.println(ob);
    }
}
