import java.util.Scanner;
class NestedTernary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks of the student: ");
        int marks = input.nextInt();
        NestedTernary category = new NestedTernary();
        category.categorize(marks);
    }
    public void categorize(int marks){
        String result = marks<50 ? "Low" : (marks<=80 ? "Moderate" : "High");
        System.out.print("The category of the student according to marks is: "+result);
    }
}