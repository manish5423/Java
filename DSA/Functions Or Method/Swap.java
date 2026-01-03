package com.manish;

public class Swap {

	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		
		//swap number code.
//		int temp = a;
//		a = b;
//		b = temp;
		swap(a,b); 
		
		System.out.print(a+" "+b);
	}
	static void swap(int a,int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}
