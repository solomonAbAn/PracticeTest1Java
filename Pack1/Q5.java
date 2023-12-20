package Pack1;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//5.	Create a method to find the row with the maximum sum in a matrix.
		
		
		//method
		//find
		//row
		//maximum //sum
		//matrix
		
		
		
		
		//Find
		
		findMaxSumRow();
		
		
		
		
				
		
		
	}

	// the method

	public static void findMaxSumRow () {
		
		
		//the matrix
	    int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
	    
	    
	    //the method
	    int maxSum = matrix[0][0] + matrix[0][1]; 
	    int row = 0;
	    int i = 0;

	    for (i = 1; i < matrix.length; i++) {
	        int sum = matrix[i][0] + matrix[i][1];
	        if (maxSum < sum) {
	            maxSum = sum;
	            row = i;
	        }
	    }

	    System.out.println("Index Row with maximum sum: " + row);
	}
}
