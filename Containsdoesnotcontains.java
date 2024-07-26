package com.studyopedia;

public class Containsdoesnotcontains {
	void meth1(){
		String str="How are you";
		System.out.println(str.contains("Ho"));
		System.out.println(str.contains("are"));
		System.out.println(!str.contains("hi"));
		System.out.println(str.contains("hi"));
		}
		public static void main (String[] args){
	    Containsdoesnotcontains obj=new Containsdoesnotcontains();
		obj.meth1();
		}


}
