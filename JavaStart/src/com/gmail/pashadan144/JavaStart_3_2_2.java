package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_3_2_2 {

	/*
	 * 2) Дан треугольник координаты вершин А(0,0), В(4,4), С(6,1). Пользователь
	 * вводит с клавиатуры координаты точки x и y. Написать программу которая
	 * определит лежит ли эта точка внутри треугольника или нет.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0, num2 = 0, num3 = 0;

		System.out.println("x = ");
		double x = sc.nextDouble();

		System.out.println("y = ");
		double y = sc.nextDouble();

		num1 = (0 - x) * (4 - 0) - (4 - 0) * (0 - y);
		num2 = (4 - x) * (1 - 4) - (6 - 4) * (4 - y);
		num3 = (6 - x) * (0 - 1) - (0 - 6) * (1 - y);

		if ((num1 >= 0 && num2 >= 0 && num3 >= 0) || (num1 <= 0 && num2 <= 0 && num3 <= 0)) {
			System.out.println("Точка внутри треугольника");
		} else
			System.out.println("Точка вне треугольника");
	}
	
}