package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_3_1_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c;

		System.out.println("Side a =");
		a = scan.nextInt();

		System.out.println("Side b =");
		b = scan.nextInt();

		System.out.println("Side c =");
		c = scan.nextInt();

		if (a + b > c && a + c > b && c + b > a) {
			System.out.println("Such a triangle exists");
		} else {
			System.out.println("Such a triangle does not exist.");
		}
	}
}