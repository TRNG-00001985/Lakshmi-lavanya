package com.studyopedia;

public class Combinearrays {
	void meth1() {
		int array1[]= {1,4,2};
		int array2[] = {2,5,6};
		int combinedArray[]=new int[array1.length+array2.length];
		for(int i=0;i<array1.length;i++){
		combinedArray[i]=array1[i];
		}
		for(int i=0;i<array2.length;i++){
		combinedArray[array1.length+i]=array2[i];
		}
		for(int i:combinedArray){
		System.out.print(i+" ");
		}
		}
		public static void main (String[] args){
			Combinearrays obj= new Combinearrays();
			obj.meth1();

	}

}
