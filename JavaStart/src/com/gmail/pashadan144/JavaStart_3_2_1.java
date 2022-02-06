package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_3_2_1 {

	/*
	 * 1) Есть круг с центром в начале координат и радиусом 4. Пользователь вводит с
	 * клавиатуры координаты точки x и y. Написать программу которая определит лежит
	 * ли эта точка внутри круга или нет.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x, y;
		
		System.out.println("x - ");
		x = scan.nextInt();
		
		System.out.println("y - ");
		y = scan.nextInt();
		
		if (Math.pow(x,2) + Math.pow(y,2) < 16) {
			System.out.println("Точка лежит внутри круга");
		} else {
			System.out.println("Точка не лежит внутри круга");

		}
	}
}