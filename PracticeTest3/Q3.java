package PracticeTest3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3.	Write a Java program that calculates the power of a number. 
		//Define a method named `calculatePower` that takes two parameters (base and exponent) and returns the result. 
		//In the `main` method, test the function with different base and exponent values.
		
		
		
		
		
		//calculate
		//power of a number
		System.out.println("give me a number ");
		Scanner kb = new Scanner(System.in);
		double base = kb.nextDouble();
		System.out.println("give me the exponent ");
		double exponent = kb.nextDouble();
		
		double result = calculatePower(base, exponent);
		System.out.println("the result is " + result);
		
		
		
		
	}

	
	public static double calculatePower(double base, double exponent) {
	
		return  Math.pow(base, exponent);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
