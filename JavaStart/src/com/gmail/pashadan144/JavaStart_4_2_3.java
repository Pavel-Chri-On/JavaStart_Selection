package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_4_2_3 {

	public static void main(String[] args) {

		System.out.print("Maximum width (odd number) - ");
		Scanner scan = new Scanner(System.in);
		int x = 0, c = 0, n = scan.nextInt();

		if (n % 2 == 1) {
			for (int i = 0; i < n; ++i) {
				c = x;
				for (int j = 0; j < (n - x); j++) {

					if (c > 0) {
						System.out.print(" ");
						c -= 1;
					} else {
						System.out.print("*");
					}
				}

				System.out.println("");

				if (i < n / 2) { 
					x += 1;
				} else { 
					x -= 1;
				}

			}

		} else {
			System.out.println("Number must be odd!!!");
		}
	}
}
