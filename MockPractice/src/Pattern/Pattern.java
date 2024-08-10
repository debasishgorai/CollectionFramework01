package Pattern;

public class Pattern {
	
	    public static void main(String[] args) {
	        int n = 5;
	        int[][] pattern = new int[n][n];
	        
	        // Generate the pattern
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                pattern[i][j] = (j+i) % n + 1;
	            }
	        }
	        
	        // Print the pattern
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(pattern[i][j]);
	            }
	            System.out.println();
	        }
	    }
	

}
