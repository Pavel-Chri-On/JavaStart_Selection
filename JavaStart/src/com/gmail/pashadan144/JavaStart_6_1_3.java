package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_6_1_3 {
	public static void main(String[] args) {

		/*
		 * 3) Реализуйте метод рисующий на экране прямоугольник из звездочек «*» — его
		 * параметрами будут целые числа которые описывают длину и ширину такого
		 * прямоугольника.
		 */

		System.out.print("Ширина - ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.print("Длина - ");
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();

		drawRectangle(a, b);

	}

	static void drawRectangle(int a, int b) {
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				if (i == 0 || i == b - 1 || j == 0 || j == a - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}

			}
			System.out.println();
		}
	}

}
