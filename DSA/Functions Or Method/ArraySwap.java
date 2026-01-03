package com.manish;

import java.util.Arrays;

public class ArraySwap {
 public static void main(String[] args) {
	 int arr[] = {1,2,3,4,5,6};
	 change(arr);
	 System.out.print(Arrays.toString(arr));
 }
  static void change(int [] nums) {
	  nums[0] = 99;
  }
}
