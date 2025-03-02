package package1;

import java.util.Scanner;

public class palindromeprg {

	public static void main(String[] args) {
		
		        int number = 1221;

		        if (isPalindrome(number)) {
		            System.out.println(number + " is a palindrome.");
		        } else {
		            System.out.println(number + " is not a palindrome.");
		        }
		    }

		    // Function to check if a number is palindrome
		    public static boolean isPalindrome(int num) {
		        int originalNumber = num;
		        int reversedNumber = 0;

		        while (num != 0) {
		            int digit = num % 10;
		            reversedNumber = reversedNumber * 10 + digit;
		            num /= 10;
		        }

		        return originalNumber == reversedNumber;
		    }
		
		
		

}


