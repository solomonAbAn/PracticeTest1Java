package Pack1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Create a program to check if a number is even, odd, or prime using else-if
		// statements.

		// check number
		Scanner kb = new Scanner(System.in);
		System.out.println("please give me a positive integer and i will check if it is even, odd, or prime");
		int numb = kb.nextInt();

		// Negative number
		if (numb < 0) {
			System.out.println("please give me a positive number");
			System.exit(0);
		}

		// checking
		checkEven(numb);
		checkPrime(numb);
		kb.close();
	}

	// even or odd
	public static void checkEven(int numb) {

		if (numb % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

	// prime

	public static void checkPrime(int numb) {
		int i;
		for (i = 2; i < (numb / 2); i++) {
			if (numb % i == 0) {
				System.out.println("not prime");
				System.exit(0);

			}
		}
		System.out.println("Prime");
	}

}
