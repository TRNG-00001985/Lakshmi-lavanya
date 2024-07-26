package com.studyopedia;

public class Average {
	void meth1() {
		int arr1[] = {4,6,8};
		int sum = 0,count=0;
		for(int i : arr1){
		sum += i;
		}
		System.out.println("sum of the elements:" +sum);
		count = arr1.length;
		System.out.println("Avg:" +sum/count);
		}
		public static void main (String[] args){
		Average obj=new Average();
		obj.meth1();

	}

}
