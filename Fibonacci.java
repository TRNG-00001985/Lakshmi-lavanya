package com.studyopedia;

public class Fibonacci {
	    public static void main(String[] args) {
	        int count = 10; // Number of Fibonacci numbers to generate
	        generateFibonacciSeries(count);
	    }

	    public static void generateFibonacciSeries(int count) {
	        int num1 = 0, num2 = 1;

	        System.out.print("Fibonacci Series of " + count + " numbers: ");
	        for (int i = 1; i <= count; ++i) {
	            System.out.print(num1 + " ");

	            // Compute the next term
	            int nextNum = num1 + num2;
	            num1 = num2;
	            num2 = nextNum;
	        }
	    }
	}
