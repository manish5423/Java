package com.practice;
import java.util.Scanner;

public class Day_1 {

	public static void main(String[] args) {
//		Write a program to print whether a number is even or odd, also take input from the user.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number You want to check: ");
		int num = sc.nextInt();
		
		if(num % 2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}

}
