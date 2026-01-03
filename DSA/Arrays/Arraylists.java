package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylists {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	 ArrayList<Integer> list = new ArrayList<Integer>(5);
	 
//	 list.add(67);
//	 list.add(23);
//	 list.add(12);
//	 list.add(67);
//	 list.add(23);
//	 System.out.println(list.removeLast());
//	 System.out.println(list);
	 
//	 input in Arraylist
	 for(int i=0;i<5;i++) {
		 list.add(sc.nextInt());
	 }
//	 display of array list.
	 for(int i =0;i<5;i++) {
		 System.out.print(list.get(i)+",");  // pass index here, list[index] syntax will not work here
	 }
}
}
