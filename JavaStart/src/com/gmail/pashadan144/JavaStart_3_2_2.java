package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_3_2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0, num2 = 0, num3 = 0;

		System.out.println("x = ");
		double x = sc.nextDouble();

		System.out.println("y = ");
		double y = sc.nextDouble();

		num1 = (0 - x) * (4 - 0) - (4 - 0) * (0 - y);
		num2 = (4 - x) * (1 - 4) - (6 - 4) * (4 - y);
		num3 = (6 - x) * (0 - 1) - (0 - 6) * (1 - y);

		if ((num1 >= 0 && num2 >= 0 && num3 >= 0) || (num1 <= 0 && num2 <= 0 && num3 <= 0)) {
			System.out.println("Point inside triangle");
		} else
			System.out.println("Point outside the triangle");
	}
	
}