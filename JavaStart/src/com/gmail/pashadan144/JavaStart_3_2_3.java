package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_3_2_3 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Four digit number -");
		int x = sc.nextInt();

		if (x >= 1000 && x <= 9999) {
			if (x / 1000 + x % 1000 / 100 == x % 100 / 10 + x % 10) {
				System.out.println("It's a lucky ticket");
			} else
				System.out.println("This is not a lucky ticket");

		} else {
			System.out.println("It's not a four digit number");
		}

	}

}