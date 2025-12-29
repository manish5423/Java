package com.practice;
import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
//		Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Two Number to Do calculation: ");
		float num1,num2,sym;
		num1 = sc.nextFloat();
		num2 = sc.nextFloat();
		
		System.out.println("Enter operator = "
				+ "\n"
				+ "1. +\n"
				+ "2. -\n"
				+ "3. *\n"
				+ "4. /\n");
		sym = sc.nextInt();
		
		if(sym == 1) {
			System.out.println(num1+num2);
		}
		else if(sym == 2) {
			System.out.println(num1-num2);
		}
		else if(sym == 3) {
			System.out.println(num1*num2);
		}
		else if(sym == 4) {
			System.out.println(num1/num2);
		}
		else {
			System.out.println("You put wrong input please verify!!");
		}
		
		
		

	}

}
