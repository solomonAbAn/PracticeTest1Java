package PracticeTest3;

import java.net.PortUnreachableException;
import java.util.Random;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.	Implement a program to calculate the average of each column in a matrix.
		
		
		
		
		
		//average
		//each column
		//matrix
		
		
		
		//average = matrix[0][1] + martrix[0][2] + matrix [0][3]
		
		
		//matrix
		  Random rd = new Random();
	        int[][] matrix = {
	                {rd.nextInt(100), rd.nextInt(100)},
	                {rd.nextInt(100), rd.nextInt(100)},
	                {rd.nextInt(100), rd.nextInt(100)}
	        };

	        // Print each row of the matrix
	        for (int[] row : matrix) {
	            for (int element : row) {
	                System.out.print(element + " ");
	            }
	            System.out.println();  // Move to the next line after printing each row
	        }

	        // Calculate the average of each column
	        int[] columnSums = new int[matrix[0].length];
	        int[] columnCounts = new int[matrix[0].length];

	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                columnSums[j] += matrix[i][j];
	                columnCounts[j]++;
	            }
	        }

	        System.out.println("\nAverage of each column:");

	        for (int k = 0; k < columnSums.length; k++) {
	            double average = (double) columnSums[k] / columnCounts[k];
	            System.out.println("Column " + (k + 1) + ": " + average);
	        }
	    }
	}