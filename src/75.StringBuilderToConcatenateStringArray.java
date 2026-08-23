import java.util.Scanner;
class StringBuilderToConcatenateStringArray {
    String[] strArray ;
    int size;

    StringBuilderToConcatenateStringArray(int size){
        this.size = size;
        strArray = new String[size];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            for(String str : strArray)//using for each loop
                sb.append(str).append(" ");
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        input.nextLine(); //this is the concept of buffer
        // and this line clear the leftover newLine
        StringBuilderToConcatenateStringArray ob = new StringBuilderToConcatenateStringArray(size);
        for(int i=0;i<size;i++){
            System.out.print("Enter the String: ");
            ob.strArray[i] = input.nextLine();
        }
        System.out.print("Final string is: "+ob);
    }
}