/**
 * In this program we are going to implement the solution of a polynomial through 
 * the quadratic equation.
 * Additionally, we will identify whether or not the polynomial has a solution.
 */

package exercises;

import java.util.Scanner;

public class QuadraticFunction {
	private Scanner keyboard; // Scanner for user input
	private int a, b, c; // Coefficient 'a', 'b' and 'c' in the quadratic equation.
	private double root, valueX1, valueX2;

	/**
	 * Prompts the user to enter the coefficients for the quadratic equation. The
	 * user inputs the values of 'a', 'b', and 'c', which are then stored in the
	 * corresponding fields.
	 */

	public void UploadData() {

		keyboard = new Scanner(System.in);
		System.out.println("Enter the value of a");
		a = keyboard.nextInt();
		System.out.println("Enter the value of b");
		b = keyboard.nextInt();
		System.out.println("Enter the value of c");
		c = keyboard.nextInt();
	}

	/**
	 * Calculates the roots of the quadratic equation using the quadratic formula.
	 * The method first calculates the discriminant's square root and then uses it
	 * to determine the two possible roots (valueX1 and valueX2).
	 */

	public void Calculate() {
		double powB = Math.pow(b, 2);// We use the POW method to square the value of the coefficient 'b'.
		root = Math.sqrt(powB - (4 * a * c));// We use the sqrt method to find the value of discriminating 'root'.
		valueX1 = (-b + root) / (2 * a);// We found the value of the first root.
		valueX2 = (-b - root) / (2 * a);// We found the value of the second root.
	}

	/**
	 * Displays the results of the quadratic equation. If the discriminant is
	 * non-negative, it prints the values of the roots. Otherwise, it indicates that
	 * the quadratic equation has no real solution.
	 */
	public void Results() {

		if (root >= 0) {
			System.out.println("The value of the first root is " + valueX1);
			System.out.println("The value of the second root is " + valueX2);

		}

		else {
			System.out.println("The quadratic function has no solution!!");

		}
	}

	/**
	 * The main method where the program starts execution. Creates an instance of
	 * {@code QuadraticFunction}, calls methods to input data, calculate the roots,
	 * and display the results.
	 * 
	 * @param args Command line arguments (not used).
	 */

	public static void main(String[] args) {
		QuadraticFunction quadratic = new QuadraticFunction();
		quadratic.UploadData();
		quadratic.Calculate();
		quadratic.Results();
	}
}
