package java_program;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Program_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any input : ");
        char ch = sc.next().charAt(0);
        numberAlphabetSymbol(ch); // Calling static method
    }

    /**
     * This is static method
     * @param ch
     * @return
     */
    public static char numberAlphabetSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is A ALPHABET.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is A DIGIT.");
        } else {
            System.out.println(ch + " is A SPECIAL CHARACTER.");
        }
        return ch;
    }
}



