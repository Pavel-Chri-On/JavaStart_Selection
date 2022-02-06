package com.gmail.pashadan144;

import java.util.Arrays;
import java.util.Random;

public class JavaStart_5_1_3 {

	/*
	 * 3) Создать массив случайных чисел (размером 15 элементов). Создайте второй
	 * массив в два раза больше, первые 15 элементов должны быть равны элементам
	 * первого массива, а остальные элементы заполнить удвоенных значением
	 * начальных.
	 */

	public static void main(String[] args) {

		int[] array = new int[15], array2 = new int[array.length * 2];
		int y = 0;

		Random random = new Random();

		for (int i = 0; i < array.length; i++) { /* Массив случайных чисел */
			array[i] = random.nextInt(100);
		}

		for (int i = 0; i < array.length * 2;) {/* Генератор второго массива */
			if (i >= array.length) {
				array2[i] = array[y] * 2;
				y += 1;
			} else {
				array2[i] = array[i];
			}
			i += 1;

		}
		System.out.println("Вот ваш массив - " + Arrays.toString(array2));
	}

}