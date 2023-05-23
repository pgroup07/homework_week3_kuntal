package java_program;
/**
 * Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class Program_06 {
    // Main method
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        oddOrEven(num);//method calling
    }

    /**
     * This method is use for evenadd numbers.
     * This is static method
     * @param num
     */
    public static void oddOrEven(int num) {
        //logic to check if the number is even or not
        if (num % 2 == 0) System.out.println(num + " is even");
        else System.out.println(num + " is odd");
    }
}
