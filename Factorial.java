package com.studyopedia;

public class Factorial {
	void meth1(int n)
	{
		int res = 1;
		for(int i=1;i<=n;i++)
		{
			res = res*i;
		}
		System.out.println("factorial of " + n +" is " + res);
	}
	public static void main(String[] args)
	{
		new Factorial().meth1(5);;
	}
}
