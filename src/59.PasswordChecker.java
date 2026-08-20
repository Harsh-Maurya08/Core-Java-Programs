import java.util.Objects;
import java.util.Scanner;
class PasswordChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String password;
        PasswordChecker ob = new PasswordChecker();
        do{
            System.out.print("Enter the password: ");
            password = input.nextLine();
        }while(ob.isValid(password));
        System.out.print("Password match\nvalid password found\naccess granted...");
    }

    public boolean isValid(String password){
        String originalPassword = "Harsh";
        return !Objects.equals(password, originalPassword);
    }
}