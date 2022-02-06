package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_3_1_2 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N, x;

		System.out.println("Apartment number -");
		N = scan.nextInt();

		if (N > 0 && N < 145) {
			if (N < 37) {
				System.out.println("Entrance ¹1");
			} else if (N < 73) {
				System.out.println("Entrance ¹2");
			} else if (N < 109) {
				System.out.println("Entrance ¹3");
			} else if (N < 145) {
				System.out.println("Entrance ¹4");
			}

			x = N % 36 / 4;

			if (0 < x && x <= 1) {
				System.out.println("Floor ¹1");
			} else if (0 < x && x <= 2) {
				System.out.println("Floor ¹2");
			} else if (0 < x && x <= 3) {
				System.out.println("Floor ¹3");
			} else if (0 < x && x <= 4) {
				System.out.println("Floor ¹4");
			} else if (0 < x && x <= 5) {
				System.out.println("Floor ¹5");
			} else if (0 < x && x <= 6) {
				System.out.println("Floor ¹6");
			} else if (0 < x && x <= 7) {
				System.out.println("Floor ¹7");
			} else if (0 < x && x <= 8) {
				System.out.println("Floor ¹8");
			} else if (x <= 9) {
				System.out.println("Floor ¹9");
			}
		} else {
			System.out.println("This apartment does not exist.");
		}

	}
}