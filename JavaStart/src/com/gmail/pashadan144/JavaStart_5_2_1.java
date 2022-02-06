package com.gmail.pashadan144;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStart_5_2_1 {
	/*
	 * 1) «Перевернуть массив». Т.е. написать программу которая повернет базовый
	 * массив на 90,180,270 градусов по часовой стрелке. (При выполнении задания
	 * использовать дополнительный массив нельзя). В примере показан поворот на 90
	 * градусов
	 */

	public static void main(String[] args) {
		int[][] array = new int[][] { { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 },
				{ 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 } };

		Scanner scan = new Scanner(System.in);
		int x = 0, y = 0, gr = 0;

		System.out.println("На сколько градусов повернуть массив? (90,180,270) - ");
		gr = scan.nextInt();

		if (gr == 90) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length - 1 - i; j++) {
					y = array[i][1 + i + j];
					x = array[1 + i + j][i];

					array[i][1 + i + j] = x;
					array[1 + i + j][i] = y;
				}
			}

		} else if (gr == 180) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length / 2; j++) {
					y = array[i][array.length - 1 - j];
					x = array[i][j];

					array[i][array.length - 1 - j] = x;
					array[i][j] = y;
				}
			}

		} else if (gr == 270) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length - i - 1; j++) {
					y = array[array.length - j - 1][array.length - i - 1];
					x = array[i][j];

					array[i][j] = y;
					array[array.length - j - 1][array.length - i - 1] = x;
				}
			}

		} else {
			System.out.println("Массив можно поверуть ТОЛЬКО на 90, 180, 270 градусов!");
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}

}
