package com.studyopedia;

public class Reverse {
	void meth1() {
		System.out.println("Reverse of string");
		String str = "Lavanya";
		String rev="";
		{
			for(int i=str.length()-1;i>=0;i--) {
				rev+=str.charAt(i);
			}
		}
		System.out.println(rev);
	}
	public static void main(String args[]) {
		Reverse obj = new Reverse();
		obj.meth1();
	}


}
