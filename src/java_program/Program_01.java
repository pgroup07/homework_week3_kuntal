package java_program;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Program_01 {
    // Main method
    public static void main(String[] args) {
        // Create object of scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();
        sc.close();
        ternaryOperator(number); // Call static method
    }

    /**
     *  This is static method
     * @param number
     */
    public static void ternaryOperator(int number) {
        // java odd or even
        String result = number % 2 == 0 ? "Even" : "Odd";//use ternary operator (? :)
        System.out.println(number + " is " + result);


    }

}
