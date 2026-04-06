package Experiment_8;

public class InspectStrings {
    public static void main(String[] args) {
        
        String str1 = "Apple";
        String str2 = "Apple";

        int result = str1.compareTo(str2);

        if (result == 0) {
            System.out.println("Both strings are lexicographically equal.");
        } 
        else if (result > 0) {
            System.out.println(str1 + " is greater than " + str2);
        } 
        else {
            System.out.println(str1 + " is smaller than " + str2);
        }
    }
}