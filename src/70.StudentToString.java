import java.util.Scanner;
class StudentClass {
    String name;
    int age;

    StudentClass(String name,int age){
        this.name  =  name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: " + name + "\nAge: " + age;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String nam = input.nextLine();
        System.out.print("Enter the age: ");
        int ag = input.nextInt();
        StudentClass ob = new StudentClass(nam,ag);
        System.out.println(ob.toString());//print only object as "ob" also working here
                                           // toString calls automatically when an object calls it
        System.out.println(ob); 
    }
}