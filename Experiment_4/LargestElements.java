package Experiment_4;

import java.util.Arrays;

public class LargestElements {
    public static void main(String[] args) {

        // Define the array with given numbers
        int[] arr = {10, 5, 20, 8, 25, 15};

        // Define k, the number of largest elements to find
        int k = 3;

        // Sort the array in ascending order (smallest to largest)
        Arrays.sort(arr);

        // Print a message indicating the k largest elements
        System.out.println("The " + k + " largest elements are: ");

        // Loop to print the last k elements from the sorted array
        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}