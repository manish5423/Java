package com.day2;
import java.util.Scanner;

public class Largest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1= sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
//		if(num1 >num2) {
//			if(num1 >num3) {
//				System.out.print(num1);
//			}
//			else{
//				System.out.print(num3);
//			}
//		}
//			else if(num2> num1) {
//				if(num2> num3) {
//					System.out.print(num2);
//				}
//				else {
//					System.out.print(num3);
//				}
//			}
		
		int max = num1;
		if(num2>max) {
			max=num2;
		}
		else {
			max=num3;
		}
			System.out.print(max);	
			
		
		
	}
}
