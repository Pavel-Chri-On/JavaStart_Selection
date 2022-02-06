package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_5_2_3 {

	public static void main(String[] args) {
		String[] array = new String[] { "", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ",
				"nine ", "ten ", "eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ",
				"eighteen ", "nineteen ", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ",
				"ninety " };
		String[] array0 = new String[] { "million", "thousand", "dollar", "cent" };

		double num = 0;

		Scanner scan = new Scanner(System.in);

		String text = "You have: ", a = "hundred";

		System.out.println("How much money do you have? ");
		num = scan.nextDouble();

		if (num >= 0.01 && num < 1000000000) {
			int[] array1 = new int[] { 0, 0, 0, 0 };

			array1[0] = (int) num / 1000000;

			array1[1] = (int) num % 1000000 / 1000;

			array1[2] = (int) num % 1000;

			array1[3] = (int) (num * 100 % 100);

			for (int i = 0; i < 4; i++) {
				if (array1[i] > 0) {

					if (array1[i] / 100 > 1) {
						a = a + "s";
					}

					if (array1[i] > 100) {
						a += " ";
						text = text + array[array1[i] / 100] + a;
					}

					if (array1[i] > 1) {
						array0[i] += "s ";
					} else {
						array0[i] += " ";
					}

					if (array1[i] % 100 < 20) {
						text = text + array[array1[i] % 100] + array0[i];
					} else {
						text = text + array[array1[i] % 100 / 10 + 18] + array[(int) (array1[i] % 10)] + array0[i];
					}

					a = "hundred";
				}
			}

		} else if (num == 0) {
			text = text + "ZERO dollars... Maybe you should start working...";
		} else {
			System.out.println("!!! 0.01 <= number < 1 000 000 000 !!!");
		}

		System.out.println(text);

	}

}
