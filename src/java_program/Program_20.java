package java_program;

import java.util.Scanner;

/**
 * Write a Java program to test if an array contains a specific value.
 */

public class Program_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number from list 10, 50, 20, 30, 60, 40 : ");
        int sp = sc.nextInt();
        specificValue(sp);//  Calling Static method

    }

    /**
     * This is static method
     */
    public static void specificValue(int item) {

        int array[] = {10, 50, 20, 30, 60, 40};
        System.out.print("Array: ");
        // printArray(arr);

        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                index = i;
                break;
            }
        }
        if (index == -1)
            System.out.println("Entered element is not present in the array.");
        else
            System.out.println("Entered element is present in the array.");
    }
}



