package java_program;

/**
 * Write a Java program to sum values of an array.
 */

public class Program_18 {
    public static void main(String[] args) {
        sumOfArray();//Calling static method

    }

    /**
     * This is static method
     */
    public static void sumOfArray(){
        int [] arr = new int [] {1, 2, 3, 4, 5,6,7};
        int sum = 0;
        //Loop through the array to calculate sum of elements
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}
