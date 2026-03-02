package Experiment_3;

public class TransposeArray{

    public static void main(String[] args) {

        int[][] original = {
                {10, 20, 30},
                {40, 50, 60}
        };

        int rows = original.length;
        int cols = original[0].length;

        int[][] transpose = new int[cols][rows];

        System.out.println("Original Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose logic
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = original[i][j];
            }
        }

        System.out.println("\nAfter Changing Rows and Columns:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    

