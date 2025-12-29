package com.practice;
import java.util.Scanner;
public class Ques3 {

	public static void main(String[] args) {
//		Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your principal,time[Year] and rate respectively: ");
		int principal = sc.nextInt();
		int time = sc.nextInt();
		float rate = sc.nextFloat();
		
		double si = (principal*rate*time)/100;
		
		System.out.println("The Simple Interest of the given Data is : "+si);
		
		
		
	}

}
