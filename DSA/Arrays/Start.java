package array;

import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		store roll no.
		int roll = 12;
//		store name.
		String name = "Manish";
		
//		now store 5 roll no.
		int a = 21;
		int a1 = 2;
		int a2 = 23;
		int a3 = 24;
		int a4 = 25;
		
//		if i say store 5000 roll no then this concept failed and comes new concept of Known as Array.
//		Syntax
//		data_type [] variable_name = new data_type[size];
		
		int [] roll_no = new int[5];
//		or directly.
		int [] roll_no1 = {1,2,34,5,65};
		

//        int[] ros; // declaration of array. ros is getting defined in the stack
//        ros = new int[5]; // initialisation: actually here object is being created in the memory (heap)
		
		String[] str = new String[4];
		System.out.println(str[0]);  // if you donot put any value in String array by default it will take null value to all it indexes eg.( [null,null,null,null]);
		
//		if same thing do with int array it stored 0 as default value eg.( [0,0]) to down example.
		int [] arr2 = new int[2];
		System.out.println(arr2[0]);
		
	}
}
