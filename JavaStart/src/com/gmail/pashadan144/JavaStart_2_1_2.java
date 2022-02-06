package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_2_1_2 {

	/*
	 * 2)Написать программу которая вычислит и выведет на экран площадь треугольника
	 * если известны его стороны.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x, a, b, c, p;

		System.out.println("Введите значение первой стороны в см - ");
		a = scan.nextDouble();

		System.out.println("Введите значение второй стороны в см - ");
		b = scan.nextDouble();

		System.out.println("Введите значение третьей стороны в см - ");
		c = scan.nextDouble();

		p = (a + b + c) / 2;

		x = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println("Ответ: S =");
		System.out.println(x);

	}
}
