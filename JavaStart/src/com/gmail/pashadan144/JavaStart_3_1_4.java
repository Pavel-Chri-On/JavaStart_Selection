package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_3_1_4 {

	/*
	 * 4) Треугольник существует только тогда, когда сумма любых двух его сторон
	 * больше третьей. Дано: a, b, c – стороны предполагаемого треугольника.
	 * Напишите программу которая укажет существует такой треугольник или нет.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c;

		System.out.println("Сторона a = ");
		a = scan.nextInt();

		System.out.println("Сторона b = ");
		b = scan.nextInt();

		System.out.println("Сторона c = ");
		c = scan.nextInt();

		if (a + b > c && a + c > b && c + b > a) {
			System.out.println("Такой треугольник существует");
		} else {
			System.out.println("Такого треугольника не существует");
		}
	}
}