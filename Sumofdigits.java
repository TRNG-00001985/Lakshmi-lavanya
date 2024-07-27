package com.studyopedia;

public class Sumofdigits {
	    public static void main(String[] args) {
	        int number = 12345;
	        
	        int sum = sumOfDigits(number);
	        
	        System.out.println("Sum of digits of " + number + " is: " + sum);
	    }

	    public static int sumOfDigits(int number) {
	        int sum = 0;
	        
	        while (number != 0) {
	            sum += number % 10;
	            number /= 10;
	        }
	        
	        return sum;
	    }
	}
