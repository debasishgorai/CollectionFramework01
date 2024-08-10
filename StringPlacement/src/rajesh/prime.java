package rajesh;

public class prime {

	///public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	public class Main {
		    
		    // Function to check if a number is prime
		    public static boolean isPrime(int num) {
		        if (num <= 1) return false;
		        for (int i = 2; i <= Math.sqrt(num); i++) {
		            if (num % i == 0) return false;
		        }
		        return true;
		    }
		    
		    // Function to check if a number is a perfect square of a prime number
		    public static boolean isSquareOfPrime(int num) {
		        int sqrt = (int) Math.sqrt(num);
		        return sqrt * sqrt == num && isPrime(sqrt);
		    }
		    
		    // Function to reverse a number
		    public static int reverseNumber(int num) {
		        int reversed = 0;
		        while (num != 0) {
		            int digit = num % 10;
		            reversed = reversed * 10 + digit;
		            num /= 10;
		        }
		        return reversed;
		    }
		    
		    // Function to check if a number is a palindrome
		    public static boolean isPalindrome(int num) {
		        return num == reverseNumber(num);
		    }

		    public static void main(String[] args) {
		        int number = 121;//ven number which is a square of a prime number

		        if (isSquareOfPrime(number)) {
		            int reversedNumber = reverseNumber(number);
		            if (isSquareOfPrime(reversedNumber) && !isPalindrome(reversedNumber)) {
		                System.out.println("The number " + number + " is a square of a prime number.");
		                System.out.println("Its reverse " + reversedNumber + " is also a square of a prime number and not a palindrome.");
		            } else {
		                System.out.println("The reverse of the number is either not a square of a prime number or it is a palindrome.");
		            }
		        } else {
		            System.out.println("The number is not a square of a prime number.");
		        }
		    

	}

}
