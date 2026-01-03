package com.day2;
import java.util.Scanner;
public class Count {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	//	Count the Number(check) how many time it comes into number (n);
		int n= sc.nextInt();
		int check = sc.nextInt();
		int count=0;
		while(n!=0) {
			
			int rem = n%10;
			if(rem == check) {
				count++;
			}
			n=n/10;
			
			
		}
		System.out.println(count);
		

		
	}
}
