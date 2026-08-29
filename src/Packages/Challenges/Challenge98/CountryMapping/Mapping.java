package Packages.Challenges.Challenge98.CountryMapping;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapping {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("India","Delhi");
        map.put("USA" , "Washington DC");
        map.put("Japan" , "Tokyo");
        map.put("Russia" , "Moscow");
        map.put("Italy" , "Rome");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the country: ");
        String country = input.nextLine();
        if(map.containsKey(country)){
            System.out.printf("The capital of %s is %s",country,map.get(country));
        }
        else
            System.out.println("Sorry didn't get the country in map...");

    }
}
