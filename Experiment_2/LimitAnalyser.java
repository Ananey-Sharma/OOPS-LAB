package Experiment_2;

import java.util.Scanner;

public class LimitAnalyser {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first double value:");
        double x = sc.nextDouble();
        System.out.print("Enter second double value:");
        double y = sc.nextDouble();
       
        if (x>0 && x<1 && y>0 && y<1) {
            System.out.println("Both x and y are between 0 and 1.");
        } else {
            System.out.println("Either x or y is not between 0 and 1.");
        }

        sc.close();
    }
    
}
