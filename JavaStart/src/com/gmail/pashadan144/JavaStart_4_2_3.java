package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_4_2_3 {

	/*
	 * 3) Выведите на экран «песочные часы» максимальная ширина которых считывается
	 * с клавиатуры (число нечетное). В примере ширина равна 5.
	 */

	public static void main(String[] args) {

		System.out.print("Максимальная ширина (число нечетное) - ");
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

				if (i < n / 2) { /* Первая часть часов */
					x += 1;
				} else { /* Вторая часть часов */
					x -= 1;
				}

			}

		} else {
			System.out.println("Число должно быть нечетным!!!");
		}
	}
}
