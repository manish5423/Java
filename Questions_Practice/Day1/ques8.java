package com.practice;
import java.util.Scanner;
public class ques8 {
	public static void main(String[] args) {
//		To find out whether the given String is Palindrome or not.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to Check palindrome: ");
		String name = sc.next();
		
//		String str = "";
//		
//		for(int i=name.length()-1;i>=0;i--) {
//			str = str+name.charAt(i);
//		}
//		System.out.println(str);
//		
//		if(name.equals(str)) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("Not palindrome");
//		}
		
		int left = 0;
		int right = name.length()-1;
		boolean isPalindrome = true;
		
		while(left < right) {
			if(name.charAt(left) != name.charAt(right)) {
				isPalindrome = false;
				break;
				
			}
			left++;
			right--;
			
		}
		
		if(isPalindrome==true) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		
		
		
	}
}
