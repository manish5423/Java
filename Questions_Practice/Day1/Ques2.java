package com.practice;
import java.util.Scanner;
public class Ques2 {

	public static void main(String[] args) {
	//	Take name as input and print a greeting message for that particular name.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = sc.nextLine();
		
		System.out.println("Hello "+name);
		sc.close();

	}

}
