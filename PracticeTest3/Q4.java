package PracticeTest3;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		* * * * * 
//		 * * * * 
//		  * * * 
//		   * * 
//		    * 
//		    * 
//		   * * 
//		  * * * 
//		 * * * * 
//		* * * * * 

		int totalLines = 10;
		// Print upper half of the pattern
		for (int line = 1; line <= totalLines / 2; line++) {
			// Print leading spaces
				for (int space = 1; space < line; space++) {
				System.out.print(" ");
					}
	
				// Print stars
			for (int star = totalLines / 2; star >= line; star--) {
				System.out.print("* ");
			}
	
				System.out.println();
		}
		
		// Print lower half of the pattern
		for (int line = 1; line <= totalLines / 2; line++) {
			// Print leading spaces
			for (int space = totalLines / 2; space > line; space--) {
						System.out.print(" ");
			}
			
			// Print stars
			for (int star = 1; star <= line; star++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}