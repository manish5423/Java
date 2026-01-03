package com.manish.Practice;
import java.util.Scanner;

public class Question1{

	public static void main(String[] args)
	{
		
//		Temperature change celcius calculator.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Celcius Temperature :");
		float temp = sc.nextFloat();
		
		float feh = ((temp*9)/5)+32;
		
		System.out.println("The fahrenheit Temperature :"+feh);
		
		
		
		
		
	}
}
