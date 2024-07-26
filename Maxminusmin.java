package com.studyopedia;

public class Maxminusmin {
	void meth1() {
		int[] numbers = {1,2,-1,3,4,6};
		int max=numbers[0];
		int min=numbers[0];
		for(int i=1; i<numbers.length;i++){
		if (numbers[i]>max){
		max = numbers[i];
		}
		if (numbers[i]<min){
		min = numbers[i];
		}
		}
		System.out.println("maximun vlaue:"+max);
		System.out.println("minimun vlaue:" +min);
		System.out.println(max-min);
		}
		public static void main (String[] args){
	    Maxminusmin obj=new Maxminusmin();
		obj.meth1();
		}

	}
