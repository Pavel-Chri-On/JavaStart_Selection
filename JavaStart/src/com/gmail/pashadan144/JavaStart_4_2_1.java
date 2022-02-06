package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_4_2_1 {

	/*
	 * 1) С помощью цикла (только одного) нарисовать такую фигуру. Причем
	 * максимальная высота этой фигуры вводиться с клавиатуры (в примере
	 * максимальная высота - 4)
	 */

	public static void main(String[] args) {

		System.out.print("Максимальная высота - ");
		Scanner scan = new Scanner(System.in);
		int x = 0, a = 0, c = 1, n = scan.nextInt();

		for (int i = 0; i < n * 2;) {
			if (c == x) {
				System.out.println("");
				i += 1;
				x = 0;
				if (a == 1) {
					c -= 1;
				} else {
					c += 1;
				}
			} else {
				System.out.print("*");
				x += 1;
				if (c == n) {
					a = 1;
				}

			}

		}

	}

}
