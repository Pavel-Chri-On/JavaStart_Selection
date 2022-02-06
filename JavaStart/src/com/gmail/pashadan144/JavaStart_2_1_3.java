package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_2_1_3 {

	/*
	 * 3)Написать программу которая вычислит и выведет на экран длину окружности,
	 * если ее радиус считывается с клавиатуры.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x, r;

		System.out.println("Введите радиус окружности - ");
		r = scan.nextDouble();

		x = 2 * Math.PI * r;

		System.out.println("Ответ: L =");
		System.out.println(x);

	}
}