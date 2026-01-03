package com.day2;
import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int start = 0;
		int first = 1;
		int current = 0;
		for(int i=2;i<=n;i++)
		{
		 current = start+first;
		 start = first;
		 first = current;
		}
		
//		System.out.print(start+" ");
//		System.out.print(first+" ");
//		
//		for(int i=2;i<n;i++){
//			
//			 current = start+first;
//			 start = first;
//			 first = current;
//			 
//			 System.out.print(current+" ");
//			 
//		}
		
		
		System.out.println(current);
		
	}
}
