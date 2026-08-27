//package Packages.Challenges.Challenge88.FileHandling;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the file name: ");
//        String fileName = input.nextLine();
//        try(FileReader reader = new FileReader(fileName)){
//            int read = 0;
//            do {
//                read = reader.read();
//                System.out.print(read - 1);
//            }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//            ((char)read);
//            }while(read != -1);
//
//        }catch(FileNotFoundException exp){
//            System.out.printf("The exception is: %s",exp.getMessage());
//        } catch(IOException e){
//            System.out.printf("The exception is: %s",e.getMessage());
//        }
//    }
//}
