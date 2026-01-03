package com.day2;
import java.util.Scanner;
public class Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		For Loop Syntax.
		/*
		  for(intilization;condition;increment/Decrement){
		  
		   //body
		   
		   }
		 */
		
//		Q1.Print the number from 1 to 10;
//		for(int num = 1;num<=5;num++) {
//			System.out.print(num+" ");
//		}
		
//		for(int i=0;i<10;i++) {
//			System.out.println("Hello Everyone");
//		}
		
		// ******While Syntax*************
		/*
		 * 
		while(condition) {
			// body.
		}
		use it when we do not know the iteration to run.
		
		*/
	
//		int num=1;
//		while(num<=5) {
//			System.out.println(num);
//			num++;
//		}
		
//		Do while loop use it when you want to run the loop atleast one time;
		/*
		  do{
		    // body
		  }while(condition);
		 */
		
		
//		int n=1;
//		do {
//			System.out.println(n);
//			n++;
//		}while(n<=5);
		
		
		int n=1;
		do {
			System.out.println(n);
			n+=2;
		}while(n ==0);
		
		
		
	}
}
