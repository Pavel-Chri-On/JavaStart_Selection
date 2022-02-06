package com.gmail.pashadan144;

public class JavaStart_4_2_2 {
	
	public static void main(String[] args) {
		int x = 100, y = 0, a = 0;

		for (int i = 2; i <= x; i++) {
			y = 1;
			for (int j = 3; j < i; j++) {

				if (i % (i - y) == 0) {
					a = 1;
					break;
				}
				y += 1;
			}
			if (a == 0) {
				System.out.println(i);
			}
			a = 0;
		}
	}

}

/*
 * Для всех i от 2 до 100 (проверить, делится ли число i на какое-либо из чисел
 * до него если делится, то это i не подходит, берём следующее если не делится,
 * то i - простое число)
 */