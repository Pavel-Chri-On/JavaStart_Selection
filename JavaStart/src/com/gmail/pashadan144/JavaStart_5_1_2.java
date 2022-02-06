package com.gmail.pashadan144;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStart_5_1_2 {

	/*
	 * 2) Написать код для возможности создания массива целых чисел (размер
	 * вводиться с клавиатуры) и возможности заполнения каждого его элемента
	 * вручную. Выведите этот массив на экран.
	 */

	public static void main(String[] args) {
		int x = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Размер массива - ");
		x = scan.nextInt();
		
		int[] array = new int[x];
		
		for (int i = 0; i < x; i++) {
			System.out.println("Введите " + (i + 1) + " элемент массива");
			array[i] = scan.nextInt();
		}
		
		System.out.println("Ваш массив - " + Arrays.toString(array));
	}

}