package com.studyopedia;

public class Pyramind {
	void meth1() {
		int rows=6;
		for(int i=1; i<=rows; i++)
		{
		for( int j=i; j<rows; j++)
		{
		System.out.print(" ");
		}
		for (int k=1;k<=(2*i-1);k++){
		System.out.print("*");
		}
		System.out.println();
		}
		}
		public static void main (String[] args){
		Pyramind obj=new Pyramind();
		obj.meth1();

	}

}
