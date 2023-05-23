package java_program;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
 */

public class Program_11 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        numberDivided3(3); // Calling static method
        numberDivided5(5); // Calling static method
    }

    /**
     * This is static method
     * @param number
     */
    public static void numberDivided3(int number) {
        if (number <= 100) {
            System.out.println(number);
            numberDivided3(number + 3);
        }
    }

    /**
     * This is static method
     * @param number
     */
    public static void numberDivided5(int number) {
        if (number <= 100) {
            System.out.println(number);
            numberDivided5(number + 5);

        }
    }
}