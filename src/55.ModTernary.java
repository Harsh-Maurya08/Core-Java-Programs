import java.util.Scanner;
class ModTernary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        ModTernary modOb = new ModTernary();// defining object of the class to access non-static method
        System.out.print("The result is: "+modOb.mod(num));
    }

    int mod(int num){
        return num<0 ? -num : num;
    }
}