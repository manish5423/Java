package com.manish;
import java.util.Scanner;

public class Calculator {
	    public static void main(String[] args1) {
	    	Scanner in = new Scanner(System.in);
	    	System.out.println("Enter The Two Number To Do Calculations: ");
	    	Float number1 = in.nextFloat();
	    	Float number2 = in.nextFloat();
	    	
	    	// calculator program;
	    	
	    	float sum = number1+number2;
	    	float multi = number1*number2;
	    	float div = number1/number2;
	    	float remi = number1%number2;
	    	float sub = number1-number2;
	    	
	    	System.out.print("***********************The Calculated Result Of Two Number Is That************************");
	    	System.out.println("The Sum Of Two Number is:"+sum); 	
	    	System.out.println("The Subtract Of Two Number is:"+sub);
	    	System.out.println("The Multiply Of Two Number is:"+multi);
	    	System.out.println("The Divide Of Two Number is:"+div);
	    	System.out.println("The Remiander Of Two Number is:"+remi);

	    	System.out.print("*******************************************************************************************");
	    	
	    	
	    	
	    }
}
