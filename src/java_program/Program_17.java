package java_program;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class Program_17 {
    public static void main(String[] args) {
        arrayToStringArray();//Calling static method
    }

    /**
     * This method is use to short a numeric array and a string array.
     * This is static method
     */
    public static void arrayToStringArray() {
        int[] my_arr = {7, 0, 5, 8, 4, 2, 3, 1, 6
        };
        String[] my_str = {"z", "b", "a", "k", "g", "s", "o", "m", "p"
        };
        System.out.println("Original numeric array : " + Arrays.toString(my_arr));
        Arrays.sort(my_arr);
        System.out.println("Sorted numeric array : " + Arrays.toString(my_arr));
        System.out.println("Original string array : " + Arrays.toString(my_str));
        Arrays.sort(my_str);
        System.out.println("Sorted string array : " + Arrays.toString(my_str));
    }
}
