package java_program;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */

import java.util.Scanner;

public class Program_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        checkPositiveOrNegative(num);//Calling static method
    }
    /**
     * This method is used to check Positive Or Negative
     * This is static method
     * @param num
     */
    public static void checkPositiveOrNegative(int num) {
        if (num > 0) {
            System.out.println("The number is positive.");
        }
        //checks the number is less than 0 or not
        else if (num < 0) {
            System.out.println("The number is negative.");
        }
        //executes when the above two conditions return false
        else {
            System.out.println("The number is zero.");
        }
    }

}
