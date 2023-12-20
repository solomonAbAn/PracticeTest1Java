package PracticeTest2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.	Create a program to find the roots of a quadratic equation.

		// what's a quadric equation?
		// ax2 + bx + c = 0

		// roots:
		// x1 = (-b+√(b^2-4ac)) / 2a.
		// x2 = (-b-√(b^2-4ac)) / 2a.

		// 1)give me a b and c
		Scanner kb = new Scanner(System.in);

		// a
		System.out.println("give me a: ");
		double a = kb.nextDouble();

		// b
		System.out.println("give me b: ");
		double b = kb.nextDouble();

		// c
		System.out.println("give me c: ");
		double c = kb.nextDouble();

		// equation
		System.out.println("your quadratic equation is: " + a + "X2 " + b + "X " + c + " = 0");

		// roots
		double x1, x2;
		double delta = Math.pow(b, 2) - (4 * a * c);
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b - Math.sqrt(delta)) / (2 * a);
		if (delta <= 0) {
			System.out.println("complex solution");
		} else {

			System.out.println("X1 = " + x1 + " X2 = " + x2);
		}
		kb.close();
	}
	

}
