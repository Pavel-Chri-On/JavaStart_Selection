package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_4_1_1 {

	/*
	 * 1) С помощью циклов нарисовать «обои». Причем количество полос должно
	 * вводиться с клавиатуры. В примере 7 полос.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x;

		System.out.println("Количество полос - ");
		x = scan.nextInt();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < x; j++) {
				if (j % 2 == 0) {
					System.out.print("***");
				} else {
					System.out.print("+++");
				}
			}
			System.out.println();
		}
	}
}