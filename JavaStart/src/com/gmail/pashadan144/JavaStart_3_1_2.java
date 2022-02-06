package com.gmail.pashadan144;

import java.util.Scanner;

public class JavaStart_3_1_2 {

	/*
	 * 2) Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда начинается с
	 * единицы. На одном этаже 4 квартиры. Напишите программу которая получит номер
	 * квартиры с клавиатуры, и выведет на экран на каком этаже, какого подъезда
	 * расположенна эта квартира. Если такой квартиры нет в этом доме то нужно
	 * сообщить об этом пользователю.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N, x;

		System.out.println("Номер квартиры - ");
		N = scan.nextInt();

		if (N > 0 && N < 145) {
			if (N < 37) {
				System.out.println("Подъезд №1");
			} else if (N < 73) {
				System.out.println("Подъезд №2");
			} else if (N < 109) {
				System.out.println("Подъезд №3");
			} else if (N < 145) {
				System.out.println("Подъезд №4");
			}

			x = N % 36 / 4;

			if (0 < x && x <= 1) {
				System.out.println("Этаж №1");
			} else if (0 < x && x <= 2) {
				System.out.println("Этаж №2");
			} else if (0 < x && x <= 3) {
				System.out.println("Этаж №3");
			} else if (0 < x && x <= 4) {
				System.out.println("Этаж №4");
			} else if (0 < x && x <= 5) {
				System.out.println("Этаж №5");
			} else if (0 < x && x <= 6) {
				System.out.println("Этаж №6");
			} else if (0 < x && x <= 7) {
				System.out.println("Этаж №7");
			} else if (0 < x && x <= 8) {
				System.out.println("Этаж №8");
			} else if (x <= 9) {
				System.out.println("Этаж №9");
			}
		} else {
			System.out.println("Такой квартиры не существует");
		}

	}
}