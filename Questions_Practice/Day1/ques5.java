package com.practice;
import java.util.Scanner;

public class ques5 {
	public static void main(String[] args) {
//		Take 2 numbers as input and print the largest number.
		
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1+" is Grater Then "+num2);
		}
		else{
			System.out.println(num2+" is Grater Then "+num2);
		}
		
	}
}
