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
				System.out.println("Entrance �1");
			} else if (N < 73) {
				System.out.println("Entrance �2");
			} else if (N < 109) {
				System.out.println("Entrance �3");
			} else if (N < 145) {
				System.out.println("Entrance �4");
			}

			x = N % 36 / 4;

			if (0 < x && x <= 1) {
				System.out.println("Floor �1");
			} else if (0 < x && x <= 2) {
				System.out.println("Floor �2");
			} else if (0 < x && x <= 3) {
				System.out.println("Floor �3");
			} else if (0 < x && x <= 4) {
				System.out.println("Floor �4");
			} else if (0 < x && x <= 5) {
				System.out.println("Floor �5");
			} else if (0 < x && x <= 6) {
				System.out.println("Floor �6");
			} else if (0 < x && x <= 7) {
				System.out.println("Floor �7");
			} else if (0 < x && x <= 8) {
				System.out.println("Floor �8");
			} else if (x <= 9) {
				System.out.println("Floor �9");
			}
		} else {
			System.out.println("This apartment does not exist.");
		}

	}
}