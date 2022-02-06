package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_3_1_3 {

	/*
	 * 3) ќпределить количество дней в году, который вводит пользователь. ¬
	 * високосном годе - 366 дней, тогда как в обычном 365. ¬исокосный год
	 * определ€етс€ по следующему правилу: √од високосный, если он делитс€ на четыре
	 * без остатка, но если он делитс€ на 100 без остатка, это не високосный год.
	 * ќднако, если он делитс€ без остатка на 400, это високосный год.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year;

		System.out.println("¬ведите год - ");
		year = scan.nextInt();
		
		if ((year % 4) == 0 && (year % 100) > 0) {
			System.out.println("¬исокосный год, 366 дней");
		} else if ((year % 400) == 0) {
			System.out.println("¬исокосный год, 366 дней");
		} else {
			System.out.println("Ќе високосный год, 365 дней");
		}

	}
}