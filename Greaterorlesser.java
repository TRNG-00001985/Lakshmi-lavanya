package com.studyopedia;

public class Greaterorlesser {
	void meth1(){
		int a=35;
		int b=25;
		int c=40;
		if((a>b)&& (a>c)){
		System.out.println(a);
		}
		else if((b>a) && (b>c)){
		System.out.println(b);
		}
		else{
		System.out.println(c);
		}
		}
		public static void main (String[] args){
			Greaterorlesser obj=new Greaterorlesser();
			obj.meth1();
		}


}
