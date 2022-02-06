package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_3_1_1 {

	/*
	 * Написать программу которая считает 4 числа c клавиатуры и выведет на экран
	 * самое большое из них.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num1, num2, num3, num4, x;

		System.out.println("Введите первое число - ");
		num1 = scan.nextDouble();

		System.out.println("Введите второе число - ");
		num2 = scan.nextDouble();

		System.out.println("Введите третье число - ");
		num3 = scan.nextDouble();

		System.out.println("Введите четвертое число - ");
		num4 = scan.nextDouble();

		if (num1 > num2 && num1 > num3 && num1 > num4) {
			x = num1;
		} else if (num2 > num1 && num2 > num3 && num2 > num4) {
			x = num2;
		} else if (num3 > num1 && num3 > num2 && num3 > num4) {
			x = num3;
		} else if (num4 > num1 && num4 > num2 && num4 > num3) {
			x = num4;
		} else {  	/* P.S. На всякий случай*/
			x = 0; 
		}

		System.out.println("Ответ: наибольшое число - ");
		System.out.println(x);

	}
}