package occurence;

public class cccccc {
	//public class MaxCharOccurrence {
	    public static void main(String[] args) {
	        String str = "exampleppppppppstring";
	        System.out.println("Maximum occurring character: " + getMaxOccurringChar(str));
	    }

	    public static char getMaxOccurringChar(String str) {
	        if (str == null || str.length() == 0) {
	            throw new IllegalArgumentException("Input string cannot be null or empty");
	        }

	        // Assuming the input string only contains ASCII characters
	        int[] charCount = new int[256];

	        for (int i = 0; i < str.length(); i++) {
	            charCount[str.charAt(i)]++;
	        }

	        int maxCount = -1;
	        char maxChar = ' ';

	        for (int i = 0; i < str.length(); i++) {
	            if (charCount[str.charAt(i)] > maxCount) {
	                maxCount = charCount[str.charAt(i)];
	                maxChar = str.charAt(i);
	            }
	        }

	        return maxChar;
	    }
	//}

}
