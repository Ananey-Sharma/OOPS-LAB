package Experiment_4;

import java.util.Scanner;

public class PrimeMatrix {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();

        boolean[][] A = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (isPrime(i) && isPrime(j)) {
                    A[i][j] = false;
                } else {
                    A[i][j] = true;
                }
            }
        }

        System.out.println("\nMatrix Output:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}