package com.studyopedia;

public class Evenodd {
	void meth1(){
		int num=4;
		if(num%2==0)
		{
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
	}
	public static void main(String[] args) {
		new Evenodd().meth1();
}
}