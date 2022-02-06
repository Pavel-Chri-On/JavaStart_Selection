package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_3_1_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year;

		System.out.println("Enter year -");
		year = scan.nextInt();
		
		if ((year % 4) == 0 && (year % 100) > 0) {
			System.out.println("Leap year, 366 days");
		} else if ((year % 400) == 0) {
			System.out.println("Leap year, 366 days");
		} else {
			System.out.println("Non-leap year, 365 days");
		}

	}
}