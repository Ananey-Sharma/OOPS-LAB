package Experiment_1;

import java.util.Scanner;

public class TemperatureConvertor {
public static void main(String[] args) {
 
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Input a degree in Fahrenheit: ");
	
	double fahrenheit = scanner.nextDouble();
	
	double celsius = (fahrenheit - 32) * 5/9; 
	
	System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " degree Celsius");
	
	scanner.close();


	}

}