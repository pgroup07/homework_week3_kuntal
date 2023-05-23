package java_program;
/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Program_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet between A to F : ");
        String city = sc.nextLine();
        String toupperCase = city.toUpperCase();
        cityName(toupperCase);//Calling static method
        sc.close();
    }

    /**
     * This method is used to find city name as per alphabate between A to F
     * This is static method
     *
     * @param cityname
     */
    public static void cityName(String cityname) {
        switch (cityname) {
            case "A":
                System.out.println("city A from is Ahmedabad");
                break;
            case "B":
                System.out.println("city B from is Baroda");
                break;
            case "C":
                System.out.println("city C from is Canada");
                break;
            case "D":
                System.out.println("city D from is Dhaka");
                break;
            case "E":
                System.out.println("city E from is East London");
                break;
            case "F":
                System.out.println("city F from is Fulda");
                break;
            default:
                System.out.println("Invalid Alphabet please enter between A to F ");
        }
    }
}