package com.practice;
import java.util.Scanner;
import java.util.Scanner;
public class ques9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start + 1; i < end; i++) {
            if (arms(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean arms(int n) {

        int original = n;   
        int count = 0;
        int ns = n;

        while (ns != 0) {
            ns = ns / 10;
            count++;
        }

        int res = 0, rem;
        while (n != 0) {
            rem = n % 10;
            n = n / 10;
            res = res + (int) Math.pow(rem, count);
        }

        return res == original; 
    }
}
