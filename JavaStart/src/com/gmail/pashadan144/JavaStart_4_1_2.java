package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_4_1_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Number n -");
		int n = scan.nextInt();
		int factorial = n;

		if (4 < n && n < 16) {
			System.out.print(n + "!=" + n);
			for (int i = 1; i < n; i++) {
				factorial = factorial * (n - i);
				System.out.print("*" + (n - i));
			}
			System.out.print("=" + factorial);
		} else {
			System.out.println("!!! 4<n<16 !!!");
		}
	}
}