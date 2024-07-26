package com.studyopedia;

public class Swap {
	void meth1() {
		int a= 4;
		int b=5;
		a=a^b;
		b=b^a;
		a=a^b;
		System.out.println("values of a , b:" +a+" "+b);	
	}
	public static void main(String[] args) {
		Swap obj = new Swap();
		obj.meth1();
	}


}
