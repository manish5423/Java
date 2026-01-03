package com.manish;
import java.util.Scanner;

public class Stringss {

	public static void main(String[] args) {
//		String msg = greet();
//		System.out.print(msg);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you name:");
		String naam = sc.next();
		String personalised = great(naam);
		System.out.println(personalised);
		
		
		
	}
	// use of arguments.
	static String great(String name){
		String na = "Hello "+ name;
		return na;
	}
	
	//without arguments.
	static String greet() {
		 String greeting = "How are you ?";
		return greeting;
	}
}
