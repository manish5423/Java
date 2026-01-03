package com.manish;
import java.util.*;

public class Sum {
	
	public static void main(String[] args) {
		//sum();  // call of the function.
		
//		int ans = sum2();  //use of return type method.
//		System.out.println(ans);
		
		int ane = sum3(67,80);
		System.out.print(ane);
	}
	
	// pass value of the numbers when you are calling the method in main(
	
	static int sum3(int a,int b) {
		int sum = a+b;
		return sum;
	}
	
//	This is the method of sum in java.
	static void sum() {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		
		System.out.print("Enter Number 1:");
	    num1=sc.nextInt();
		
		System.out.print("Enter Number 2:");
		num2=sc.nextInt();
		System.out.print("The sum of num1 and num2 is:"+(num1+num2));
		
	}
	
	
	static int sum2() {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		
		System.out.print("Enter Number 1:");
	    num1=sc.nextInt();
		
		System.out.print("Enter Number 2:");
		num2=sc.nextInt();
		return num1+num2;
		
	}
	
	/*
	 * 
	  return_type name(){
	    // body
	    return statement;
	   }
	   
	 */
}
