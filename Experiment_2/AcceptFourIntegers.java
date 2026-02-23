package Experiment_2;

import java.util.Scanner;

public class AcceptFourIntegers {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first integer: ");
    int a = sc.nextInt();

    System.out.print("Enter second integer: ");
    int b = sc.nextInt();

    System.out.print("Enter third integer: ");
    int c = sc.nextInt();

    System.out.print("Enter fourth integer: ");
    int d = sc.nextInt();

    if (a == b && b == c && c == d) {
        System.out.println("All integers are equal.");
    } else {
        System.out.println("The integers are not all equal.");
    }

    sc.close();
    
}
}
 