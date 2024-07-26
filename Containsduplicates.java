package com.studyopedia;

public class Containsduplicates {
	void meth1() {
		String s = "funnnn";
		for (int i =1; i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(i==j)
					System.out.println(i);
			}
		}
	}
	public static void main(String args[]) {
		Containsduplicates obj = new Containsduplicates();
		obj.meth1();
	}
}
