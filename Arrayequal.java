package com.studyopedia;
import java.util.Arrays;

public class Arrayequal {
	void meth1() 
	{
		int [] arr1 = {1,2,3,4};
		int [] arr2 = {1,2,3,4};
		
		boolean isEqual = Arrays.equals(arr1, arr2);
		System.out.println("arrays are equal:" + isEqual);
		
	}
	public static void main(String args[]) {
		Arrayequal obj = new Arrayequal();
		obj.meth1();
	}


}
