package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_2_1_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x, r;

		System.out.println("Enter the radius of the circle -");
		r = scan.nextDouble();

		x = 2 * Math.PI * r;

		System.out.println("Answer: L=");
		System.out.println(x);

	}
}