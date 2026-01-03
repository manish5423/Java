package array;

import java.util.Arrays;
import java.util.Scanner;

public class Passbyfunction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = {1,2,34,45};
		System.out.println(Arrays.toString(num));
		change(num);
		System.out.println(Arrays.toString(num));
	}
	static void change(int[] arr) {
		arr[0]=999;
	}
}
