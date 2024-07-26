package com.studyopedia;

public class fizzbuzz {
		void meth1()
		{
			int a=15;
			if((a%3==0)&(a%5==0))
			{
				System.out.println("fizzbuzz");
			}
			else
			{
				System.out.println(a);
			}
		}
		public static void main(String[] args) {
			fizzbuzz obj= new fizzbuzz();
			obj.meth1();
		}

	}

