package com.gmail.pashadan144;

public class JavaStart_6_2_2 {
	/*
	 * 2) Число-палиндром с обеих сторон (справа налево и слева направо) читается
	 * одинаково. Самое большое число-палиндром, полученное умножением двух
	 * двузначных чисел – 9009 = 91 × 99. Найдите самый большой палиндром,
	 * полученный умножением двух трехзначных чисел.
	 */

	public static void main(String[] args) {
		int x = 999;

		System.out.println(palindrome(x));

	}

	static int palindrome(int x) {
		int y = 0, z = 0;
		for (int i = 0; i < x; i++) {
			y = x * x - i;
			if (reverse(y) == y) {
				z = i;
				break;
			}
		}
		System.out.println(y + " = "+ x + " × " + (x - z));
		return y;

	}

	static int reverse(int num) {
		int reversed = 0;
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;

			num /= 10;
		}
		return reversed;

	}
}
