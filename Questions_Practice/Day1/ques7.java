package com.practice;
import java.util.Scanner;

public class ques7 {
	public static void main(String[] args) {
//		To calculate Fibonacci Series up to n numbers.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index to print series: ");
		int num = sc.nextInt();
		
		int first,second,start;
		first = 0;
		second = 1;

		System.out.println("This is the Fibonnaci series upto "+num+": ");
		System.out.print(first+" ");
		System.out.print(second+" ");
		
		for(int i = 3;i<=num;i++) {
			
			start = first+second;
			first = second;
			second = start;
			System.out.print(start+" ");
			
			
		}
		
	}
}
