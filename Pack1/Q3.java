package Pack1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//3.	Create a Java program that validates passwords based on certain criteria. 
		//Define a method named `isPasswordValid` that takes a string parameter (password) and returns a boolean indicating whether the password is valid. 
		//In the `main` method, test the function with different passwords.
		
		Scanner kb = new Scanner(System.in);

        System.out.println("Enter a password to validate:");
        String password = kb.nextLine();

        if (isPasswordValid(password)) {
            System.out.println("Password is valid!");
        } else {
            System.out.println("Password is invalid!");
        }
        kb.close();
    }

	

    // Validate password based on certain criteria
    public static boolean isPasswordValid(String password) {
        // Minimum length check
        if (password.length() < 8) {
            return false;
        }

      

        // If all criteria are met, the password is considered valid
        return true;
    }
	
    
}
