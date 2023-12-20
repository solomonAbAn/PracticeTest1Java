package Pack1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//4.	h. (it should be odd number)
//	     * 
//	    *** 
//	   *****
//	  *******
//	 *********
//	  *******
//	   *****
//	    ***
//	     * 
		
		        int lines = 9;

		        for (int i = 1; i <= lines; i += 2) {
		            // Print spaces
		            for (int j = 0; j < (lines - i) / 2; j++) {
		                System.out.print(" ");
		            }

		            // Print asterisks
		            for (int k = 0; k < i; k++) {
		                System.out.print("*");
		            }

		            System.out.println();
		        }

		        for (int i = lines - 2; i >= 1; i -= 2) {
		            // Print spaces
		            for (int j = 0; j < (lines - i) / 2; j++) {
		                System.out.print(" ");
		            }

		            // Print asterisks
		            for (int k = 0; k < i; k++) {
		                System.out.print("*");
		            }

		            System.out.println();
		        }
		    }
		}