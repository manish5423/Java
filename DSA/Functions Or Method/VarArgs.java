package com.manish;

import java.util.Arrays;

public class VarArgs {
  public static void main(String[] args) {
	  //fun(2,2,34,23,23,1,2,23);
	 // multiple(2,3,"Rahul","manish");  //sequence should be in mind.
	  
	 // demo("manish","syhas");
	  //demo();  but at here this demo cannot decide at the compile that whic demo should be run .
  }
  
  static void demo(int ...v) {
	  System.out.println(Arrays.toString(v));
  }
  
  static void demo(String ...v) {
	  System.out.println(Arrays.toString(v));
  }
  
  
  
  
  static void multiple(int a,int b,String ...v) {
	  System.out.println(Arrays.toString(v));
  }
  
  static void fun(int ...v) {
	  System.out.println(Arrays.toString(v));
  }
}
