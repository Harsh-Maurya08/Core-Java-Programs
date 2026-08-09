import java.util.Scanner;
class TemperatureCalci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in fahrenheit: ");
        float Fahren = input.nextFloat();
        float Celsius = (Fahren-32)*5/9;
        System.out.print("The converted temperature from fahrenheit to celsius is: "+ Celsius);
    }
}
