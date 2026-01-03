package com.day2;
import java.util.Scanner;

public class CaseType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().trim().charAt(10);
		
//		if(ch > 'a' && ch <'z') {
//			System.out.print("Lower case");
//		}
//		else {
//			System.out.print("Upper Case");
//		}
		
		System.out.println(ch);
		
	}
}
