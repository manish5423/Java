package array;
import java.util.Arrays;
import java.util.Scanner;
public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		array of primitive datatype.
		int[] arr = new int[5];
		arr[0]=1;
		arr[1]=23;
		arr[2]=123;
		arr[3]=345;
		arr[4]=2333;
		
//		[1,23,123,345,2333]
//		System.out.println(arr[4]);
		
//		Input using forloop;
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
		
//	1.	display ouptput using Arrays.toString(arr);  { Internally this use the for loop}.
		
//		System.out.println(Arrays.toString(arr));
		
//	2.	display using for loop.
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
//	3.	iterate through for each loop.
//		for(int num: arr) {        // for every element in array ,print the element.
//			System.out.print(num+" ");   //here num represent elements of array.
//		}
		
//		System.out.println(arr[5]);    // indexoutofbound error.
		
//		Array of objects.
		String[] str = new String[5];
		for(int i=0;i<str.length;i++) {
			str[i]=sc.next();
		}
//		1 way to display
		for(String s:str) {
			System.out.print(s+" ");
		}
//		2.way to display.
		System.out.println(Arrays.toString(str));
		
//		modify.
		str[0]="Shyam";
		System.out.println(Arrays.toString(str));
		
		
	}
}
