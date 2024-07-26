package com.studyopedia;

public class leapyear {
	void meth1()
	{
		int a=2024;
		if(a%4==0) {
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
	}
	public static void main(String[] args) {
		leapyear obj = new leapyear();
		obj.meth1();
	}
}

