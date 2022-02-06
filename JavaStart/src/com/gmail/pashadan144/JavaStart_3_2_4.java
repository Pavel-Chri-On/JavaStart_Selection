package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_3_2_4 {

	/*
	 * 4) — клавиатуры вводитьс€ шестизначное число. ѕроверить, €вл€етс€ ли оно
	 * палиндромом. ѕримечание: палиндромом называетс€ число, слово или текст,
	 * которые одинакового читаютс€ слева направо и справа налево. Ќапример, это
	 * числа 143341, 5555, 7117 и т. д.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x, number1, number2, number3, number4;

		System.out.println("Ўестизначное число - ");
		x = scan.nextInt();

		if (x > 100000 && x < 999999) {

			number1 = x / 1000;
			number2 = x % 1000 / 100;
			number3 = x % 100 / 10;
			number4 = x % 10;

			if (number1 == number4 * 100 + number3 * 10 + number2) {
				System.out.println("Ёто палиндром");
			} else {
				System.out.println("Ёто не палиндром");
			}

		} else {
			System.out.println("Ёто не шестизначное число");
		}
	}
}