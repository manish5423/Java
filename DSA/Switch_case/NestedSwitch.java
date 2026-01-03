package com.manish;
import java.util.Scanner;

public class NestedSwitch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int no = sc.nextInt();
		String dep = sc.next();
		
		switch (no) {
		case 1:
			System.out.print("Hello Manish Welcome");
			break;
		case 2:
			System.out.print("Hello Ram Welcome");
			break;
		case 3:
			System.out.println("Employee Number 3");
			switch (dep) {
			case "IT":
				System.out.print("Welcome To IT Department");
				break;
			case "Mechanical":
				System.out.print("Welcome to Mechanical Department");
				break;
			default:
				System.out.print("Please Enter the correct Department");
			}
			
		break;
		default:
			System.out.print("Please Enter the Correct Number");
		}
		
	}
}
