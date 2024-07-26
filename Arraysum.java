package com.studyopedia;

public class Arraysum {
	void meth1() {
		int arr1[] = {1,2,3};
		int sum = 0;
		for(int i : arr1){
		sum += i;
		}
		System.out.println("sum of the elements:" +sum);
		}
		public static void main (String[] args){
		Arraysum obj=new Arraysum();
		obj.meth1();

	}

}
