package java_program;

/**
 * Write a Java program to calculate the average value of array elements.
 */

public class Program_19 {
    public static void main(String[] args) {
        averageValueArray();//  Calling Static method
    }
    /**
     * This is static method
     */
    public static void averageValueArray() {
        int[] numbers = new int[]{10, 20, 25, 35, 50};
        //calculate sum of all array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }

}