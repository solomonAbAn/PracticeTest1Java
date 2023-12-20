package Pack1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2.	Create a program to print the multiplication table of a number using a for loop.
		
		
		
		
		//Scanner
		//int
		//for loop
		//Multiplication: till 10
		
		
		//question
		System.out.println("multiplication table: please give me an integer");
		Scanner kb = new Scanner(System.in);
		int numb = kb.nextInt();
		int i;
		int result;
		
		
		//Table
		System.out.println("");
		System.out.println("the multiplication table (till 10) of " + numb + " is:");
		System.out.println("");
		for(i=1; i<11; i++) {
			result = numb * i;
			System.out.println(numb + " x " + i + " = " + result);
			System.out.println("");
		}
		
		kb.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
