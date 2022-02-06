package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_6_1_3 {
	public static void main(String[] args) {


		System.out.print("Width - ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.print("Length - ");
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();

		drawRectangle(a, b);

	}

	static void drawRectangle(int a, int b) {
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				if (i == 0 || i == b - 1 || j == 0 || j == a - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}

			}
			System.out.println();
		}
	}

}
