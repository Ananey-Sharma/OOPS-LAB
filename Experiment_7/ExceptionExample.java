package Experiment_7;

public class ExceptionExample {
    public static void main(String[] args) {

        try {
            // Declare and initialize an integer array with 3 elements
            int[] numbers = {1, 2, 3};

            // Print a message before risky operation
            System.out.println("Before exception");

            // Attempt to access invalid index (index 5 does not exist)
            int result = numbers[5];
            System.out.println("Result: " + result);

            // This line will NOT execute if exception occurs
            System.out.println("This line will not execute");

        } catch (ArrayIndexOutOfBoundsException e) {

            // Custom message
            System.out.println("Caught an ArrayIndexOutOfBoundsException!");

            // Print system-generated message
            System.out.println("Exception message: " + e.getMessage());

        } finally {

            // Always executes
            System.out.println("This block always executes");
        }

        // Continues after exception handling
        System.out.println("Program continues...");
    }
}