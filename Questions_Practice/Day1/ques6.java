package com.practice;
import java.util.Scanner;
public class ques6 {
	public static void main(String[] args) {
//		Input currency in rupees and output in USD.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the rupees: ");
		double rupees = sc.nextDouble();
		
		double exchangerate = 89.92;
		double usd = rupees/exchangerate;
		System.out.printf("The Usd Output is : %.2f",usd);
		
	}
}
