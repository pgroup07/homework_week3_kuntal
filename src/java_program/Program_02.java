package java_program;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */

public class Program_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year : ");
        int number = sc.nextInt();
        sc.close();
        checkLeapYear(number);

    }

    public static void checkLeapYear(int year) {

        if (year % 400 == 0) {
            System.out.println(year + " is leap year.");
        } else if (year % 100 == 0) {
            System.out.println(year + " is leap year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is leap year.");
        } else {
            System.out.println(year + " is not leap year.");
        }

    }

}
