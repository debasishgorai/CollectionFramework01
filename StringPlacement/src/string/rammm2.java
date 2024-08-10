package string;

public class rammm2 {
	
	    public static void main(String[] args) {
	        int[] array = {0, 1, 0, 1, 1, 0, 0, 1, 0, 1}; // Example array
	        separateZeroesAndOnes(array);
	        for (int i : array) {
	            System.out.print(i + " ");
	        }
	    }

	    public static void separateZeroesAndOnes(int[] array) {
	        int left = 0;
	        int right = array.length - 1;

	        while (left < right) {
	            while (array[left] == 0 && left < right) {
	                left++;
	            }

	            while (array[right] == 1 && left < right) {
	                right--;
	            }

	            if (left < right) {
	                // Swap array[left] and array[right]
	                int temp = array[left];
	                array[left] = array[right];
	                array[right] = temp;
	                left++;
	                right--;
	            }
	        }
	    }
	}

