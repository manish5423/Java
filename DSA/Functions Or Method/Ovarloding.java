package com.manish;

public class Ovarloding {

	public static void main(String[] args) {
		fun(1,23);
	}
	
	static void fun(int nam) {
		System.out.println(nam);
	}
	
	
	static void fun(int nam,int nam1) {
		System.out.println(nam+nam1);
	}
}
