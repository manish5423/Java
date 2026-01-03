package array;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 1 2 3
		 4 5 6
		 7 8 9 
		  
		  
		 */
		
//     	int [][] arr = new int[3][];  // here size of row compulsory to provide and column is optional.
//		or hard code.
		int [][] arr1 = {
				{1,2,3},  // 0th index
				{4,5,6},  // 1st index
				{7,8,9}  // 2nd index 
		};
		
		int [][] arr = new int[3][3];
		//System.out.println(arr.length);  // Number of rows = here 3.
		
//		input in 2d array.
		for(int row=0;row<arr.length;row++) {
			// for each col in every row
			for(int col=0;col<arr[row].length;col++) {
				arr[row][col]=sc.nextInt();
			}
		}
		
//		display of 2D Array.
//		1.Method 
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
//		2.Method
		for(int row = 0;row<arr.length;row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
//	3.Method Using for each loop.	
		for(int[] a: arr) {
			System.out.println(Arrays.toString(a));
		}
		
	}
}
