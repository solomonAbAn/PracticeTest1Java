package PracticeTest2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3.	Implement a Java program that generates the Fibonacci series up to a specified limit. 
		//Create a method named `generateFibonacci` that takes an integer parameter (limit) and prints the Fibonacci series up to that limit. 
		//In the `main` method, test the function with different limits.
		
		
		
		
		//fibonacci
		//specified limit
		//mthod: generateFibonacci
		//Scanner int
		//test with different limits
		
		
		
		
		//main method
		
		
		
		Scanner kb = new Scanner(System.in);
		System.out.println("give me the fibonacci sequence limit ");
		int limit = kb.nextInt();
		kb.close();
		
		
		generateFibonacci(limit);
		
		
		
	}
	
	
	
	
	//method
	
	public	static	void generateFibonacci(int limit) {
		
		
		//for(i=1; i<=limit; i++)
		//fib = i + (i--);
		//sysout fib
		
		
	 
		int i;
		int fib2;
		int fib1;
		for (i=1; i<=limit; i++) {
			fib2 = fib1 + fib2;
			System.out.print(fib2 + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
