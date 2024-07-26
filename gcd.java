package com.studyopedia;

public class gcd {
	void meth1() {
		int hcf=0, num1=10,num2=30;
		for(int i=1;i<=num1 || i<=num2;i++)
		{
			  if (num1 % i == 0 && num2 % i == 0)
			        hcf = i;
			      }
			    System.out.println("The HCF: "+ hcf);
			  }
public static void main(String args[]) {

	gcd obj = new gcd();

	obj.meth1();

}

}


