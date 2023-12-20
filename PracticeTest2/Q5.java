package PracticeTest2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//5.	Create a method to find the frequency of a given element in a 2D array.

		// find
		// the frequency of a given element:the number of times it occurs in an array
		// 2D array

		// given element
		System.out.println("give me an element");
		Scanner kb = new Scanner(System.in);
		int element = kb.nextInt();
		kb.close();

		int[][] array = { { 2, 2 }, { 3, 4 }, { 3, 6 }, { 4, 8 }, { 5, 10 } };

		int i;
		int j;
		int k = 0;
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < 2; j++) {
				if (array[i][j] == element) {
					k++;
				}
			}
		}
		System.out.println("the frequency of " + element + " is " + k);

	}

}
