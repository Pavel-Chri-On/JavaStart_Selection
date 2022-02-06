package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_2_1_2 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x, a, b, c, p;

		System.out.println("Enter the value of the first side in cm -");
		a = scan.nextDouble();

		System.out.println("Enter the value of the second side in cm -");
		b = scan.nextDouble();

		System.out.println("Enter the value of the third side in cm -");
		c = scan.nextDouble();

		p = (a + b + c) / 2;

		x = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println("Answer: S=");
		System.out.println(x);

	}
}
