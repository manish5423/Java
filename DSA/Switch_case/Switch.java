package com.manish;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
//		switch (name) {
//		case "Ram":
//			System.out.print("Hello Ram Bhai");
//			break;
//		case "Shyam":
//			System.out.print("Hello Shyam Bhai");
//			break;
//		case "Manish":
//			System.out.print("Hello Manish Bhai");
//			break;
//		case "Radha":
//			System.out.print("Hello Radha Behen");
//			break;
//		default:
//			System.out.print("Please Enter the Correct Name");
//		
//		}
		
		 
		// Better Way to write The same switch case in new format.
		switch (name) {
		case "Ram" -> System.out.print("Hello Ram Bhai");
		case "Shyam" -> System.out.print("Hello Shyam Bhai");
		case "Manish" -> System.out.print("Hello Manish Bhai");
		case "Radha" -> System.out.print("Hello Radha Behen");
		default -> System.out.print("Please Enter the Correct Name");
		
		}
		
		
	}
}
