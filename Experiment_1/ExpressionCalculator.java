package Experiment_1;

public class ExpressionCalculator {
public static void main(String[] args) {
		
	int result1 = (101 + 0) / 3;
	System.out.println("Result of (101 + 0 / 3): " + result1);

	double result2 = (3.0e-6 * 1000000.1);
	System.out.println("Result of (3.0e-6 * 1000000.1): " + result2);
	
	boolean result3 = (true && true);
	System.out.println("Result of (true && true): " + result3);
	
	boolean result4 = (false & true);
	System.out.println("Result of (false && true): " + result4);
	
	boolean result5 = ((false & true) || (true & true));
	System.out.println("Result of (false && true || true && true): " + result5);
	
	boolean left = false || false;
	boolean right = true && true;
	boolean result6 = left && right;
	System.out.println("Result of (false || false) && (true && true): " + result6);
	

}

}