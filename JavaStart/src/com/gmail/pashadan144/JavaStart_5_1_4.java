package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_5_1_4 {

	/*
	 * 4) ¬ведите строку текста с клавиатуры Ч реализуйте программу дл€ возможности
	 * подсчета количества символа Ч 'b' в этой строке, с выводом результат на
	 * экран.
	 */

	public static void main(String[] args) {
		int x = 0;

		Scanner scan = new Scanner(System.in);

		String text = "";

		System.out.println("¬ведите строку (без пробелов) - ");
		text = scan.next();

		String[] t = text.toLowerCase().split(""); /* ƒобавил перевод строки к нижнему регистру */

		for (String temp : t) {
			if (temp.indexOf("b") == 0) {
				x += 1;
			}
		}
		System.out.println(" оличества символа 'b' - " + x);
	}

}